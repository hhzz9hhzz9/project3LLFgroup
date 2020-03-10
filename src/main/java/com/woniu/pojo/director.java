package com.woniu.pojo;

public class director {
    private Integer directorId;

    private String directorName;

    private String directorDesc;

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName == null ? null : directorName.trim();
    }

    public String getDirectorDesc() {
        return directorDesc;
    }

    public void setDirectorDesc(String directorDesc) {
        this.directorDesc = directorDesc == null ? null : directorDesc.trim();
    }
}