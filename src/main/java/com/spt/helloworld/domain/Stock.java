package com.spt.helloworld.domain;

import java.io.Serializable;

public class Stock implements Serializable {
    private Integer gId;

    private String sName;

    private Integer sCount;

    private Double sPrice;

    private String unit;

    private String type;

    private String isGo;

    private Integer zId;

    private static final long serialVersionUID = 1L;

    public Stock() {
    }

    public Stock(Integer gId, String sName, Integer sCount, Double sPrice, String unit, String type, String isGo, Integer zId) {
        this.gId = gId;
        this.sName = sName;
        this.sCount = sCount;
        this.sPrice = sPrice;
        this.unit = unit;
        this.type = type;
        this.isGo = isGo;
        this.zId = zId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsCount() {
        return sCount;
    }

    public void setsCount(Integer sCount) {
        this.sCount = sCount;
    }

    public Double getsPrice() {
        return sPrice;
    }

    public void setsPrice(Double sPrice) {
        this.sPrice = sPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIsGo() {
        return isGo;
    }

    public void setIsGo(String isGo) {
        this.isGo = isGo == null ? null : isGo.trim();
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }
}