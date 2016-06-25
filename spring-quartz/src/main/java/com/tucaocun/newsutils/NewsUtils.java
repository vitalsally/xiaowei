package com.tucaocun.newsutils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class NewsUtils {
	

    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
 
    //閰嶇疆鎮ㄧ敵璇风殑KEY
    public static final String APPKEY ="285f8192cf65ce7840d4d78949f6b283";
 
    //1.鏂伴椈妫�绱�
    public static  Map<String, Object> getRequest1(String newsWord) throws Exception{
        String result =null;
        String url ="http://op.juhe.cn/onebox/news/query";
        Map params = new HashMap();
            params.put("q",newsWord);
            params.put("key",APPKEY);
            params.put("dtype","json");
 
            result =net(url, params, "GET");
            Map<String, Object> object = (Map<String, Object>) JSONObject.parseObject(result, Map.class);
//            if(Integer.valueOf(String.valueOf(object.get("error_code"))).intValue() == 0){
//                System.out.println(object.get("result"));
//            }else{
//                System.out.println(object.get("error_code")+":"+object.get("reason"));
//            }
            return object;
    }
 
  
    public static Map<String,Object> getRequest2() throws Exception{
        String result =null;
        String url ="http://op.juhe.cn/onebox/news/words";
        Map<String,Object> params = new HashMap<String,Object>();
            params.put("key",APPKEY);
            params.put("dtype","");
 
            result =net(url, params, "GET");
            Map<String, Object> object = (Map<String, Object>) JSONObject.parseObject(result, Map.class);
//            Object code = object.get("error_code");
//            if(code != null){
//            	if(Integer.valueOf(String.valueOf(code)).intValue() == 0){
//                    System.out.println(object.get("result"));
//                }else{
//                    System.out.println(object.get("error_code")+":"+object.get("reason"));
//                }
//            }
            return object;
    }
 
    /**
    *
    * @param strUrl 璇锋眰鍦板潃
    * @param params 璇锋眰鍙傛暟
    * @param method 璇锋眰鏂规硶
    * @return  缃戠粶璇锋眰瀛楃涓�
    * @throws Exception
    */
   public static String net(String strUrl, Map params,String method) throws Exception {
       HttpURLConnection conn = null;
       BufferedReader reader = null;
       String rs = null;
       try {
           StringBuffer sb = new StringBuffer();
           if(method==null || method.equals("GET")){
               strUrl = strUrl+"?"+urlencode(params);
           }
           URL url = new URL(strUrl);
           conn = (HttpURLConnection) url.openConnection();
           if(method==null || method.equals("GET")){
               conn.setRequestMethod("GET");
           }else{
               conn.setRequestMethod("POST");
               conn.setDoOutput(true);
           }
           conn.setRequestProperty("User-agent", userAgent);
           conn.setUseCaches(false);
           conn.setConnectTimeout(DEF_CONN_TIMEOUT);
           conn.setReadTimeout(DEF_READ_TIMEOUT);
           conn.setInstanceFollowRedirects(false);
           conn.connect();
           if (params!= null && method.equals("POST")) {
               try {
                   DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                       out.writeBytes(urlencode(params));
               } catch (Exception e) {
                   // TODO: handle exception
               }
           }
           InputStream is = conn.getInputStream();
           reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
           String strRead = null;
           while ((strRead = reader.readLine()) != null) {
               sb.append(strRead);
           }
           rs = sb.toString();
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if (reader != null) {
               reader.close();
           }
           if (conn != null) {
               conn.disconnect();
           }
       }
       return rs;
   }

   public static String urlencode(Map<String,Object>data) {
       StringBuilder sb = new StringBuilder();
       for (Map.Entry i : data.entrySet()) {
           try {
               sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
           } catch (UnsupportedEncodingException e) {
               e.printStackTrace();
           }
       }
       return sb.toString();
   }
	
	
 

}
