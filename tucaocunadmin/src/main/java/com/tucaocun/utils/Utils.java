package com.tucaocun.utils;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2016/5/25.
 */
public class Utils {

   public static UUID getUUID(){
       UUID uuid = UUID.randomUUID();
       return  uuid;
   }

    /**
     * yyyMMddHHmmssSSS
     * @return
     */
    public static  String getNewTimeSetId(){
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String newTime = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(date);
        return newTime;
    }


    /**
     * yyy-MM-dd HH:mm:ss
     * @return
     */
    public static  String getNewTime(){
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String newTime = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss:SSS").format(date);
        return newTime;
    }
    
    /**
     * 
     * @param seed
     * @return
     * @throws Exception
     */
    public static String getChinese(long seed) throws Exception {
    	String str = null;
    	int highPos, lowPos;
    	//seed = new Date().getTime();
    	Random random = new Random(seed);
    	highPos = (176 + Math.abs(random.nextInt(39)));
    	lowPos = 161 + Math.abs(random.nextInt(93));
    	byte[] b = new byte[2];
    	b[0] = (new Integer(highPos)).byteValue();
    	b[1] = (new Integer(lowPos)).byteValue();
    	str = new String(b, "UTF-8");
    	return str;
    	}

}
