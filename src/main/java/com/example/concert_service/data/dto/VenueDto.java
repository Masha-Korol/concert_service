package com.example.concert_service.data.dto;

import java.util.Objects;

public class VenueDto {

    private String venueName;
    private Integer locationId;

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
        VenueDto venueDto = (VenueDto) o;
        return Objects.equals(venueName, venueDto.venueName) &&
                Objects.equals(locationId, venueDto.locationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueName, locationId);
    }

    @Override
    public String toString() {
        return "VenueDto{" +
                "venueName='" + venueName + '\'' +
                ", locationId=" + locationId +
                '}';
    }
}
