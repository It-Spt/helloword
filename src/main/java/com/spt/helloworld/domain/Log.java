package com.spt.helloworld.domain;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    private Integer lId;

    private String lMoney;

    private Date lDate;

    private Integer zId;

    private String lMethod;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlMoney() {
        return lMoney;
    }

    public void setlMoney(String lMoney) {
        this.lMoney = lMoney == null ? null : lMoney.trim();
    }

    public Date getlDate() {
        return lDate;
    }

    public void setlDate(Date lDate) {
        this.lDate = lDate;
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public String getlMethod() {
        return lMethod;
    }

    public void setlMethod(String lMethod) {
        this.lMethod = lMethod == null ? null : lMethod.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}