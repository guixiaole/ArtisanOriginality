package com.ssm.originality.po;

public class Car {
    private Integer caId;

    private Integer acId;

    private Integer totalNum;

    private String addTime;

    private Integer proId;

    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }
}