package com.example.shahi.kamon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Bar_receipt extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner drop_down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_receipt);
        drop_down = (Spinner) findViewById(R.id.spinner);
        //drop_down.setOnItemClickListener(this);


        //Spinner Drop dwon list

        List<String> sp_list = new ArrayList<String>();

        sp_list.add("1");
        sp_list.add("2");
        sp_list.add("3");
        sp_list.add("4");

        // Adapter for spinner

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sp_list);


        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drop_down.setAdapter(dataAdapter);
    }

        @Override
        public void onItemSelected (AdapterView < ? > adapterView, View view,int i, long l){

        }

        @Override
        public void onNothingSelected (AdapterView < ? > adapterView){

        }


    }
