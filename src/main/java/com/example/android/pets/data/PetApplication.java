package com.example.android.pets.data;

/**
 * Created by Gregorio on 09/07/2017.
 */

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Gregorio on 09/07/2017.
 */

public class PetApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }

}
