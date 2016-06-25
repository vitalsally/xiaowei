package com.tucaocun;

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
import com.google.gson.Gson;

public class Demo {

    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
 
    //閰嶇疆鎮ㄧ敵璇风殑KEY
    public static final String APPKEY ="285f8192cf65ce7840d4d78949f6b283";
 
    //1.鏂伴椈妫�绱�
    public static void getRequest1(String newsWord){
        String result =null;
        String url ="http://op.juhe.cn/onebox/news/query";
        Map params = new HashMap();
            params.put("q",newsWord);
            params.put("key",APPKEY);
            params.put("dtype","json");
 
        try {
            result =net(url, params, "GET");
            Map<String, Object> object = (Map<String, Object>) JSONObject.parseObject(result, Map.class);
            if(Integer.valueOf(String.valueOf(object.get("error_code"))).intValue() == 0){
                System.out.println(object.get("result"));
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
  
    public static void getRequest2(){
        String result =null;
        String url ="http://op.juhe.cn/onebox/news/words";
        Map params = new HashMap();
            params.put("key",APPKEY);
            params.put("dtype","");
 
        try {
            result =net(url, params, "GET");
            Map<String, Object> object = (Map<String, Object>) JSONObject.parseObject(result, Map.class);
            Object code = object.get("error_code");
            if(code != null){
            	if(Integer.valueOf(String.valueOf(code)).intValue() == 0){
                    System.out.println(object.get("result"));
                }else{
                    System.out.println(object.get("error_code")+":"+object.get("reason"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
 
 
    public static void main(String[] args) {
    	getRequest2();
    	getRequest1("女老师求婚男同学");
 
    }
    
//    ["韩国务总理将访华","吴宗宪被判刑","日本流行极简主义","女老师求婚男同学","好声音转椅改战车","柳岩深夜发写真","台女主唱命丧火场","94岁纳粹获刑","3少女被强行带走","司机暗语提醒乘客","骑士惊天逆转夺冠","5具尸骸藏6年","温碧霞比基尼照","光头杨幂美翻","母亲狂殴狮子救儿","霍
//     建华林心如合体","管虎力挺吴亦凡","发现80公斤太岁","张艺兴性感登封面","日6.5万人赶美军","水库炸出1吨巨蟒","中国为尼泊尔印币","中大奖误认是骗局","神威计算机夺冠","杜海涛谈吴昕","近50人晋升将军","iphone6侵权","鞭赶孩子挑战天梯","男子长4个肾","超模拼人体花朵","4
//     天捕10头鲨鱼","医生退休当人贩","孙俪晒书法作品","宋一国曝三胞胎照","银行奇葩考核","2016法国欧洲杯","伊能静录制胎动","安徽宿松暴雨","吊车失控撞16车","周杰伦合作张惠妹","李克强建行考察","法国勒芒耐力赛","前驻法大使去世","上海电影节落幕"]
 
    
//    ["女子带前夫改嫁","最大飞机今年完工","日车站显示屏出错","张家界海市蜃楼","纽约举行夏至瑜伽","千人进村挖红宝石","多省鼓励2.5天假","宿舍产子闺蜜接生","45小时跑完六环","日本流行极简主义","安东尤金车祸去世","汪小菲被批","公务员总数首披露","好声音转椅改战车","柳岩深夜发写真"
//     ,"女毒贩劫持5人质","女老师求婚男同学","马航370遗物照","司机暗语提醒乘客","台女主唱命丧火场","疑吴亦凡语音曝光","大暴雨袭击合肥","私家车遭钢珠袭击","3少女被强行带走","5具尸骸藏6年","94岁纳粹获刑","女子悬挂3楼被砸","江西河堤溃口","中国互联网大会","光头杨幂美翻","骑
//     士惊天逆转夺冠","霍建华林心如合体","发现80公斤太岁","母亲狂殴狮子救儿","管虎力挺吴亦凡","水库炸出1吨巨蟒","首对双胞熊猫诞生","神威计算机夺冠","宋一国曝三胞胎照","iphone6侵权","银行奇葩考核","2016法国欧洲杯","安徽宿松暴雨","法国勒芒耐力赛","前驻法大使去世"]
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
 
    //灏唌ap鍨嬭浆涓鸿姹傚弬鏁板瀷
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
