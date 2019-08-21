package com.phonecard.bean;

public class City {
    private Integer id;

    private String cityName;

    private Integer citySort;

    private String reserve;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getCitySort() {
        return citySort;
    }

    public void setCitySort(Integer citySort) {
        this.citySort = citySort;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve == null ? null : reserve.trim();
    }
}