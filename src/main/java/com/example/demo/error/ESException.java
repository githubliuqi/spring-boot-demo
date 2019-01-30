package com.example.demo.error;

public class ESException extends Exception {



    public static final int ERROR_NO_ACCOUNT = 1;
    public static final int ERROR_PASSWORD = 2;


    public int code;

    public ESException(int code){
        this.code  = code;
    }
}
