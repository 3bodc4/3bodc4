package com.example.d7ooo.homee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class order extends AppCompatActivity {



    Spinner spi;

    RadioGroup sss;
    RadioButton cs , cridet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);



        cridet=(RadioButton) findViewById(R.id.creditcc);
        cs=(RadioButton) findViewById(R.id.cs);
        sss=(RadioGroup) findViewById(R.id.sss);
        spi=(Spinner) findViewById(R.id.spi);


        sss.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.cs){
                    FirebaseFirestore firestore=FirebaseFirestore.getInstance();
                    Map<String, Object>map=new HashMap<>();
                    map.put("first" ,spi);
                    firestore.collection("order").document("2");
                    dee();
                }
                else if (checkedId==R.id.creditcc){
                    FirebaseFirestore firestore=FirebaseFirestore.getInstance();
                    Map<String, Object>map=new HashMap<>();
                    map.put("first" ,spi);
                   firestore.collection("order").document("2");
                    cre();

                }


            }
        });



    }


    public void cre(){
        Intent intent= new Intent(this ,creditCard.class );
        startActivity(intent);
    }
    public void dee(){
        Intent intent= new Intent(this ,de.class );
        startActivity(intent);
    }

}
