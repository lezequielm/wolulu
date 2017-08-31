package com.lezequielm.wolulu;

import android.support.v7.app.AppCompatActivity;

import com.activeandroid.Model;

/**
 * Created by La Jimena on 30/08/2017.
 * denserio
 */

public abstract class BaseAbmActivity<T extends Model> extends AppCompatActivity {
    T model;

    private void saveModel() {
        model.save();
    }
}
