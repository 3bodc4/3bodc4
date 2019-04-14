package com.example.d7ooo.homee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class contact1 extends AppCompatActivity {

    Button buton2;
    TextView num  , emailn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact1);

        buton2 =(Button) findViewById(R.id.buton2);
        num = (TextView) findViewById(R.id.num);

        emailn = (TextView) findViewById(R.id.aaaa);

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home1();
            }
        });

    }

    public void home1 (){
        Intent intent= new Intent(this ,home1.class );
        startActivity(intent);
    }
}
