package com.mess.messapp;

import android.app.Application;

import com.parse.Parse;

public class app extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        Parse.initialize(new Parse.Configuration.Builder(this)
//                .applicationId(getString(R.string.back4app_app_id))
//                // if defined
//                .clientKey(getString(R.string.back4app_client_key))
//                .server(getString(R.string.back4app_server_url))
//                .build()
//        );

                Parse.initialize(new Parse.Configuration.Builder(this)
                        .applicationId("q1uTD3i7taVG0y8eORR7oruaoMK8Bm10ntLg18bL")
                        // if defined
                        .clientKey("z6v7OlEV23DkRgeutC9ZIEUbwmqoxyk54cwMCumD")
                        .server("https://parseapi.back4app.com/")
                        .build()
                );
            }
        }


