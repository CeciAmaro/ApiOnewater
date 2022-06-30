package com.example.producto2.service;

import com.example.producto2.entity.Message;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OnWaterApiService {

    @GET("{lat},{lon}?access_token=8cp7SPLH5cE98zdzDxvA")
    Call<Message> getMessageId(@Path("lat,lon") Double lat, Double lon);

}
