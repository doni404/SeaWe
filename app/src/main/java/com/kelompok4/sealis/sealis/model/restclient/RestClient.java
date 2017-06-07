package com.kelompok4.sealis.sealis.model.restclient;

import com.kelompok4.sealis.sealis.model.restclient.service.WilayahService;

import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by ranug on 31/05/2017.
 */

public class RestClient {
    public static Retrofit retrofit;
    public static WilayahService wilayahService;

    public static void initialize(){
        retrofit = new Retrofit.Builder()
                .baseUrl("http://data.bmkg.go.id/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        wilayahService = retrofit.create(WilayahService.class);
    }
}
