package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResults {
    @JsonProperty("city")
    private String city;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("title")
    private String title;

    public SearchResults(){}


    public SearchResults(String city, String kind, String title){
        this.city = city;
        this.kind = kind;
        this.title = title;
    }

    public String getCity(){ return city; }
    public String getKind(){ return kind; }
    public String getTitle(){ return title; }
}