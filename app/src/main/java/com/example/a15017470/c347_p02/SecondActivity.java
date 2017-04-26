package com.example.a15017470.c347_p02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvType;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvHolidays);
        tvType = (TextView)findViewById(R.id.tvType);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tvType.setText(type);

        holiday = new ArrayList<Holiday>();
        if(type.equalsIgnoreCase("Secular")){
            holiday.add(new Holiday("New Year's Day", "1 Jan 2017", "cd"));
            holiday.add(new Holiday("Labour Day", "1 May 2017", "ld"));
            holiday.add(new Holiday("National Day", "9 Aug 2017", "nd"));
        } else {
            holiday.add(new Holiday("Chinese New Year", "28-29 Jan 2017", "cny"));
            holiday.add(new Holiday("Good Friday", "14 Apr 2017", "gf"));
            holiday.add(new Holiday("Vesak Day", "10 May 2017", "vd"));
            holiday.add(new Holiday("Hari Raya Puasa", "25 Jun 2017", "hrp"));
            holiday.add(new Holiday("Hari Raya Haji", "1 Sep 2017", "hrh"));
            holiday.add(new Holiday("Deepavali", "18 Oct 2017", "d"));
            holiday.add(new Holiday("Christmas Day", "25 Dec 2017", "cd"));
        }

        aa = new HolidayAdapter(this, R.layout.holiday, holiday);
        lv.setAdapter(aa);
    }
}
