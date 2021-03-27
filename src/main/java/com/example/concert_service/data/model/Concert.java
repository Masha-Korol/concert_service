package com.example.concert_service.data.model;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.*;

@Entity
@Table(name = "concerts", schema = "public")
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer concertId;
    @Column(columnDefinition = "DATE")
    private Date eventDate;
    @Column(columnDefinition = "DATE")
    private LocalTime startTime;
    @Column(columnDefinition = "VARCHAR")
    private ConcertStatus status;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

    @OneToOne
    @JoinColumn(name = "file_id")
    private File file;

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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return Objects.equals(eventDate, concert.eventDate) &&
                Objects.equals(startTime, concert.startTime) &&
                status == concert.status &&
                Objects.equals(artist, concert.artist) &&
                Objects.equals(venue, concert.venue) &&
                Objects.equals(file, concert.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventDate, startTime, status, artist, venue, file);
    }

    @Override
    public String toString() {
        return "Concert{" +
                "concertId=" + concertId +
                ", eventDate=" + eventDate +
                ", startTime=" + startTime +
                ", status=" + status +
                ", artist=" + artist +
                ", venue=" + venue +
                ", file=" + file +
                '}';
    }
}
