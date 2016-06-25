package com.tucaocun.entity;

import java.util.Date;

public class Cun {
    private String id;

    private String cunName;

    private String cunCall;

    private String createBy;

    private String createTime;

    private String cunAlong;

    private Integer isChange;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCunName() {
        return cunName;
    }

    public void setCunName(String cunName) {
        this.cunName = cunName == null ? null : cunName.trim();
    }

    public String getCunCall() {
        return cunCall;
    }

    public void setCunCall(String cunCall) {
        this.cunCall = cunCall == null ? null : cunCall.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCunAlong() {
        return cunAlong;
    }

    public void setCunAlong(String cunAlong) {
        this.cunAlong = cunAlong == null ? null : cunAlong.trim();
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}