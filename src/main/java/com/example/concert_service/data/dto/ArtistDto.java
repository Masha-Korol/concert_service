package com.example.concert_service.data.dto;

import java.util.Objects;

public class ArtistDto {

    private String artistName;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtistDto artistDto = (ArtistDto) o;
        return Objects.equals(artistName, artistDto.artistName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName);
    }

    @Override
    public String toString() {
        return "ArtistDto{" +
                "artistName='" + artistName + '\'' +
                '}';
    }
}
