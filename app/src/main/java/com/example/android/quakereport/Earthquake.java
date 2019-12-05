package com.example.android.quakereport;

public class Earthquake {

    private double eMagnitude;
    private String eLocation;
    private String eDate;

    public Earthquake(double eMagnitude, String eLocation, String eDate) {
        this.eMagnitude = eMagnitude;
        this.eLocation = eLocation;
        this.eDate = eDate;
    }

    public double geteMagnitude() {
        return eMagnitude;
    }

    public String geteLocation() {
        return eLocation;
    }

    public String geteDate() {
        return eDate;
    }
}
