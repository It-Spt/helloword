package com.spt.helloworld.domain;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer zId;

    private String loginName;

    private String passwords;

    private String uname;

    private String zName;

    private String email;

    private String phone;

    private String power;

    private String isMonery;

    private static final long serialVersionUID = 1L;

    public Users() {
    }

    public Users(Integer zId, String loginName, String passwords, String uname, String zName, String email, String phone, String power, String isMonery) {
        this.zId = zId;
        this.loginName = loginName;
        this.passwords = passwords;
        this.uname = uname;
        this.zName = zName;
        this.email = email;
        this.phone = phone;
        this.power = power;
        this.isMonery = isMonery;
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords == null ? null : passwords.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getzName() {
        return zName;
    }

    public void setzName(String zName) {
        this.zName = zName == null ? null : zName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public String getIsMonery() {
        return isMonery;
    }

    public void setIsMonery(String isMonery) {
        this.isMonery = isMonery == null ? null : isMonery.trim();
    }
}