package org.fiberhome.metrorec.web.config;

import javax.servlet.http.HttpServletRequest;

import org.fiberhome.tool.base.RestResponse;
import org.fiberhome.tool.exception.AuthException;
import org.fiberhome.tool.exception.SysRunException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHander {

	private static Logger log = LoggerFactory.getLogger(ExceptionHander.class);

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Object handerException(HttpServletRequest req, Exception e) {
		if (e instanceof AuthException) {
			log.error(e.getMessage());
			return new RestResponse(e);
		} else if (e instanceof SysRunException) {
			log.error(e.getMessage());
			return new RestResponse(e);
		} else if (e instanceof DataAccessException) {
			log.error("数据库异常", e);
			return new RestResponse(new SysRunException("系统异常"));
		} else {
			log.error("", e);
			return new RestResponse(new SysRunException("系统异常"));
		}
	}
}
