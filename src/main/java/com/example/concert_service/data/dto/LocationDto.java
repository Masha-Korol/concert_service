package com.example.concert_service.data.dto;

import java.util.Objects;

public class LocationDto {

    private String country;
    private String city;

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
        LocationDto that = (LocationDto) o;
        return Objects.equals(country, that.country) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public String toString() {
        return "LocationDto{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
