package org.test;

import org.apache.commons.codec.binary.Base64;
import org.fiberhome.common.security.RSACoder;
import org.junit.Test;
import org.test.base.BaseTest;

import com.alibaba.fastjson.JSONObject;

public class UserTest extends BaseTest {

    protected String BaseUrl = "http://172.16.36.199:6080/platform-web";

    public static String TOKEN = "0IpwNqOvGU72zY0NSG88IA==";

    public static String CUSTOMID = "424f09d8-9298-4e6b-9335-778bd5f9f386";

    @Test
    public void getCode() throws Exception {
//        JSONObject json = new JSONObject();
//        json.put("phone", "13951673462");
//        exeHttpPost(BaseUrl + "/app/initCode", json.toJSONString());
    }
    
    @Test
    public void validateCode() throws Exception {
//        exeHttpGet(BaseUrl+"/app/publickey");
//        System.out.println("1111");
//        "".split(",");
        String [] aa = "222*333".split("\\*");
        System.out.println(aa[0]+","+aa[1]);
    }

    @Test
    public void register() throws Exception {
        JSONObject json = new JSONObject();
        // json.put("", value)
//"publickey":"MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIK7xbxOgtqL8ItMcAtRtQ7Ny+Yhhl/qE4BUKt9U+D33S1udy5hiUyEBX7uPMawpHNM/3NnuIZDGbW3i9FgNAQ8CAwEAAQ=="
        String publickey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBANeWVXFEU+usQYKLpIczNeBxHa5Xc6n6eW3e8ulM09AIH3gKUc/21lBHd9x3Et39+JPQdz2WGWYEC5E1ZOhFnFMCAwEAAQ==";
        String userNamePwd = "13951580514&123456";
        byte [] encodeData = RSACoder.encryptByPublicKey(userNamePwd.getBytes(), Base64.decodeBase64(publickey));
        String encodeStr = Base64.encodeBase64String(encodeData);
        json.put("phone", "13951673462");
        json.put("code", "1111");
//        json.put("data", encodeStr);
//        json.put("publickey", publickey);
        System.out.println(json.toJSONString());
        exeHttpPost(BaseUrl + "/users/phoneLogin", json.toJSONString());
    }
}
