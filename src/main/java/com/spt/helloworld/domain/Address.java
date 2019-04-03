package com.spt.helloworld.domain;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer addressId;

    private Integer zId;

    private String province;

    private String city;

    private String area;

    private String deAddress;

    private static final long serialVersionUID = 1L;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getDeAddress() {
        return deAddress;
    }

    public void setDeAddress(String deAddress) {
        this.deAddress = deAddress == null ? null : deAddress.trim();
    }
}