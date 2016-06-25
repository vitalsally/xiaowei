package com.tucaocun.entity;

import java.util.Date;

public class WeiCentont {
    private String id;

    private String userId;

    private String createTime;

    private Date changeTime;

    private String webCentont;

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

    public String getWebCentont() {
        return webCentont;
    }

    public void setWebCentont(String webCentont) {
        this.webCentont = webCentont == null ? null : webCentont.trim();
    }
}