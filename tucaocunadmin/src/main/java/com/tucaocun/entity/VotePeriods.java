package com.tucaocun.entity;

import java.util.Date;

public class VotePeriods {
    private String id;

    private String userId;

    private Integer voteNo;

    private Integer havaVote;

    private Integer oppositionVote;

    private String votePosition;

    private String createTime;

    private Date changeTime;

    private String voteTxt;

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

    public Integer getVoteNo() {
        return voteNo;
    }

    public void setVoteNo(Integer voteNo) {
        this.voteNo = voteNo;
    }

    public Integer getHavaVote() {
        return havaVote;
    }

    public void setHavaVote(Integer havaVote) {
        this.havaVote = havaVote;
    }

    public Integer getOppositionVote() {
        return oppositionVote;
    }

    public void setOppositionVote(Integer oppositionVote) {
        this.oppositionVote = oppositionVote;
    }

    public String getVotePosition() {
        return votePosition;
    }

    public void setVotePosition(String votePosition) {
        this.votePosition = votePosition == null ? null : votePosition.trim();
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

    public String getVoteTxt() {
        return voteTxt;
    }

    public void setVoteTxt(String voteTxt) {
        this.voteTxt = voteTxt == null ? null : voteTxt.trim();
    }
}