package com.example.d7ooo.homee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button sii , login ,  con  , teee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        sii = (Button)findViewById(R.id.sii);
        login = (Button)findViewById(R.id.login);
        con = (Button)findViewById(R.id.con);

        sii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conta();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });


    }


    public void signup(){
        Intent intent= new Intent(this ,signup.class );
        startActivity(intent);
    }

    public void login(){
        Intent intent= new Intent(this ,login.class );
        startActivity(intent);
    }



    public void conta(){
        Intent intent= new Intent(this ,contact_us.class );
        startActivity(intent);
    }







    }

