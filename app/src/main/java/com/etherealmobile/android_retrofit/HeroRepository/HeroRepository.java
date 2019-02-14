package com.etherealmobile.android_retrofit.HeroRepository;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.etherealmobile.android_retrofit.Model.Hero;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HeroRepository {

    private Api api;
    private static final String TAG = "HeroRepository";

    public HeroRepository() {}

    public MutableLiveData<List<Hero>> getHeros() {
        final MutableLiveData<List<Hero>> data = new MutableLiveData<>();
        api = RetrofitClient.getInstance().create(Api.class);
        Call<List<Hero>> call = api.getHeros();
        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                if(response.body() != null)
                    data.setValue(response.body());
                if (response.isSuccessful())
                    Log.d(TAG, "onResponse: succressful");
            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {

            }
        });
        return data;
    }

}
