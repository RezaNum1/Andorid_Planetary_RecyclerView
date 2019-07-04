package com.example.planetary;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPlanetAdapter extends RecyclerView.Adapter<ListPlanetAdapter.CategoryViewHolder> {

    private ArrayList<Planet> listPlanet;

    public ListPlanetAdapter(ArrayList<Planet> list){
        this.listPlanet = list;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_planet, viewGroup, false);
        return new CategoryViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        Planet planet = listPlanet.get(position);
        Glide.with(categoryViewHolder.itemView.getContext())
                .load(listPlanet.get(position).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(categoryViewHolder.imgPhoto);
        categoryViewHolder.tvName.setText(planet.getName());
        categoryViewHolder.tvContent.setText(planet.getContent());
    }

    @Override
    public int getItemCount() {
        return listPlanet.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvContent;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvContent = itemView.findViewById(R.id.tv_item_from);
        }
    }
}
