package com.example.shahi.kamon.Login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shahi on 22/01/2019.
 */
//We dont need this class for now.
public class Login {
    public Login(String message) {
        Message = message;
    }

    public static String getMessage() {

        return Message;
    }

    private static String Message;
    public static boolean isError() {
        return error;
    }

    public Login(boolean error) {
        this.error = error;
    }
    private static boolean error;

    @SerializedName("Username")

    private String user ;
    @SerializedName("Password")
    private String password ;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword(){
        return password;
    }
}
