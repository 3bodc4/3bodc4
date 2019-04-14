package com.example.d7ooo.homee;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

import javax.annotation.Nullable;

public class login extends AppCompatActivity {

     FirebaseAuth mAuth;
    Button blog;
    EditText email, pass;






    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.eusername);
        pass = (EditText) findViewById(R.id.pass);
        blog = (Button) findViewById(R.id.blog);

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baba();
            }
        });
    }



   // public void al() {


//
//            if (eusername != null){
//                password=new log();
//
//                firebaseDatabase = FirebaseDatabase.getInstance();
//                reference=firebaseDatabase.getReference();
//                reference.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                        log password = dataSnapshot.getValue(log.class);
//                        if (password.equals(password.getPassword()) && password.equals(password.getUsername())) {
//
//                            Toast.makeText(login.this , "login success", Toast.LENGTH_LONG).show();
//                            Intent intent=new Intent(login.this , home.class);
//                            startActivity(intent);
//                        }
//                    }
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                    }
//                });}else {
//                Toast.makeText(login.this , "login failed", Toast.LENGTH_SHORT).show();
//
//
//            }

//        String paa= eusername.getText().toString();
//        String aa= pass.getText().toString();
//
//        mAuth = FirebaseAuth.getInstance();
//
//        mAuth.signInWithEmailAndPassword(paa, aa)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//
//                            FirebaseUser user = mAuth.getCurrentUser();
//
//
//                        } else {
//                            // If sign in fails, display a message to the user.
//
//                        }
//
//                        // ...
//                    }
//                });


        public void baba () {
            Intent intent = new Intent(login.this, home1.class);
            startActivity(intent);
        }


    }




