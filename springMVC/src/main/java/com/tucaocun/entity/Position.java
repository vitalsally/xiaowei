package com.tucaocun.entity;

import java.io.Serializable;
import java.util.Date;

public class Position implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -168409966036338896L;

	private String id;

    private String positionName;

    private String positionGroup;

    private Integer positionLv;

    private Integer isDel;

    private Integer isChange;

    private String changeId;

    private Date createTime;

    private String createBy;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getPositionGroup() {
        return positionGroup;
    }

    public void setPositionGroup(String positionGroup) {
        this.positionGroup = positionGroup == null ? null : positionGroup.trim();
    }

    public Integer getPositionLv() {
        return positionLv;
    }

    public void setPositionLv(Integer positionLv) {
        this.positionLv = positionLv;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId == null ? null : changeId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}