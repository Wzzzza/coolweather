package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Wza.
 * @date: On 2019/3/19.
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carwash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;

    }

    public class CarWash{

        @SerializedName("txt")
        public String info;

    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }

}
