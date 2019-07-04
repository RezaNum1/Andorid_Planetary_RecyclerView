package com.example.planetary;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridPlanetAdapter extends RecyclerView.Adapter<GridPlanetAdapter.GridViewHolder> {

    private ArrayList<Planet> listPlanet;

    public GridPlanetAdapter(ArrayList<Planet> list){
        this.listPlanet = list;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_planet, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listPlanet.get(position).getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return listPlanet.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
