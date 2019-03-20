package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Wza.
 * @date: On 2019/3/19.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String more;

}
