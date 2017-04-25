package com.ssm.originality.po;

public class Video {
    private Integer videoId;

    private Double videoSize;

    private String videoUrl;

    private Integer adId;

    private Integer aId;

    private Integer shId;

    private Integer proId;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Double getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(Double videoSize) {
        this.videoSize = videoSize;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
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
}