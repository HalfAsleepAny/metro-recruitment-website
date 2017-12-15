package org.fiberhome.metrorec.web.model.metrore;

import java.util.Date;
import javax.persistence.*;

@Table(name = "RE_POST_TYPE")
public class RePostType {
    @Id
    @Column(name = "UUID")
    private String uuid;

    @Column(name = "TYPE_NAME")
    private String typeName;

    @Column(name = "TYPE_ORDER")
    private Short typeOrder;

    @Column(name = "TYPE_LEVEL")
    private String typeLevel;

    @Column(name = "PARENT_GUID")
    private String parentGuid;

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
     * @return TYPE_NAME
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return TYPE_ORDER
     */
    public Short getTypeOrder() {
        return typeOrder;
    }

    /**
     * @param typeOrder
     */
    public void setTypeOrder(Short typeOrder) {
        this.typeOrder = typeOrder;
    }

    /**
     * @return TYPE_LEVEL
     */
    public String getTypeLevel() {
        return typeLevel;
    }

    /**
     * @param typeLevel
     */
    public void setTypeLevel(String typeLevel) {
        this.typeLevel = typeLevel;
    }

    /**
     * @return PARENT_GUID
     */
    public String getParentGuid() {
        return parentGuid;
    }

    /**
     * @param parentGuid
     */
    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
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