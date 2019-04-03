package com.spt.helloworld.domain;

import java.io.Serializable;

public class OrdContent implements Serializable {
    private Integer conId;

    private Integer oNumber;

    private String gName;

    private Integer gCount;

    private static final long serialVersionUID = 1L;

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Integer getoNumber() {
        return oNumber;
    }

    public void setoNumber(Integer oNumber) {
        this.oNumber = oNumber;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Integer getgCount() {
        return gCount;
    }

    public void setgCount(Integer gCount) {
        this.gCount = gCount;
    }
}