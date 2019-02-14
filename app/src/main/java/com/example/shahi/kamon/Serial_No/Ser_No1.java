package com.example.shahi.kamon.Serial_No;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shahi.kamon.Bar_receipt;
import com.example.shahi.kamon.R;

public class Ser_No1 extends AppCompatActivity implements View.OnClickListener {
 Button se_no1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ser__no1);
        se_no1=(Button)findViewById(R.id.Se_no1);
        se_no1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent serial = new Intent(Ser_No1.this,Bar_receipt.class);
        startActivity(serial);
    }
}
