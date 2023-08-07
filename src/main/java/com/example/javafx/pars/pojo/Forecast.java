package com.example.javafx.pars.pojo;
import java.util.List;

public class Forecast{
    public int date_ts;
    public String sunrise;
    public String sunset;

    public List<Parts> parts;


    @Override
    public String toString() {
        return "Forecast{" +
                "date_ts=" + date_ts +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", parts=" + parts +
                '}';
    }
}
