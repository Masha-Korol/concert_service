package com.example.concert_service.data.dto.concert;

import com.example.concert_service.data.model.ConcertStatus;

import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class ConcertCreationDto {

    private Date eventDate;
    private LocalTime startTime;
    private ConcertStatus status;
    private Integer artistId;
    private Integer venueId;

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public ConcertStatus getStatus() {
        return status;
    }

    public void setStatus(ConcertStatus status) {
        this.status = status;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcertCreationDto that = (ConcertCreationDto) o;
        return Objects.equals(eventDate, that.eventDate) &&
                Objects.equals(startTime, that.startTime) &&
                status == that.status &&
                Objects.equals(artistId, that.artistId) &&
                Objects.equals(venueId, that.venueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventDate, startTime, status, artistId, venueId);
    }

    @Override
    public String toString() {
        return "ConcertDto{" +
                "eventDate=" + eventDate +
                ", startTime=" + startTime +
                ", status=" + status +
                ", artistId=" + artistId +
                ", venueId=" + venueId +
                '}';
    }
}
