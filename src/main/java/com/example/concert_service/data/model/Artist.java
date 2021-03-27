package com.example.concert_service.data.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "artists", schema = "public")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer artistId;
    private String artistName;
    private String country;

    @OneToOne
    @JoinColumn(name = "file_id")
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(artistName, artist.artistName) &&
                Objects.equals(country, artist.country) &&
                Objects.equals(file, artist.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName, country, file);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
