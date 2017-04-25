package com.ssm.originality.po;

public class Picture {
    private Integer picId;

    private Integer proId;

    private Byte picSize;

    private String picUrl;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Byte getPicSize() {
        return picSize;
    }

    public void setPicSize(Byte picSize) {
        this.picSize = picSize;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }
}