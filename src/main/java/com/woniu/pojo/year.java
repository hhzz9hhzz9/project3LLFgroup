package com.woniu.pojo;

public class year {
    private Integer yearId;

    private String yearName;

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName == null ? null : yearName.trim();
    }
}