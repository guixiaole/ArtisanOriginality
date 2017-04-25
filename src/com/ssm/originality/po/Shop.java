package com.ssm.originality.po;

public class Shop {
    private Integer shId;

    private String shname;

    private Integer aId;

    private String shaddress;

    private Integer shtel;

    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
    }

    public String getShname() {
        return shname;
    }

    public void setShname(String shname) {
        this.shname = shname == null ? null : shname.trim();
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getShaddress() {
        return shaddress;
    }

    public void setShaddress(String shaddress) {
        this.shaddress = shaddress == null ? null : shaddress.trim();
    }

    public Integer getShtel() {
        return shtel;
    }

    public void setShtel(Integer shtel) {
        this.shtel = shtel;
    }
}