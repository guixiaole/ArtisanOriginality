package com.ssm.originality.po;

public class OrderReturn {
    private Integer orderReturnId;

    private Integer returnId;

    private Integer oId;

    private Double returnPayable;

    private Integer acId;

    private String consignee;

    private Integer returnPhone;

    private String returnAddress;

    private String returnProvince;

    private String returnCity;

    private String returnCountry;

    private Integer returnStatusId;

    private Double salePrice;

    private String returnRemark;

    private String returnTime;

    private String returnReason;

    private Double customPrice;

    public Integer getOrderReturnId() {
        return orderReturnId;
    }

    public void setOrderReturnId(Integer orderReturnId) {
        this.orderReturnId = orderReturnId;
    }

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Double getReturnPayable() {
        return returnPayable;
    }

    public void setReturnPayable(Double returnPayable) {
        this.returnPayable = returnPayable;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public Integer getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(Integer returnPhone) {
        this.returnPhone = returnPhone;
    }

    public String getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(String returnAddress) {
        this.returnAddress = returnAddress == null ? null : returnAddress.trim();
    }

    public String getReturnProvince() {
        return returnProvince;
    }

    public void setReturnProvince(String returnProvince) {
        this.returnProvince = returnProvince == null ? null : returnProvince.trim();
    }

    public String getReturnCity() {
        return returnCity;
    }

    public void setReturnCity(String returnCity) {
        this.returnCity = returnCity == null ? null : returnCity.trim();
    }

    public String getReturnCountry() {
        return returnCountry;
    }

    public void setReturnCountry(String returnCountry) {
        this.returnCountry = returnCountry == null ? null : returnCountry.trim();
    }

    public Integer getReturnStatusId() {
        return returnStatusId;
    }

    public void setReturnStatusId(Integer returnStatusId) {
        this.returnStatusId = returnStatusId;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getReturnRemark() {
        return returnRemark;
    }

    public void setReturnRemark(String returnRemark) {
        this.returnRemark = returnRemark == null ? null : returnRemark.trim();
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime == null ? null : returnTime.trim();
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public Double getCustomPrice() {
        return customPrice;
    }

    public void setCustomPrice(Double customPrice) {
        this.customPrice = customPrice;
    }
}