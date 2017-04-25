package com.ssm.originality.po;

public class Story {
    private Integer storyId;

    private Integer adId;

    private Integer aId;

    private Integer shId;

    private Integer proId;

    private String storyTitle;

    private String storyContent;

    private String storyTime;

    public Integer getStoryId() {
        return storyId;
    }

    public void setStoryId(Integer storyId) {
        this.storyId = storyId;
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

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle == null ? null : storyTitle.trim();
    }

    public String getStoryContent() {
        return storyContent;
    }

    public void setStoryContent(String storyContent) {
        this.storyContent = storyContent == null ? null : storyContent.trim();
    }

    public String getStoryTime() {
        return storyTime;
    }

    public void setStoryTime(String storyTime) {
        this.storyTime = storyTime == null ? null : storyTime.trim();
    }
}