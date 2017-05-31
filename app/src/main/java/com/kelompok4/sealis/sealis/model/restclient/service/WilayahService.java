package com.kelompok4.sealis.sealis.model.restclient.service;

import com.kelompok4.sealis.sealis.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ranug on 31/05/2017.
 */

public interface WilayahService {
    @GET("Maritim_Cuaca_Wilayah_Perairan.xml")
    Call<Response> getData();
}
