package org.fiberhome.metrorec.web.filter;

import com.alibaba.fastjson.JSONObject;

public class Session {

	private ThreadLocal<JSONObject> session = new ThreadLocal<JSONObject>();

	private static Session ses = new Session();

	private Session() {
	};

	public void setSession(JSONObject json) {
		session.set(json);
	}

	public Long getUserId() {
		return session.get().getLong("userId");
	}

	public String getCompanyCode() {
		return session.get().getString("companyCode");
	}

	public String getPicUrl() {
		return session.get().getString("picUrl");
	}

	public static Session getSession() {
		return ses;
	}

	public void remove() {
		session.remove();
	}
}
