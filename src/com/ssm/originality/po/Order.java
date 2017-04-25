package com.ssm.originality.po;

public class Order {
    private Integer oId;

    private String oid;

    private Double opay;

    private String consignee;

    private String ophone;

    private String oaddress;

    private String deTime;

    private String payStatus;

    private String orderStatus;

    private String orderType;

    private Double freight;

    private Integer onumber;

    private Double proTPrice;

    private String remark;

    private Integer acId;

    private Integer proId;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Double getOpay() {
        return opay;
    }

    public void setOpay(Double opay) {
        this.opay = opay;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone == null ? null : ophone.trim();
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress == null ? null : oaddress.trim();
    }

    public String getDeTime() {
        return deTime;
    }

    public void setDeTime(String deTime) {
        this.deTime = deTime == null ? null : deTime.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public Integer getOnumber() {
        return onumber;
    }

    public void setOnumber(Integer onumber) {
        this.onumber = onumber;
    }

    public Double getProTPrice() {
        return proTPrice;
    }

    public void setProTPrice(Double proTPrice) {
        this.proTPrice = proTPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }
}