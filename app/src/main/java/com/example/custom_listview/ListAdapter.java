package com.example.custom_listview;

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

public class ListAdapter extends ArrayAdapter<Month> {


    public ListAdapter(Context context, ArrayList<Month> monthArrayList){

        super(context,R.layout.list_item,monthArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Month month = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.profile_pic);
        TextView userName = convertView.findViewById(R.id.MonthName);
        TextView No = convertView.findViewById(R.id.MonthNo);

        imageView.setImageResource(month.imageId);
        userName.setText(month.name);
        No.setText(month.MonthNo);


        return convertView;
    }
}
