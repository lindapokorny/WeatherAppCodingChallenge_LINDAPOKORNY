package com.pursuit.weatherapp;

public class Profile {
    private String tz;

    public String getTz ()
    {
        return tz;
    }

    public void setTz (String tz)
    {
        this.tz = tz;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tz = "+tz+"]";
    }
}
