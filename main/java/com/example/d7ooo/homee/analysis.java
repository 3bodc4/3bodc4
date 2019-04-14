package com.example.d7ooo.homee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class analysis extends AppCompatActivity {

    EditText use, re;
    Button ret;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        use=(EditText) findViewById(R.id.use);
        re=(EditText) findViewById(R.id.re);
        ret=(Button) findViewById(R.id.ret);

        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hhhhh();
            }
        });


    }

    public void hhhhh(){
        Intent intent= new Intent(this , home1.class);
        startActivity(intent);
    }
}
