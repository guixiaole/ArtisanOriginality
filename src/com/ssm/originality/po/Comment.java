package com.ssm.originality.po;

public class Comment {
    private Integer commentId;

    private String title;

    private Byte commentDetaile;

    private String content;

    private Integer parentId;

    private Double scoreAvg;

    private String commentTime;

    private Integer proId;

    private Integer acId;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getCommentDetaile() {
        return commentDetaile;
    }

    public void setCommentDetaile(Byte commentDetaile) {
        this.commentDetaile = commentDetaile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Double getScoreAvg() {
        return scoreAvg;
    }

    public void setScoreAvg(Double scoreAvg) {
        this.scoreAvg = scoreAvg;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime == null ? null : commentTime.trim();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }
}