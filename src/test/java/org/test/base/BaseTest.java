package org.test.base;

import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.fiberhome.common.config.Constants;
import org.test.SSLClient;

public class BaseTest
{
//    public static String rootUrl = "http://127.0.0.1:8080/platform-web";
    public static String rootUrl = "http://172.16.36.199:8080/platform-cmt-web"; 
    public static String TOKEN = "0IpwNqOvGU72zY0NSG88IA==";
    public static String publickeyUrl = rootUrl + "/app/publickey";
    public static String CUSTOMID = "424f09d8-9298-4e6b-9335-778bd5f9f386";
    
//    public static String rootUrl = "http://58.240.20.226:9080/plateform-web";
    public String exeHttpGet(String url,String...params) throws Exception{
        DefaultHttpClient client = new SSLClient();
        HttpMethod method = new GetMethod();
        method.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
        method.setRequestHeader("Cookie", "special_cookie=value");
        
        HttpGet pkey = new HttpGet(url);
        StringBuilder sb =new StringBuilder(Constants.REQUEST_COME_FORM+"="+"iphone;");
        sb.append("APP_NAME=zhgz;");
        if(params!=null && params.length==2){
            sb.append(Constants.ACCESS_TOKEN+"="+ params[0]+";");
            sb.append(Constants.CUSTOM_ID+"="+ params[1]+";");
        }
        pkey.setHeader("Cookie", sb.toString());
        pkey.setHeader(Constants.X_CLIENT_HEADER,sb.toString());
        HttpResponse response = client.execute(pkey);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
        return result;
    }
    
    public String exeHttpPost(String url,String json,String...params)throws Exception{
        DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        StringBuilder sb =new StringBuilder(Constants.REQUEST_COME_FORM+"="+"iphone;");
        sb.append("APP_NAME=zhgz;");
        if(params!=null && params.length==2){
            sb.append(Constants.ACCESS_TOKEN+"="+ params[0]+";");
            sb.append(Constants.CUSTOM_ID+"="+ params[1]+";");
        }
        post.setHeader(Constants.X_CLIENT_HEADER,sb.toString());
        post.addHeader("Cookie", sb.toString());
        StringEntity se = new StringEntity(json,"utf-8");
        se.setContentType("application/json;charset=UTF-8");
        se.setContentEncoding("UTF-8");
        post.setEntity(se);
        HttpResponse response = client.execute(post);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
        return result;
    }
    
    public String getPublicKey() throws Exception
    {
        return exeHttpGet(publickeyUrl);
    }
}
