package com.tucaocun.entity;

import java.util.Date;

public class WeiTucao {
    private String id;

    private String userId;

    private String centontId;

    private String tucaoId;

    private String createTime;

    private Integer isDel;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCentontId() {
        return centontId;
    }

    public void setCentontId(String centontId) {
        this.centontId = centontId == null ? null : centontId.trim();
    }

    public String getTucaoId() {
        return tucaoId;
    }

    public void setTucaoId(String tucaoId) {
        this.tucaoId = tucaoId == null ? null : tucaoId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}