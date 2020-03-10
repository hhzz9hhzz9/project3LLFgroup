package com.woniu.pojo;

public class speaker {
    private Integer speakerId;

    private Integer filmId;

    private Integer userId;

    private String speakerContext;

    private Integer speakerStatus;

    private Float userFilmSocore;

    public Integer getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(Integer speakerId) {
        this.speakerId = speakerId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSpeakerContext() {
        return speakerContext;
    }

    public void setSpeakerContext(String speakerContext) {
        this.speakerContext = speakerContext == null ? null : speakerContext.trim();
    }

    public Integer getSpeakerStatus() {
        return speakerStatus;
    }

    public void setSpeakerStatus(Integer speakerStatus) {
        this.speakerStatus = speakerStatus;
    }

    public Float getUserFilmSocore() {
        return userFilmSocore;
    }

    public void setUserFilmSocore(Float userFilmSocore) {
        this.userFilmSocore = userFilmSocore;
    }
}