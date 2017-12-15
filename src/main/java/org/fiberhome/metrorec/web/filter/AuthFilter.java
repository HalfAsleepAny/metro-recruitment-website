package org.fiberhome.metrorec.web.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fiberhome.tool.base.RestResponse;
import org.fiberhome.tool.exception.AuthException;
import org.fiberhome.tool.utils.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

@Component
@WebFilter(filterName = "authFilter", urlPatterns = "/*")
public class AuthFilter implements Filter {
	@Autowired
  

    @Override
    public void destroy() {
        System.out.println("------------------销毁---------------------");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
        throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String url = request.getRequestURI();
        if(url.startsWith("/position/")){
            if (url.contains("sendVerifyCode") || url.contains("login") ) {// 发送验证码，登陆不需要验证
                chain.doFilter(request, response);
            }
            else {
            	String customId=getHeaderInfo(request).get("CUSTOM_ID");
                if (DataUtil.isEmpty(customId)) {
                    onLoginFail(response);
                    return;
                }
                System.out.println(customId);
//                FhEmployee fhEmployee = fhEmployeeService.selectFhEmployee(customId);
                if (true) {
                    onLoginFail(response);
                }
                else {
                	JSONObject json = new JSONObject();
                    json.put("userId", customId);
                    Session.getSession().setSession(json);
                    try {
                        chain.doFilter(request, response);
                    }
                    finally {
                        Session.getSession().remove();
                    }
                }
            }
        }

    }
    private Map<String, String>getHeaderInfo(HttpServletRequest request){
    	Map<String, String>map=new HashMap<String, String>();
    	String headers = request.getHeader("X-FiberHome-Client");
        String[]headerstr=headers.split(";");
        for (int i = 0; i < headerstr.length; i++) {
        	String[] headerstrStr=headerstr[i].split("=");
        	String key="";
        	String value="";
        	if(headerstrStr.length==2){
        		key=headerstrStr[0];
        		value=headerstrStr[1];
        	}else{
        		key=headerstrStr[0];
        		value="";
        	}
			map.put(key, value);
		}
    	return map;
    }
    private void onLoginFail(HttpServletResponse httpResponse) throws IOException {
        RestResponse response = new RestResponse(new AuthException("权限错误"));
        response.setCode("2");
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setContentType("application/json;charset=UTF-8");
        byte[] bytes = JSON.toJSONBytes(response, SerializerFeature.DisableCircularReferenceDetect);
        ServletOutputStream os = httpResponse.getOutputStream();
        os.write(bytes);
        os.flush();
        os.close();
    }

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("------------------初始化---------------------");
		
	}
}
