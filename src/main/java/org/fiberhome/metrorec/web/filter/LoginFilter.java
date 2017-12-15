package org.fiberhome.metrorec.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.fiberhome.common.config.Constants;
import org.fiberhome.common.util.DataUtil;
import org.fiberhome.common.util.LoginUtil;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * 获取header中的登陆信息
 * 
 * @author mf
 * @version C01 2016年10月2日
 */
public class LoginFilter implements Filter {

    public LoginFilter() {
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        HttpServletRequest hrequest = (HttpServletRequest) request;
        /** 获取header */
        String headers = hrequest.getHeader(Constants.X_CLIENT_HEADER);
        System.out.println("X-FiberHome-Client:"+headers);
        if (DataUtil.isEmpty(headers)) {
            String userToken = hrequest.getParameter(Constants.ACCESS_TOKEN);
            String sourceType = hrequest.getParameter(Constants.REQUEST_COME_FORM);
            String customId = hrequest.getParameter(Constants.CUSTOM_ID);
            if (!DataUtil.isEmpty(userToken)) {
                userToken = userToken.replaceAll(" ", "+");
            }
            JSONObject josn = new JSONObject();
            josn.put(Constants.CUSTOM_ID, customId);
            josn.put(Constants.ACCESS_TOKEN, userToken);
            josn.put(Constants.REQUEST_COME_FORM, sourceType);
            LoginUtil.set(josn);
        }
        else {
            JSONObject header = DataUtil.getHeader(headers);
            LoginUtil.set(header);
        }
        try {
            chain.doFilter(request, response);
        }
        finally {
            LoginUtil.remove();
        }
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
    }

}
