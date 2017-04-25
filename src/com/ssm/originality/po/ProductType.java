package com.ssm.originality.po;

public class ProductType {
    private Integer proTypeId;

    private String proTypeName;

    public Integer getProTypeId() {
        return proTypeId;
    }

    public void setProTypeId(Integer proTypeId) {
        this.proTypeId = proTypeId;
    }

    public String getProTypeName() {
        return proTypeName;
    }

    public void setProTypeName(String proTypeName) {
        this.proTypeName = proTypeName == null ? null : proTypeName.trim();
    }
}