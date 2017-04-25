package com.ssm.originality.po;

public class Admin {
    private Integer adId;

    private String adname;

    private String adsex;

    private String ademail;

    private Integer adphone;

    private String adpassword;

    private String adusername;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname == null ? null : adname.trim();
    }

    public String getAdsex() {
        return adsex;
    }

    public void setAdsex(String adsex) {
        this.adsex = adsex == null ? null : adsex.trim();
    }

    public String getAdemail() {
        return ademail;
    }

    public void setAdemail(String ademail) {
        this.ademail = ademail == null ? null : ademail.trim();
    }

    public Integer getAdphone() {
        return adphone;
    }

    public void setAdphone(Integer adphone) {
        this.adphone = adphone;
    }

    public String getAdpassword() {
        return adpassword;
    }

    public void setAdpassword(String adpassword) {
        this.adpassword = adpassword == null ? null : adpassword.trim();
    }

    public String getAdusername() {
        return adusername;
    }

    public void setAdusername(String adusername) {
        this.adusername = adusername == null ? null : adusername.trim();
    }
}