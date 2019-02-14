package com.etherealmobile.android_retrofit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.etherealmobile.android_retrofit.Model.Hero;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Hero> heros = new ArrayList<>();

    public RecyclerAdapter(List<Hero> heros) {
        this.heros = heros;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.hero.setText(heros.get(position).getName());
        holder.name.setText(heros.get(position).getRealname());
    }

    @Override
    public int getItemCount() {
        return heros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView hero;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hero = itemView.findViewById(R.id.hero);
            name = itemView.findViewById(R.id.name);
        }
    }
}
