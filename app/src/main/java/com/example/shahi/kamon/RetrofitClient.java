package com.example.shahi.kamon;

import com.example.shahi.kamon.Login.LoginApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shahi on 22/01/2019.
 */

public class RetrofitClient {
    public static final String Base_Url="http://developertools22-001-site1.etempurl.com";
    public static RetrofitClient mInstance;
    private Retrofit retrofit;


    public RetrofitClient(){
         retrofit=new Retrofit.Builder()
                .baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


public static synchronized RetrofitClient getInstance(){
    //if it null that mean there is no instance so please create it
    if(mInstance == null){

        mInstance=new RetrofitClient();
    }
    return mInstance;

    }

    //method to get Api
    public LoginApi getloginApi(){
        return retrofit.create(LoginApi.class);

    }
}
