package com.ssm.originality.po;

public class Delivery {
    private Integer deId;

    private Integer acId;

    private String deProvince;

    private String deCity;

    private String deCountry;

    private String consignee;

    private String address;

    private Integer dePhone;

    private String deEmail;

    private Integer postCode;

    private String addTime;

    private Byte idDefault;

    public Integer getDeId() {
        return deId;
    }

    public void setDeId(Integer deId) {
        this.deId = deId;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getDeProvince() {
        return deProvince;
    }

    public void setDeProvince(String deProvince) {
        this.deProvince = deProvince == null ? null : deProvince.trim();
    }

    public String getDeCity() {
        return deCity;
    }

    public void setDeCity(String deCity) {
        this.deCity = deCity == null ? null : deCity.trim();
    }

    public String getDeCountry() {
        return deCountry;
    }

    public void setDeCountry(String deCountry) {
        this.deCountry = deCountry == null ? null : deCountry.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getDePhone() {
        return dePhone;
    }

    public void setDePhone(Integer dePhone) {
        this.dePhone = dePhone;
    }

    public String getDeEmail() {
        return deEmail;
    }

    public void setDeEmail(String deEmail) {
        this.deEmail = deEmail == null ? null : deEmail.trim();
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public Byte getIdDefault() {
        return idDefault;
    }

    public void setIdDefault(Byte idDefault) {
        this.idDefault = idDefault;
    }
}