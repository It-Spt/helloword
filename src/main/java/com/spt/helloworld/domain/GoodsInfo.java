package com.spt.helloworld.domain;

import java.io.Serializable;
import java.util.Date;

public class GoodsInfo implements Serializable {
    private Integer gId;

    private String gName;

    private Double gPrice;

    private String fType;

    private Date gTime;

    private String gDesc;

    private PictureInfo pictureInfo;

    private static final long serialVersionUID = 1L;

    public PictureInfo getPictureInfo() {
        return pictureInfo;
    }

    public void setPictureInfo(PictureInfo pictureInfo) {
        this.pictureInfo = pictureInfo;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Double getgPrice() {
        return gPrice;
    }

    public void setgPrice(Double gPrice) {
        this.gPrice = gPrice;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType == null ? null : fType.trim();
    }

    public Date getgTime() {
        return gTime;
    }

    public void setgTime(Date gTime) {
        this.gTime = gTime;
    }

    public String getgDesc() {
        return gDesc;
    }

    public void setgDesc(String gDesc) {
        this.gDesc = gDesc == null ? null : gDesc.trim();
    }
}