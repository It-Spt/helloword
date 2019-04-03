package com.spt.helloworld.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private Integer oNumber;

    private Integer zId;

    private String oAddress;

    private Double oMoney;

    private Date oDate;

    private String oStatus;

    private static final long serialVersionUID = 1L;

    public Integer getoNumber() {
        return oNumber;
    }

    public void setoNumber(Integer oNumber) {
        this.oNumber = oNumber;
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public String getoAddress() {
        return oAddress;
    }

    public void setoAddress(String oAddress) {
        this.oAddress = oAddress == null ? null : oAddress.trim();
    }

    public Double getoMoney() {
        return oMoney;
    }

    public void setoMoney(Double oMoney) {
        this.oMoney = oMoney;
    }

    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Date oDate) {
        this.oDate = oDate;
    }

    public String getoStatus() {
        return oStatus;
    }

    public void setoStatus(String oStatus) {
        this.oStatus = oStatus == null ? null : oStatus.trim();
    }
}