package com.example.concert_service.data.dto.concert;

import com.example.concert_service.data.dto.artist.ArtistInfoDto;
import com.example.concert_service.data.dto.venue.VenueInfoDto;
import com.example.concert_service.data.model.ConcertStatus;

import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class ConcertInfoDto {

    private Integer concertId;
    private Date eventDate;
    private LocalTime startTime;
    private ConcertStatus status;
    private ArtistInfoDto artist;
    private VenueInfoDto venue;

    public Integer getConcertId() {
        return concertId;
    }

    public void setConcertId(Integer concertId) {
        this.concertId = concertId;
    }

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

    public ArtistInfoDto getArtist() {
        return artist;
    }

    public void setArtist(ArtistInfoDto artist) {
        this.artist = artist;
    }

    public VenueInfoDto getVenue() {
        return venue;
    }

    public void setVenue(VenueInfoDto venue) {
        this.venue = venue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcertInfoDto that = (ConcertInfoDto) o;
        return Objects.equals(eventDate, that.eventDate) &&
                Objects.equals(startTime, that.startTime) &&
                status == that.status &&
                Objects.equals(artist, that.artist) &&
                Objects.equals(venue, that.venue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(concertId, eventDate, startTime, status, artist, venue);
    }

    @Override
    public String toString() {
        return "ConcertInfoDto{" +
                "concertId=" + concertId +
                ", eventDate=" + eventDate +
                ", startTime=" + startTime +
                ", status=" + status +
                ", artistInfoDto=" + artist +
                ", venueInfoDto=" + venue +
                '}';
    }
}
