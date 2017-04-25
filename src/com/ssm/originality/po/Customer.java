package com.ssm.originality.po;

public class Customer {
    private Integer cId;

    private String cname;

    private String csex;

    private String cemail;

    private String cphone;

    private String caddress;

    private String cjob;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex == null ? null : csex.trim();
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail == null ? null : cemail.trim();
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getCjob() {
        return cjob;
    }

    public void setCjob(String cjob) {
        this.cjob = cjob == null ? null : cjob.trim();
    }
}