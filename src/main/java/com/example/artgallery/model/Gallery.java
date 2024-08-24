package com.example.artgallery.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "gallery")
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int galleryId;
    @Column(name = "name")
    private String galleryName;
    @Column(name = "location")
    private String location;
    @ManyToMany(mappedBy = "galleries")
    @JsonIgnoreProperties("galleries")
    private ArrayList<Artist> artists = new ArrayList<>();

    public Gallery() {
    }

    public int getGalleryId() {
        return this.galleryId;
    }

    public void setGalleryId(int galleryId) {
        this.galleryId = galleryId;
    }

    public String getGalleryName() {
        return galleryName;
    }

    public void setGalleryName(String galleryName) {
        this.galleryName = galleryName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Artist> getArtists() {
        return this.artists;
    }

    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }
}