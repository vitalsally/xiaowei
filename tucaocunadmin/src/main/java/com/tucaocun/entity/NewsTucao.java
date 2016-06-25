package com.tucaocun.entity;

import java.util.Date;

public class NewsTucao {
    private String id;

    private String newsId;

    private Integer support;

    private Integer opposition;

    private String tucaoId;

    private Integer isDel;

    private String userId;

    private String createTime;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getOpposition() {
        return opposition;
    }

    public void setOpposition(Integer opposition) {
        this.opposition = opposition;
    }

    public String getTucaoId() {
        return tucaoId;
    }

    public void setTucaoId(String tucaoId) {
        this.tucaoId = tucaoId == null ? null : tucaoId.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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
}