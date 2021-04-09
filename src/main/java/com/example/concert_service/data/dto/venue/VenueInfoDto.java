package com.example.concert_service.data.dto.venue;

import com.example.concert_service.data.dto.location.LocationInfoDto;

import java.util.Objects;

public class VenueInfoDto {

    private Integer venueId;
    private String venueName;
    private LocationInfoDto location;

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public LocationInfoDto getLocation() {
        return location;
    }

    public void setLocation(LocationInfoDto location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VenueInfoDto that = (VenueInfoDto) o;
        return Objects.equals(venueName, that.venueName) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueName, location);
    }

    @Override
    public String toString() {
        return "VenueInfoDto{" +
                "venueName='" + venueName + '\'' +
                ", locationInfoDto=" + location +
                '}';
    }
}
