package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Wza.
 * @date: On 2019/3/19.
 */
public class Basic {

    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

}
