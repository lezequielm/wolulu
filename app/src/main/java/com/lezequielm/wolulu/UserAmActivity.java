package com.lezequielm.wolulu;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.activeandroid.query.Select;
import com.lezequielm.wolulu.model.User;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.RunnableFuture;

public class UserAmActivity extends AppCompatActivity {

    private EditText name;
    private EditText lastname;
    private EditText address;
    private EditText latitude;
    private EditText longitude;
    private EditText phone;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_am);

        this.name = (EditText) findViewById(R.id.name);
        this.lastname = (EditText) findViewById(R.id.lastname);
        this.address = (EditText) findViewById(R.id.address);
        this.latitude = (EditText) findViewById(R.id.latitude);
        this.longitude = (EditText) findViewById(R.id.longitude);
        this.phone = (EditText) findViewById(R.id.phone);
        Button ok = (Button) findViewById(R.id.ok);

        Bundle bundle = this.getIntent().getExtras();

        if(bundle.getBoolean("isEdit",false))
            this.user = (new Select()).from(User.class).where("id = ?", bundle.getLong("userId", 0)).executeSingle();
        else
            this.user = new User();

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creaateUser();
            }
        });
    }

    private void creaateUser() {
        AlertDialog dialog = new AlertDialog.Builder(this).setPositiveButton("dfasdfasd", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setTitle("").setMessage("").create();

        dialog.show();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                /*Lo que hace*/
            }
        };
        task.run();




        this.user.setName(this.name.getText().toString());
        this.user.setLastName(this.lastname.getText().toString());
        this.user.setAddress(this.address.getText().toString());
        this.user.setLatitude(Double.valueOf(this.latitude.getText().toString()));
        this.user.setLongitude(Double.valueOf(this.longitude.getText().toString()));
        this.user.setPhone(this.phone.getText().toString());
        this.user.setActive(true);

        Date today = Calendar.getInstance().getTime();
        this.user.setCreatedAt(today);
        this.user.save();
    }
}
