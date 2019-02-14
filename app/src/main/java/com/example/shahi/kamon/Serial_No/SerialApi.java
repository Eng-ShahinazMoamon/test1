package com.example.shahi.kamon.Serial_No;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by shahi on 24/01/2019.
 */

public interface SerialApi {
    public interface shahi_api {
        @GET("api/invoice/getInvoice/id")
        Call<List<Serial>> getNo();
    }
}