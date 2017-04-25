package com.ssm.originality.po;

public class Collect {
    private Integer collectId;

    private Integer shId;

    private Integer proId;

    private String collectTime;

    private Integer acId;

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime == null ? null : collectTime.trim();
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }
}