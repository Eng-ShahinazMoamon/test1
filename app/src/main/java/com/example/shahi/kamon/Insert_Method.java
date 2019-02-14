package com.example.shahi.kamon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Insert_Method extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    Button  B_ser_no , B_bar_code ;
    private ZXingScannerView zXingScannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert__method);
        B_ser_no=(Button)findViewById(R.id.in_no1);
        B_bar_code=(Button)findViewById(R.id.in_bar1);
      //  B_ser_no.setOnClickListener(this);

    }

   /* @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.in_bar1:
                Intent no1=new Intent(Insert_Method.this , Ser_No1.class);
                startActivity(no1);
                break;

            case R.id.in_no1:
                Intent no2=new Intent(Insert_Method.this , Ser_No1.class);
                startActivity(no2);
                break;
        }
    }*/

    public void scan(View view){
        zXingScannerView =new ZXingScannerView(getApplicationContext());
        setContentView(zXingScannerView);
        zXingScannerView.setResultHandler(this);
        zXingScannerView.startCamera();

    }

    @Override
    protected void onPause() {
        super.onPause();
        zXingScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
        Intent nn=new Intent(Insert_Method.this ,Bar_receipt.class );
        startActivity(nn);

        zXingScannerView.resumeCameraPreview(this);

    }
}



