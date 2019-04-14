package com.example.d7ooo.homee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class creditCard extends AppCompatActivity {


    Button butons;
    EditText cardNumber , date, cvvv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);


        Button butons1 = (Button) findViewById(R.id.butons1) ;

        cardNumber=(EditText)findViewById(R.id.cardNumber);
        date=(EditText)findViewById(R.id.date);
        cvvv=(EditText)findViewById(R.id.cvvv);

        butons=(Button)findViewById(R.id.butons);

        butons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comm();
            }
        });

        butons1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseFirestore firestore= FirebaseFirestore.getInstance();
                Map<String, Object> userMap = new HashMap<>();
                userMap.put("card",cardNumber.getText().toString() );
                userMap.put("ex",date.getText().toString() );
                userMap.put("cvv",cvvv.getText().toString() );
                firestore.collection("credit card").document().set(userMap);

                comm();
            }
        });

    }



    public void comm(){
        Intent intent= new Intent(this ,de.class );
        startActivity(intent);
    }
}
