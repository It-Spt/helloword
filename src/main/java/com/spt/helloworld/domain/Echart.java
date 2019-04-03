package com.spt.helloworld.domain;

import java.io.Serializable;

public class Echart implements Serializable {

    private Object[] names;
    private Object[] counts;

    public Echart() {
    }

    public Echart(Object[] names, Object[] counts) {
        this.names = names;
        this.counts = counts;
    }

    public Object[] getNames() {
        return names;
    }

    public void setNames(Object[] names) {
        this.names = names;
    }

    public Object[] getCounts() {
        return counts;
    }

    public void setCounts(Object[] counts) {
        this.counts = counts;
    }
}
