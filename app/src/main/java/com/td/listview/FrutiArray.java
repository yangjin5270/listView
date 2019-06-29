package com.td.listview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FrutiArray extends ArrayAdapter<Fruit> {
    private int resourceId;
    public FrutiArray(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }
    public View getView(int position, View convertView,  ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.fruit_image);
        TextView textView = (TextView)view.findViewById(R.id.fruit_name);
        imageView.setImageResource(fruit.getImageId());
        textView.setText(fruit.getName());
        return view;
    }
}
