package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: Wza.
 * @date: On 2019/3/19.
 */
public class Weather {

    public String status;

    public Basic basic;

    public Update update;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
