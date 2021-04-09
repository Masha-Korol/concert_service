package com.example.concert_service.data.dto.venue;

import java.util.Objects;

public class VenueCreationDto {

    private Integer venueId;
    private String venueName;
    private Integer locationId;

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

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VenueCreationDto that = (VenueCreationDto) o;
        return Objects.equals(venueId, that.venueId) &&
                Objects.equals(venueName, that.venueName) &&
                Objects.equals(locationId, that.locationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueId, venueName, locationId);
    }

    @Override
    public String toString() {
        return "VenueCreationDto{" +
                "venueId=" + venueId +
                ", venueName='" + venueName + '\'' +
                ", locationId=" + locationId +
                '}';
    }
}
