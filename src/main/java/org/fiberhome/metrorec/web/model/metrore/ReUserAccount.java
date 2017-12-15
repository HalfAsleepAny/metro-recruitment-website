package org.fiberhome.metrorec.web.model.metrore;

import java.util.Date;
import javax.persistence.*;

@Table(name = "RE_USER_ACCOUNT")
public class ReUserAccount {
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Column(name = "USER_GUID")
    private String userGuid;

    @Column(name = "LOGIN_ACCOUNT")
    private String loginAccount;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * @return UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return USER_GUID
     */
    public String getUserGuid() {
        return userGuid;
    }

    /**
     * @param userGuid
     */
    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    /**
     * @return LOGIN_ACCOUNT
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * @param loginAccount
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}