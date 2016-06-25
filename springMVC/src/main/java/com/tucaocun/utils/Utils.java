package com.tucaocun.utils;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

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
    public static StringBuffer getChinese() throws Exception {
    	StringBuffer str = new StringBuffer();
    	int highPos, lowPos;
    	//seed = new Date().getTime();
    	Random rand = new Random();
    	int nextInt = rand.nextInt(4)+1;
    	for (int i = 0; i < nextInt; i++) {
    		Random random = new Random((long)(rand.nextInt(999)));
    		highPos = (176 + Math.abs(random.nextInt(39)));
    		lowPos = 161 + Math.abs(random.nextInt(93));
    		byte[] b = new byte[2];
    		b[0] = (new Integer(highPos)).byteValue();
    		b[1] = (new Integer(lowPos)).byteValue();
    		str.append(new String(b, "GB2312"));
    	}

    	return str;
    	}
    
    /**
	 *
	 *@param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int rand(int min, int max) {
		return (int)((max - min + 1) * Math.random() + min);
	}
	
		public static String randomIDCard() {
			String a = Integer.toString(Utils.rand(110000, 650999));
			
			String yy = Integer.toString(Utils.rand(1950, 2000));
			String mm = Integer.toString(Utils.rand(3, 12));
			String dd = Integer.toString(Utils.rand(1, 30));
			if (mm.length() != 2) {
				mm = "0" + mm;
			}
			if (dd.length() != 2) {
				dd = "0" + dd;
			}
			
			String b = Integer.toString(Utils.rand(0, 999));
			if (b.length() == 1) {
				b = "00" + b;
			}
			else if (b.length() == 2) {
				b = "0" + b;
			}
			
			String s = a + yy + mm + dd + b;
			//System.out.println(s);
			
			int[] nums = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
			int m = 0;
			for (int i = 0; i < s.length(); i++) {
				String c = s.substring(i, i + 1);
				int n = Integer.parseInt(c);
				int n2 = nums[i];
				m += n * n2;
			}
			m = m % 11;
			
			String[] codes = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
			String code = codes[m];
			s += code;
			return s;
		}
		
		/**
		  * 
		  * @param length
		  * @return
		  */
		 public static String getCharAndNumr(int length) {
		  String val = "";
		  Random random = new Random();
		  for (int i = 0; i < length; i++) {
		   String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; 
		   if ("char".equalsIgnoreCase(charOrNum)) {
		    int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; 
		    val += (char) (choice + random.nextInt(26));
		   } else if ("num".equalsIgnoreCase(charOrNum)) { // ����
		    val += String.valueOf(random.nextInt(10));
		   }
		  }
		  return val;
		 }
}
