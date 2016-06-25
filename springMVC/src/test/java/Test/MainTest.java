package Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tucaocun.entity.Cun;
import com.tucaocun.pool.WorkPool;
import com.tucaocun.pool.WorkPoolBean;

public class MainTest {

	public static void main(String[] args) {
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
		WorkPool wp = new WorkPool("1 ", "*2");
		Future<?> submit = newFixedThreadPool.submit(wp);
		try {
			System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(submit.get()));
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newFixedThreadPool.shutdown();
//		public static ExecutorService newWorkStealingPool(int parallelism){}
		
//		for (int i = 0; i < 100; i++) {
//			WorkPool wp = new WorkPool(i+"1 ", "*2");
//			new Thread(wp).start();
//			
//			Callable<Cun> temp = new WorkPoolBean(i+" a ", " * b");
//			
//			FutureTask<Cun> future =new FutureTask<Cun>(temp);
//			new Thread(future).start();
//		}
		
//		for (int i = 0; i < 100; i++) {
//			Callable<Cun> temp = new WorkPoolBean();
//			FutureTask<Cun> future =new FutureTask<Cun>(temp);
//			new Thread(future).start();
//		}
	}

}
