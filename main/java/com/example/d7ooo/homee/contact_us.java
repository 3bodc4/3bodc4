package com.example.d7ooo.homee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.MapView;

public class contact_us extends AppCompatActivity {

    Button buton;
    TextView num  , emailn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);


        buton =(Button) findViewById(R.id.buton);
        num = (TextView) findViewById(R.id.num);

        emailn = (TextView) findViewById(R.id.aaaa);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homepage();
            }
        });



    }
    public void homepage (){
        Intent intent= new Intent(this ,home.class );
        startActivity(intent);
    }
}