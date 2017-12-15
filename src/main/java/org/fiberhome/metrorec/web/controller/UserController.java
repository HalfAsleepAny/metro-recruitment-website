package org.fiberhome.metrorec.web.controller;

import org.fiberhome.tool.base.RestResponse;
import org.fiberhome.tool.utils.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping(value="metroHrUser")
public class UserController {
	@Value("${is.pic.url}")
	private String filesUrl;
	
    @Autowired
//    private CsHomeCenterService csHomeCenterService;
    
   
    
    /**
     * 新闻详情
     * @param hcCode
     * @return
     */
    @RequestMapping(value = "getNewDateil", method = RequestMethod.GET)
    public Object getNewDateil(String guid) {
    	JSONObject obj = new JSONObject();
    	PageParam page=new PageParam();
    	page.setPageSize(3);
//    	obj.put("csArticle", csArticle);
        return new RestResponse(obj);
    }
    
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public Object hello(String username) {
    	return username;
    }
    
}
