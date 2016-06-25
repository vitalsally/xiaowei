package com.tucaocun.entity;

import java.io.Serializable;
import java.util.Date;

public class CunUser  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4214994402966159800L;

	private String id;

    private String cunId;

    private String userId;

    private Integer isChange;

    private String createTime;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCunId() {
        return cunId;
    }

    public void setCunId(String cunId) {
        this.cunId = cunId == null ? null : cunId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}