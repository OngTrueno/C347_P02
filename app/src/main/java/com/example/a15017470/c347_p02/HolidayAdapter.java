package com.example.a15017470.c347_p02;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017470 on 26/4/2017.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private Context context;
    private ArrayList<Holiday> holiday;
    private TextView tvHoliday;
    private TextView tvDate;
    private ImageView iv;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);

        holiday = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.holiday, parent, false);

        tvHoliday = (TextView)rowView.findViewById(R.id.textView3);
        tvDate = (TextView)rowView.findViewById(R.id.textView4);
        iv = (ImageView)rowView.findViewById(R.id.imageView);

        Holiday currentHoliday = holiday.get(position);

        tvHoliday.setText(currentHoliday.getName());
        tvDate.setText(currentHoliday.getDate());

        String picture = currentHoliday.getImage();
        int id = rowView.getResources().getIdentifier(picture,"drawable",inflater.getContext().getPackageName());
        iv.setImageResource(id);

        return rowView;
    }


}
