package com.tucaocun.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8621406414187043307L;

	private String id;

    private String name;

    private String pwd;

    private String idCard;

    private String realName;

    private String cunId;

    private String lv;

    private Integer havaVote;

    private Integer punishmentVote;

    private String zhifubao;

    private Integer isDel;

    private Integer isLimit;

    private String registerTime;

    private Integer activeDegree;

    private Date changeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCunId() {
        return cunId;
    }

    public void setCunId(String cunId) {
        this.cunId = cunId == null ? null : cunId.trim();
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv == null ? null : lv.trim();
    }

    public Integer getHavaVote() {
        return havaVote;
    }

    public void setHavaVote(Integer havaVote) {
        this.havaVote = havaVote;
    }

    public Integer getPunishmentVote() {
        return punishmentVote;
    }

    public void setPunishmentVote(Integer punishmentVote) {
        this.punishmentVote = punishmentVote;
    }

    public String getZhifubao() {
        return zhifubao;
    }

    public void setZhifubao(String zhifubao) {
        this.zhifubao = zhifubao == null ? null : zhifubao.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsLimit() {
        return isLimit;
    }

    public void setIsLimit(Integer isLimit) {
        this.isLimit = isLimit;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public Integer getActiveDegree() {
        return activeDegree;
    }

    public void setActiveDegree(Integer activeDegree) {
        this.activeDegree = activeDegree;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}