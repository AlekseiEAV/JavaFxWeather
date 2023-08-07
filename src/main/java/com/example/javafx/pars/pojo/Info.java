package com.example.javafx.pars.pojo;

public class Info{
    public double lat;
    public double lon;
    public String url;


    @Override
    public String toString() {
        return "Info{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", url='" + url + '\'' +
                '}';
    }
}