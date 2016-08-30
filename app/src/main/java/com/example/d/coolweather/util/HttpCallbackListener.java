package com.example.d.coolweather.util;

/**
 * Created by D on 2016/8/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
