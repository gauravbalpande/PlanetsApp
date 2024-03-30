package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetsArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Planet> planetsArrayList, Context context) {
        super(context, R.layout.item_list,planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;
    }



    private static class MyViewHolder {
        TextView planetName;
        TextView moonCount;
        ImageView planetImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        Planet planet = getItem(position);
        MyViewHolder myViewHolder;
        final View result;
        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list, parent, false
            );
            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.moon_number);
            myViewHolder.planetImage = (ImageView) convertView.findViewById(R.id.planet_image);
            result = convertView;
            convertView.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }
        myViewHolder.planetName.setText(planet.getPlanetName());
        myViewHolder.moonCount.setText(planet.getMoonCount());
        myViewHolder.planetImage.setImageResource(planet.getMoonImage());
        return result;

    }
}

