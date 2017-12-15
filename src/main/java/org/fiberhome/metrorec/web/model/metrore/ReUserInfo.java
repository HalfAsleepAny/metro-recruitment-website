package org.fiberhome.metrorec.web.model.metrore;

import java.util.Date;
import javax.persistence.*;

@Table(name = "RE_USER_INFO")
public class ReUserInfo {
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "ID_NUMBER")
    private String idNumber;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "EMAIL")
    private String email;

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
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return ID_NUMBER
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return MOBILE
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
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