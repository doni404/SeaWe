package com.kelompok4.sealis.sealis;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Ranu on 08/06/2016.
 */
public interface APIService {

    @GET("papb/test.php")
    Call<ArrayList<Stasiun>> loadStasiun();


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://127.0.0.1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    APIService service = retrofit.create(APIService.class);
}
