package com.pursuit.weatherapp;

public class WeatherCoded {
    private String dateTimeISO;

    private String wx;

    private String timestamp;

    public String getDateTimeISO ()
    {
        return dateTimeISO;
    }

    public void setDateTimeISO (String dateTimeISO)
    {
        this.dateTimeISO = dateTimeISO;
    }

    public String getWx ()
    {
        return wx;
    }

    public void setWx (String wx)
    {
        this.wx = wx;
    }

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dateTimeISO = "+dateTimeISO+", wx = "+wx+", timestamp = "+timestamp+"]";
    }
}
