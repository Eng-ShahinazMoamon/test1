package com.example.shahi.kamon.Login;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by shahi on 22/01/2019.
 */

public interface LoginApi {

     @POST("api/user/Login")
     Call<String> doLoginAdmin(@Body RequestBody body);

    void enqueue(Callback<String> callback);
    //its response is string, so we'll ask it to return String
}
