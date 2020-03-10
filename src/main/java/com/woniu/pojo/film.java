package com.woniu.pojo;

public class film {
    private Integer filmId;

    private Integer yearId;

    private Integer areaId;

    private String filmName;

    private String imgAddress;

    private Float filmScore;

    private String filmStatus;

    private String filmLength;

    private Integer directorId;

    private Integer filmHot;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName == null ? null : filmName.trim();
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress == null ? null : imgAddress.trim();
    }

    public Float getFilmScore() {
        return filmScore;
    }

    public void setFilmScore(Float filmScore) {
        this.filmScore = filmScore;
    }

    public String getFilmStatus() {
        return filmStatus;
    }

    public void setFilmStatus(String filmStatus) {
        this.filmStatus = filmStatus == null ? null : filmStatus.trim();
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength == null ? null : filmLength.trim();
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }

    public Integer getFilmHot() {
        return filmHot;
    }

    public void setFilmHot(Integer filmHot) {
        this.filmHot = filmHot;
    }
}