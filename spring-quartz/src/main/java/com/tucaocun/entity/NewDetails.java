package com.tucaocun.entity;

import java.util.Date;

public class NewDetails {
    private String id;

    private String newId;

    private String serviceFullTitle;

    private String serviceImg;

    private String servicePdateSrc;

    private String serviceImgWidth;

    private String serviceSrc;

    private String servicePdate;

    private String serviceImgLength;

    private String serviceTitle;

    private String serviceContent;

    private String serviceUrl;

    private String createTime;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNewId() {
        return newId;
    }

    public void setNewId(String newId) {
        this.newId = newId == null ? null : newId.trim();
    }

    public String getServiceFullTitle() {
        return serviceFullTitle;
    }

    public void setServiceFullTitle(String serviceFullTitle) {
        this.serviceFullTitle = serviceFullTitle == null ? null : serviceFullTitle.trim();
    }

    public String getServiceImg() {
        return serviceImg;
    }

    public void setServiceImg(String serviceImg) {
        this.serviceImg = serviceImg == null ? null : serviceImg.trim();
    }

    public String getServicePdateSrc() {
        return servicePdateSrc;
    }

    public void setServicePdateSrc(String servicePdateSrc) {
        this.servicePdateSrc = servicePdateSrc == null ? null : servicePdateSrc.trim();
    }

    public String getServiceImgWidth() {
        return serviceImgWidth;
    }

    public void setServiceImgWidth(String serviceImgWidth) {
        this.serviceImgWidth = serviceImgWidth == null ? null : serviceImgWidth.trim();
    }

    public String getServiceSrc() {
        return serviceSrc;
    }

    public void setServiceSrc(String serviceSrc) {
        this.serviceSrc = serviceSrc == null ? null : serviceSrc.trim();
    }

    public String getServicePdate() {
        return servicePdate;
    }

    public void setServicePdate(String servicePdate) {
        this.servicePdate = servicePdate == null ? null : servicePdate.trim();
    }

    public String getServiceImgLength() {
        return serviceImgLength;
    }

    public void setServiceImgLength(String serviceImgLength) {
        this.serviceImgLength = serviceImgLength == null ? null : serviceImgLength.trim();
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle == null ? null : serviceTitle.trim();
    }

    public String getServiceContent() {
        return serviceContent;
    }

    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent == null ? null : serviceContent.trim();
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl == null ? null : serviceUrl.trim();
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