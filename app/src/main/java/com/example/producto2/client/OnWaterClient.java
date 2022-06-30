package com.example.producto2.client;

import com.example.producto2.service.OnWaterApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OnWaterClient {
    //definir la url base, retro fit client
    public static final String URL_BASE = "https://api.onwater.io/api/v1/results/";
    private static Retrofit retrofit;
    //metodo que vaa consumir la api

    public static OnWaterApiService getApiService(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(OnWaterApiService.class);
    }



}
