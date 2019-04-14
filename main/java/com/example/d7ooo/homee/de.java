package com.example.d7ooo.homee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class de extends AppCompatActivity {

    TextView a,aa,aaa,b,bb,bbb;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de);

        a= (TextView) findViewById(R.id.a);
        aa= (TextView) findViewById(R.id.aa);
        aaa= (TextView) findViewById(R.id.aaa);
        b= (TextView) findViewById(R.id.b);
        bb= (TextView) findViewById(R.id.bb);
        bbb= (TextView) findViewById(R.id.bbb);
        b1= (Button) findViewById(R.id.b1);
        b2= (Button) findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba();
            }
        });
    }

    public void ab() {
        Intent intent= new Intent(this, home1.class);
        startActivity(intent);
    }


    public void ba() {
        Intent intent= new Intent(this, order.class);
        startActivity(intent);
    }
}
