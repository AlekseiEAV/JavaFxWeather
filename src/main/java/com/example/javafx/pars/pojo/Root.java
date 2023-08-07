package com.example.javafx.pars.pojo;


import com.google.gson.annotations.SerializedName;

public class Root{
    public String now;
    public String now_dt;

    @SerializedName("info")
    public Info info;
    @SerializedName("fact")
    public Fact fact;
    @SerializedName("forecast")
    public Forecast forecast;

    @Override
    public String toString() {
        return "Root{" +
                "now=" + now +
                ", now_dt='" + now_dt + '\'' +
                ", info=" + info +
                ", fact=" + fact +
                ", forecast=" + forecast +
                '}';
    }

}
