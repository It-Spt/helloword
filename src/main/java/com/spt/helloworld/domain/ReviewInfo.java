package com.spt.helloworld.domain;

import java.io.Serializable;

public class ReviewInfo implements Serializable {
    private Integer reId;

    private Integer zId;

    private String reContext;

    private String state;

    private static final long serialVersionUID = 1L;

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public String getReContext() {
        return reContext;
    }

    public void setReContext(String reContext) {
        this.reContext = reContext == null ? null : reContext.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}