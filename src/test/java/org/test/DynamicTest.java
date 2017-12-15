package org.test;

import java.math.BigDecimal;

import org.fiberhome.cmt.dto.sys.SysAppConfigVo;
import org.junit.Test;
import org.test.base.BaseTest;

import com.alibaba.fastjson.JSON;

public class DynamicTest extends BaseTest {

    protected String BaseUrl = "http://127.0.0.1:8080/platform-cmt-web";

    @Test
    public void dynamicList() throws Exception {
        // exeHttpGet(BaseUrl+"/community/menuItems?blockCode=FH00100001000010000100009&menuId=3");
        // exeHttpGet(BaseUrl+"/community/articles/list");
        // exeHttpGet(BaseUrl+"/community/articles/detail?guid=3","22","111");
        // exeHttpGet(BaseUrl+"/community/notices/list?blockCode=FH0010000100001000010000900003");
        // exeHttpGet(BaseUrl+"/community/notices/detail?guid=10388045-afcc-11e6-85df-1418773311c9");
        // exeHttpGet(BaseUrl+"/community/activitys/list?blockCode=FH00100001000010000100007");
        // exeHttpGet(BaseUrl+"/community/activitys/detail?guid=7e9bad15-28f3-41fe-85f8-5b95243fcd2f");
        // exeHttpGet(BaseUrl+"/homeCenter/serverItems?blockCode=FH00100001000010000100009&hcCode=AB011");
        // exeHttpGet(BaseUrl+"/homeCenter/detailItem?hcCode=A&itemCode=11");
        // exeHttpGet(BaseUrl+"/app/publickey");
        // exeHttpGet(BaseUrl+"/community/searchBlock");
        // exeHttpGet(BaseUrl+"/community/index?blockCode=FH0010000100001000010000900003");
        // exeHttpGet(BaseUrl+"/person//bloodPressures",
        // "QmTgVrojXrbTK9PGequoFA==","7ff123e9-3828-4ffb-9967-49cdc98e14a6");
        // exeHttpGet(BaseUrl+"/person/myBespeaks/list",
        // "","6a02918e-3909-42e1-99bd-256f82f15116");
        // exeHttpGet(BaseUrl+"/person/myBespeaks/detail?guid=7d70c0d2-b07d-11e6-85df-1418773311c9",
        // "","6a02918e-3909-42e1-99bd-256f82f15116");
        // exeHttpGet(BaseUrl+"/person/myActivitys",
        // "","6a02918e-3909-42e1-99bd-256f82f15116");
        // exeHttpGet(BaseUrl+"/person/myCollectNotices",
        // "","6a02918e-3909-42e1-99bd-256f82f15116");
        // exeHttpGet(BaseUrl+"/community/helps/list");
        // exeHttpGet("http://172.16.34.231/gap/nodes?event=1");
        // exeHttpPost(BaseUrl+"/users/modifyPassword","");
        // exeHttpGet(BaseUrl+"/person/myCollectArticles","0fshHPTNe6rXGn1iM33WPA==","a03ea50e-73c1-437b-8806-5d6e9a84cb3b");
//        JSONObject json = new JSONObject();
//        json.put("itemGuid", "397bc9f4-a874-4175-a735-60c5c438d897");
//        json.put("itemType", "2");
//        json.put("addressId", "394d1040-48c7-48ee-b166-707bae96efbc");
//        json.put("disGuid", "1");
//        json.put("serviceDate", "2019-09-09 17:00-18:00");
//        String json = "{\"addressId\":\"1870524c-b932-4d94-b1d6-807e7b38bb90\",\"deliveryTime\":\"2017-02-13 19:37\",\"mealNum\":\"2\",\"remark\":\"\",\"disGuid\":\"\",\"blockCode\":\"FH00100001000010000100007\",\"dishs\":[{\"guid\":\"2717a68d-f1ca-11e6-a937-1418773311ca\",\"number\":1}]}";
//         exeHttpPost(BaseUrl+"/dishs/createOrder", json,
//         "8pXIS52S1OvXF962R0Q5Zw==","ec9eaac9-b36d-41ed-bcd8-088687f98fa2");
//        exeHttpGet(BaseUrl + "/homeCenter/detailOrder?orderGuid=f4f05876af394b2998aea858dd3d6bdd", "0fshHPTNe6rXGn1iM33WPA==",
//                "ec9eaac9-b36d-41ed-bcd8-088687f98fa2");
//        json.put("orderGuid", "d5b227f29afc48269fcf5a884b932c3f");
//        json.put("payWay", 2);
//        json.put("orderType", 1);
//        exeHttpPost(BaseUrl+"/hcPay/payOrder", json.toJSONString(),
//              "0fshHPTNe6rXGn1iM33WPA==","ec9eaac9-b36d-41ed-bcd8-088687f98fa2");
        BigDecimal num = new BigDecimal(0);
        System.out.println(num.multiply(new BigDecimal(3)));
    }

}
