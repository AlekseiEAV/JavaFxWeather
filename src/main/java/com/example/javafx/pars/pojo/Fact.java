package com.example.javafx.pars.pojo;

public class Fact{
    public double temp;
    public double feels_like;
    public String icon;
    public String condition;
    public double wind_speed;
    public String wind_dir;
    public double pressure_mm;
    public String season;
    public String phenom_icon;
    public String phenom_condition;

    @Override
    public String toString() {
        return "Fact{" +
                "temp=" + temp +
                ", feels_like=" + feels_like +
                ", icon='" + icon + '\'' +
                ", condition='" + condition + '\'' +
                ", wind_speed=" + wind_speed +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure_mm=" + pressure_mm +
                ", season='" + season + '\'' +
                ", phenom_icon='" + phenom_icon + '\'' +
                ", phenom_condition='" + phenom_condition + '\'' +
                '}';
    }
}
