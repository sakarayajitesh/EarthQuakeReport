package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by AJITESH on 10/2/2016.
 */
public class Earthquake {

    private double mag;

    private String place;


    private long time;

    private String url;

    Earthquake(double mMag,String mplace,long mTime,String mUrl)
    {
        mag=mMag;
        place=mplace;
        time=mTime;
        url=mUrl;
    }

    public double getMag()
    {
        return mag;
    }

    public String getPlace()
    {
        return place;
    }

    public long getTime()
    {
        return time;
    }

    public String getUrl(){return url;}
}
