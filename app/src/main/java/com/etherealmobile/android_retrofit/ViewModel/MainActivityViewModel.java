package com.etherealmobile.android_retrofit.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.etherealmobile.android_retrofit.Model.Hero;
import com.etherealmobile.android_retrofit.HeroRepository.HeroRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<Hero>> data;
    private HeroRepository repo;

    public MainActivityViewModel() {
        repo = new HeroRepository();
    }

    public void init() {
        if (this.data != null)
            return;
        data = repo.getHeros();
    }

    public LiveData<List<Hero>> getHeros() {
        return this.data;
    }
}
