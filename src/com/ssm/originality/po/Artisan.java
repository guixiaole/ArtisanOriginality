package com.ssm.originality.po;

public class Artisan {
    private Integer aId;

    private String aname;

    private String asex;

    private String aemail;

    private String aphone;

    private String aaddress;

    private Integer atel;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAsex() {
        return asex;
    }

    public void setAsex(String asex) {
        this.asex = asex == null ? null : asex.trim();
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail == null ? null : aemail.trim();
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public String getAaddress() {
        return aaddress;
    }

    public void setAaddress(String aaddress) {
        this.aaddress = aaddress == null ? null : aaddress.trim();
    }

    public Integer getAtel() {
        return atel;
    }

    public void setAtel(Integer atel) {
        this.atel = atel;
    }
}