package org.fiberhome.metrorec.web.model.metrore;

import java.util.Date;
import javax.persistence.*;

@Table(name = "RE_POST_INFO")
public class RePostInfo {
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Column(name = "RECRUIT_TYPE")
    private String recruitType;

    @Column(name = "POST_TYPE_1")
    private String postType1;

    @Column(name = "POST_TYPE_2")
    private String postType2;

    @Column(name = "POST_NAME")
    private String postName;

    @Column(name = "WORK_PLACE")
    private String workPlace;

    @Column(name = "RECRUIT_NUM")
    private Short recruitNum;

    @Column(name = "WORK_EXPERIENCE")
    private String workExperience;

    @Column(name = "EDUCATION")
    private String education;

    @Column(name = "POST_DESCRIPTION")
    private String postDescription;

    @Column(name = "POST_REQUIRE")
    private String postRequire;

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @Column(name = "DEADLINE_DATE")
    private Date deadlineDate;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "IS_LIMIT")
    private String isLimit;

    @Column(name = "LIMIT_NUM")
    private Short limitNum;

    @Column(name = "STATUS")
    private String status;

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
     * @return RECRUIT_TYPE
     */
    public String getRecruitType() {
        return recruitType;
    }

    /**
     * @param recruitType
     */
    public void setRecruitType(String recruitType) {
        this.recruitType = recruitType;
    }

    /**
     * @return POST_TYPE_1
     */
    public String getPostType1() {
        return postType1;
    }

    /**
     * @param postType1
     */
    public void setPostType1(String postType1) {
        this.postType1 = postType1;
    }

    /**
     * @return POST_TYPE_2
     */
    public String getPostType2() {
        return postType2;
    }

    /**
     * @param postType2
     */
    public void setPostType2(String postType2) {
        this.postType2 = postType2;
    }

    /**
     * @return POST_NAME
     */
    public String getPostName() {
        return postName;
    }

    /**
     * @param postName
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * @return WORK_PLACE
     */
    public String getWorkPlace() {
        return workPlace;
    }

    /**
     * @param workPlace
     */
    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    /**
     * @return RECRUIT_NUM
     */
    public Short getRecruitNum() {
        return recruitNum;
    }

    /**
     * @param recruitNum
     */
    public void setRecruitNum(Short recruitNum) {
        this.recruitNum = recruitNum;
    }

    /**
     * @return WORK_EXPERIENCE
     */
    public String getWorkExperience() {
        return workExperience;
    }

    /**
     * @param workExperience
     */
    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    /**
     * @return EDUCATION
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @return POST_DESCRIPTION
     */
    public String getPostDescription() {
        return postDescription;
    }

    /**
     * @param postDescription
     */
    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    /**
     * @return POST_REQUIRE
     */
    public String getPostRequire() {
        return postRequire;
    }

    /**
     * @param postRequire
     */
    public void setPostRequire(String postRequire) {
        this.postRequire = postRequire;
    }

    /**
     * @return RELEASE_DATE
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return DEADLINE_DATE
     */
    public Date getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * @param deadlineDate
     */
    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return IS_LIMIT
     */
    public String getIsLimit() {
        return isLimit;
    }

    /**
     * @param isLimit
     */
    public void setIsLimit(String isLimit) {
        this.isLimit = isLimit;
    }

    /**
     * @return LIMIT_NUM
     */
    public Short getLimitNum() {
        return limitNum;
    }

    /**
     * @param limitNum
     */
    public void setLimitNum(Short limitNum) {
        this.limitNum = limitNum;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
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