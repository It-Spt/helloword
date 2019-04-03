package com.spt.helloworld.domain;

import java.io.Serializable;

public class EWallet implements Serializable {
    private Integer walledId;

    private Integer zId;

    private Double monery;

    private static final long serialVersionUID = 1L;

    public Integer getWalledId() {
        return walledId;
    }

    public void setWalledId(Integer walledId) {
        this.walledId = walledId;
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public Double getMonery() {
        return monery;
    }

    public void setMonery(Double monery) {
        this.monery = monery;
    }
}