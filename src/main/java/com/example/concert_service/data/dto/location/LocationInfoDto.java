package com.example.concert_service.data.dto.location;

import java.util.Objects;

public class LocationInfoDto {

    private Integer locationId;
    private String country;
    private String city;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationInfoDto that = (LocationInfoDto) o;
        return Objects.equals(country, that.country) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, country, city);
    }

    @Override
    public String toString() {
        return "LocationInfoDto{" +
                "locationId=" + locationId +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
