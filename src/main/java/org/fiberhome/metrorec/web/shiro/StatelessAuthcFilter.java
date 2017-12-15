package org.fiberhome.metrorec.web.shiro;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.fiberhome.common.HttpCode;
import org.fiberhome.common.util.LoginUtil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class StatelessAuthcFilter extends AccessControlFilter {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
        throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        try {
            StatelessToken token = new StatelessToken(LoginUtil.getAccessToken(), LoginUtil.getUserId());
            getSubject(request, response).login(token);
        }
        catch (NumberFormatException e) {
            logger.error(e);
            onLoginFail(response, "请先登录");
            return false;
        }
        catch (Exception e) {
            logger.error(e);
            onLoginFail(response, "请重新登陆");
            return false;
        }
        return true;
    }

    /**
     * 
     * 登陆失败
     * 
     * @author mf
     * @param response
     * @param msg
     * @throws IOException
     */
    private void onLoginFail(ServletResponse response, String msg) throws IOException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        JSONObject json = new JSONObject();
        json.put("code", HttpCode.NOT_LOGIN.value());
        json.put("msg", msg);
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setContentType("application/json;charset=UTF-8");
        byte[] bytes = JSON.toJSONBytes(json, SerializerFeature.DisableCircularReferenceDetect);
        ServletOutputStream os = httpResponse.getOutputStream();
        os.write(bytes);
        os.flush();
        os.close();
    }
}
