package com.etherealmobile.android_retrofit.HeroRepository;

import com.etherealmobile.android_retrofit.Model.Hero;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("marvel")
    Call<List<Hero>> getHeros();
}


