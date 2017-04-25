package com.ssm.originality.po;

public class CashRecord {
    private Integer recordId;

    private Integer acId;

    private Double beMoney;

    private Double txMoney;

    private Double afMoney;

    private Byte txType;

    private String recordInfo;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Double getBeMoney() {
        return beMoney;
    }

    public void setBeMoney(Double beMoney) {
        this.beMoney = beMoney;
    }

    public Double getTxMoney() {
        return txMoney;
    }

    public void setTxMoney(Double txMoney) {
        this.txMoney = txMoney;
    }

    public Double getAfMoney() {
        return afMoney;
    }

    public void setAfMoney(Double afMoney) {
        this.afMoney = afMoney;
    }

    public Byte getTxType() {
        return txType;
    }

    public void setTxType(Byte txType) {
        this.txType = txType;
    }

    public String getRecordInfo() {
        return recordInfo;
    }

    public void setRecordInfo(String recordInfo) {
        this.recordInfo = recordInfo == null ? null : recordInfo.trim();
    }
}