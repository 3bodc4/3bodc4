package com.example.d7ooo.homee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home1 extends AppCompatActivity {

    Button   logout ,  contact  , orde, bab ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);
        logout = (Button)findViewById(R.id.logout);
        contact = (Button)findViewById(R.id.contact);
        orde=(Button) findViewById(R.id.orde) ;
        bab =(Button) findViewById(R.id.bab);
//        Button abcd= (Button) findViewById(R.id.abcd);

//        Uri gmmIntentUri = Uri.parse("google.streetview:cbll=21.60256,39.251782");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//        startActivity(mapIntent);
//        mapIntent.setPackage("com.google.android.apps.maps");

//        abcd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                mapa();
//
//                }
//
//
//        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conta();
            }
        });
        bab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ana();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

        orde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ordes();
            }
        });




    }




    public void logout(){
        Intent intent= new Intent(this ,home.class );
        startActivity(intent);
    }



    public void conta(){
        Intent intent= new Intent(this ,contact1.class );
        startActivity(intent);
    }

    public void ordes(){
        Intent intent= new Intent(this ,order.class );
        startActivity(intent);
    }
    public void ana(){
        Intent intent= new Intent(this ,analysis.class );
        startActivity(intent);
    }
//    public void mapa() {
//
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
//        mapIntent.setData(Uri.parse("geo:0,0?q=replace+this+with+an+address"));
//        if (mapIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(mapIntent);
//        }
//
//    }





}
