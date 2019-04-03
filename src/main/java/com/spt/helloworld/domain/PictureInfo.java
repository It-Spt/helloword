package com.spt.helloworld.domain;

import java.io.Serializable;

public class PictureInfo implements Serializable {
    private Integer gId;

    private String gPicture;

    private static final long serialVersionUID = 1L;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgPicture() {
        return gPicture;
    }

    public void setgPicture(String gPicture) {
        this.gPicture = gPicture == null ? null : gPicture.trim();
    }
}