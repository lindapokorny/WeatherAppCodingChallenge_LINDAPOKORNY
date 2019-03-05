package com.pursuit.weatherapp;

public class Response {
    private Loc loc;

    private Profile profile;

    private Periods[] periods;

    private String interval;

    public Loc getLoc ()
    {
        return loc;
    }

    public void setLoc (Loc loc)
    {
        this.loc = loc;
    }

    public Profile getProfile ()
    {
        return profile;
    }

    public void setProfile (Profile profile)
    {
        this.profile = profile;
    }

    public Periods[] getPeriods ()
    {
        return periods;
    }

    public void setPeriods (Periods[] periods)
    {
        this.periods = periods;
    }

    public String getInterval ()
    {
        return interval;
    }

    public void setInterval (String interval)
    {
        this.interval = interval;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [loc = "+loc+", profile = "+profile+", periods = "+periods+", interval = "+interval+"]";
    }
}
