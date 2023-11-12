package com.example.shoppingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ShoppingAppArrayAdapter extends ArrayAdapter<ShoppingItem> {
    private final Context context;
    private final ArrayList<ShoppingItem> values;

    public ShoppingAppArrayAdapter(@NonNull Context context, ArrayList<ShoppingItem> values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_view_item, parent, false);
        TextView TextViewTitle = (TextView) rowView.findViewById(R.id.item_title);
        TextView TextViewSubtitle = (TextView) rowView.findViewById(R.id.item_subtitle);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.item_image);
        ShoppingItem item = values.get(position);
        int imageId = context.getResources().getIdentifier(item.getImage(), "drawable", context.getPackageName());
        TextViewTitle.setText(item.getTitle());
        TextViewSubtitle.setText(item.getSubtitle());
        imageView.setImageResource(imageId);

        return rowView;
    }
}
