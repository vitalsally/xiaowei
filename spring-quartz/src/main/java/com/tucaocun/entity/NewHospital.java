package com.tucaocun.entity;

import java.io.Serializable;
import java.util.Date;

public class NewHospital  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7176804553532479024L;

	private String id;

    private String classNname;

    private String classEname;

    private String metaKeyWords;

    private String metaDescript;

    private String seoTitle;

    private String naviPic;

    private Integer isShow;

    private Integer status;

    private Integer isDel;

    private String createTime;

    private String createByUserId;

    private String changeByUserId;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassNname() {
        return classNname;
    }

    public void setClassNname(String classNname) {
        this.classNname = classNname == null ? null : classNname.trim();
    }

    public String getClassEname() {
        return classEname;
    }

    public void setClassEname(String classEname) {
        this.classEname = classEname == null ? null : classEname.trim();
    }

    public String getMetaKeyWords() {
        return metaKeyWords;
    }

    public void setMetaKeyWords(String metaKeyWords) {
        this.metaKeyWords = metaKeyWords == null ? null : metaKeyWords.trim();
    }

    public String getMetaDescript() {
        return metaDescript;
    }

    public void setMetaDescript(String metaDescript) {
        this.metaDescript = metaDescript == null ? null : metaDescript.trim();
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public String getNaviPic() {
        return naviPic;
    }

    public void setNaviPic(String naviPic) {
        this.naviPic = naviPic == null ? null : naviPic.trim();
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCreateByUserId() {
        return createByUserId;
    }

    public void setCreateByUserId(String createByUserId) {
        this.createByUserId = createByUserId == null ? null : createByUserId.trim();
    }

    public String getChangeByUserId() {
        return changeByUserId;
    }

    public void setChangeByUserId(String changeByUserId) {
        this.changeByUserId = changeByUserId == null ? null : changeByUserId.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}