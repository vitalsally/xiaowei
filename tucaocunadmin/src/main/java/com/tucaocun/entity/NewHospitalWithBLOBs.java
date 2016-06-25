package com.tucaocun.entity;

public class NewHospitalWithBLOBs extends NewHospital {
    private String naviClassUrl;

    private String naviContent;

    private String naviPosition;

    private String newsPosition;

    public String getNaviClassUrl() {
        return naviClassUrl;
    }

    public void setNaviClassUrl(String naviClassUrl) {
        this.naviClassUrl = naviClassUrl == null ? null : naviClassUrl.trim();
    }

    public String getNaviContent() {
        return naviContent;
    }

    public void setNaviContent(String naviContent) {
        this.naviContent = naviContent == null ? null : naviContent.trim();
    }

    public String getNaviPosition() {
        return naviPosition;
    }

    public void setNaviPosition(String naviPosition) {
        this.naviPosition = naviPosition == null ? null : naviPosition.trim();
    }

    public String getNewsPosition() {
        return newsPosition;
    }

    public void setNewsPosition(String newsPosition) {
        this.newsPosition = newsPosition == null ? null : newsPosition.trim();
    }
}