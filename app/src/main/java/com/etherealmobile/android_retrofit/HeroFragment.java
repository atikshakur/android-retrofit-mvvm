package com.etherealmobile.android_retrofit;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.etherealmobile.android_retrofit.Model.Hero;
import com.etherealmobile.android_retrofit.ViewModel.MainActivityViewModel;

import java.util.ArrayList;
import java.util.List;


public class HeroFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private List<Hero> heroes = new ArrayList<>();
    private MainActivityViewModel viewModel;

    private static final String TAG = "HeroFragment";

    public HeroFragment() {
        // Required empty public constructor
    }

    public static HeroFragment newInstance() {
        return new HeroFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_hero, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        adapter = new RecyclerAdapter(heroes);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        Log.d(TAG, "onCreateView: ");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        observeViewModel();
    }

    private void observeViewModel() {
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        viewModel.init();
        viewModel.getHeros().observe(this, (List<Hero> hero) -> {
            heroes.addAll(hero);
            adapter.notifyDataSetChanged();
        });
    }


}
