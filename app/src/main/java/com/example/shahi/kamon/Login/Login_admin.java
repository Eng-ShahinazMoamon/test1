package com.example.shahi.kamon.Login;

import android.content.Intent;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shahi.kamon.R;
import com.example.shahi.kamon.RetrofitClient;
import com.example.shahi.kamon.Totals;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Class should've been LoginAdmin, but don't change now.
public class Login_admin extends AppCompatActivity implements View.OnClickListener{
Button lo_admin ;
    EditText user , password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        user =(EditText)findViewById(R.id.user_name) ;
        password =(EditText)findViewById(R.id.password) ;
        lo_admin=(Button)findViewById(R.id.login_admin);
        lo_admin.setOnClickListener(this);

    }

    //method name always start with smaller letter and no _ in methodNames ClassName
     private void loginAd() {
         final String username = user.getText().toString().trim();

         final String pass = password.getText().toString().trim();
         if (username.isEmpty()) {
             user.setError("User is required");
             user.requestFocus();
             return;

         }
       /*  if (!Patterns.EMAIL_ADDRESS.matcher(username).matches()) {

             user.setError("User Name invalid");
             user.requestFocus();
             return;
         }*/

         if (pass.isEmpty()) {
             password.setError("pass is required ");
             password.requestFocus();
             return;
         }
         if (password.length() < 6) {
             password.setError("length is short ");
             password.requestFocus();
             return;
         }


        /* //Execute Login process things that return
         //result that we respose from
         //Compose the JSON body for the api

         Map<String, Object> jsonParams = new ArrayMap<>();
         //put something inside the map, could be null
         jsonParams.put("Username", username);
         jsonParams.put("Password", pass);

         RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),
         (new JSONObject(jsonParams)).toString());*/
        //okhttp

         OkHttpClient.Builder client = new OkHttpClient.Builder();
         client.connectTimeout(60, TimeUnit.SECONDS);
         client.readTimeout(60, TimeUnit.SECONDS);
         client.writeTimeout(60, TimeUnit.SECONDS);


         Retrofit retrofit = new Retrofit.Builder().baseUrl(RetrofitClient.Base_Url)
                 .addConverterFactory(GsonConverterFactory.create(new Gson()))
                 .client(client.build()).build();
         LoginApi  iRetrofit = retrofit.create(LoginApi.class);

         //We'll have to change the return type as well, since we're expecting a string as data
      /*   Call<String> loginPro = RetrofitClient
                 .getInstance()
                 .getloginApi()
                 .doLoginAdmin(body);*/

        //variable name start with lowercase. ALWAYSS!!!

         iRetrofit.enqueue(new Callback<String>() {

             @Override
             public void onResponse(Call<String> call, Response<String> response) {
                 String log =response.body();
                // Log.i("MyRespons",response.body().toString());
                 if(Login.isError()){


                     Toast.makeText(Login_admin.this,Login.getMessage(), Toast.LENGTH_SHORT).show();

                 }
                 else {
                     Toast.makeText(Login_admin.this,Login.getMessage(), Toast.LENGTH_SHORT).show();
                 }

                 Intent toto = new Intent(Login_admin.this ,Totals.class);
                 startActivity(toto);
                 //body is a string, becase we defined the response as String in LoginApi
                 // Call<String>   Whatever this <> will contain, it'll be the response body type.
             }

             @Override
             public void onFailure(Call<String> call, Throwable t) {

             }
         });



     }
    //OnClick
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_admin:
                loginAd();
                break;


           /*  Intent toto = new Intent (Login_admin.this ,Totals.class);
                startActivity(toto);
                break;*/
            }

        }

    }

