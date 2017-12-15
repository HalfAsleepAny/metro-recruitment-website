package org.fiberhome.metrorec.web.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class StatelessToken implements AuthenticationToken {

    private static final long serialVersionUID = -6732154105451404244L;

    private String token;

    private String customId;

    public StatelessToken(String token, String customId) {
        this.token = token;
        this.customId = customId;
    }

    @Override
    public Object getPrincipal() {
        return customId;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

}
