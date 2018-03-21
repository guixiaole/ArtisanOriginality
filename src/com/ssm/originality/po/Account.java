package com.ssm.originality.po;

public class Account {
    private Integer acId;

    private Integer aId;

    private Integer cId;

    private String username;

    private String password;

    private String head;

    private String balance;

    private String ip;

    private String addTime;

    private String acphone;

    private String acemail;

 
   

	public Integer getAcId() {
		return acId;
	}

	public void setAcId(Integer acId) {
		this.acId = acId;
	}

	public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public String getAcphone() {
        return acphone;
    }

    public void setAcphone(String acphone) {
        this.acphone = acphone == null ? null : acphone.trim();
    }

    public String getAcemail() {
        return acemail;
    }

    public void setAcemail(String acemail) {
        this.acemail = acemail == null ? null : acemail.trim();
    }

	@Override
	public String toString() {
		return "Account [acId=" + acId + ", aId=" + aId + ", cId=" + cId + ", username=" + username + ", password="
				+ password + ", head=" + head + ", balance=" + balance + ", ip=" + ip + ", addTime=" + addTime
				+ ", acphone=" + acphone + ", acemail=" + acemail + "]";
	}

	

	
}