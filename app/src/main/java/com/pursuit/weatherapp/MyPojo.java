package com.pursuit.weatherapp;

import java.util.ArrayList;
import java.util.List;

public class MyPojo {
    private String success;

    private Response[] response;

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    public Response[] getResponse ()
    {
        return response;
    }

    public void setResponse (Response[] response)
    {
        this.response = response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [success = "+success+", response = "+response + "]";
    }
}
