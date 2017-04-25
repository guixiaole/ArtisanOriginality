package com.ssm.originality.po;

public class ReturnStatus {
    private Integer returnStatusId;

    private String name;

    public Integer getReturnStatusId() {
        return returnStatusId;
    }

    public void setReturnStatusId(Integer returnStatusId) {
        this.returnStatusId = returnStatusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}