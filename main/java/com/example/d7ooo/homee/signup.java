package com.example.d7ooo.homee;

import android.app.ProgressDialog;
import android.content.Intent;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class signup extends AppCompatActivity {

    EditText eusername, idn, email, pass, numfam;
    Button signup;
//    FirebaseDatabase database;
//    DatabaseReference reference;

    FirebaseUser use;

    FirebaseAuth auth;
//    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        eusername = (EditText) findViewById(R.id.eusername);
        idn = (EditText) findViewById(R.id.idn);
        pass = (EditText) findViewById(R.id.pass);
        numfam = (EditText) findViewById(R.id.numfam);
        signup = (Button) findViewById(R.id.signup);
        email = (EditText) findViewById(R.id.email);



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FirebaseFirestore firestore = FirebaseFirestore.getInstance();
                Map<String, Object> userMap = new HashMap<>();
                userMap.put("Email", email.getText().toString());
                userMap.put("Password", pass.getText().toString());
                userMap.put("ID", idn.getText().toString());
                userMap.put("Number of family", numfam.getText().toString());
                userMap.put("Name", eusername.getText().toString());


                firestore.collection("user").document().set(userMap);
                login();
            }});}





        public void login(){
            Intent intent = new Intent(this, login.class);
            startActivity(intent); }

}





//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                login();
//            }
//        });



//    public void authUser() {
//
//         String mail= email.getText().toString();
//         String pa = pass.getText().toString();
//         String aa = eusername.getText().toString();
//         String ab = numfam.getText().toString();
//         String i = idn.getText().toString();
//         String ma = mar.getText().toString();
//
//        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
//
//        Map<String, Object> userMap = new HashMap<>();
//        userMap.put("first", mail);
//        userMap.put("second", pa);
//        userMap.put("third", aa);
//        userMap.put("fourth", ab);
//        userMap.put("fifth", i);
//        userMap.put("sixth", ma);
//
//        firestore.collection("us").add(userMap).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//            @Override
//            public void onSuccess(DocumentReference documentReference) {
//                Toast.makeText(signup.this,"data enterd", Toast.LENGTH_SHORT).show();
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                System.out.println("bb"+e);
//                Toast.makeText(signup.this,e.toString(), Toast.LENGTH_SHORT).show();
//
//            }
//        });


//        final String mail= email.getText().toString();
//        final String pa = pass.getText().toString();
//
//        auth.createUserWithEmailAndPassword(mail , pa).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//           if (task.isSuccessful()){
//               use=auth.getCurrentUser();
//               user u = new user(mail , pa);
//               reference.child(use.getUid()).setValue(u).addOnCompleteListener(new OnCompleteListener<Void>() {
//                   @Override
//                   public void onComplete(@NonNull Task<Void> task) {
//                       if (task.isSuccessful()){
//
//                           Toast.makeText(getApplicationContext() , "stored" , Toast.LENGTH_LONG).show();
//                           Intent i = new Intent(getApplicationContext() , login.class);
//                           startActivity(i);
//                           finish();
//                       }
//                   }
//               });
//           }
//            }
//        });
//        database = FirebaseDatabase.getInstance();
//        reference = database.getReference().child("aa");
//        auth = FirebaseAuth.getInstance();
//
//        final String mail= email.getText().toString();
//        final String pa = pass.getText().toString();
//
//        auth.createUserWithEmailAndPassword(mail , pa).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//           if (task.isSuccessful()){
//               use=auth.getCurrentUser();
//               user u = new user(pa , mail);
//               reference.child(use.getUid()).setValue(u).addOnCompleteListener(new OnCompleteListener<Void>() {
//                   @Override
//                   public void onComplete(@NonNull Task<Void> task) {
//                       if (task.isSuccessful()){
//
//                           Toast.makeText(getApplicationContext() , "stored" , Toast.LENGTH_LONG).show();
//                           Intent i = new Intent(getApplicationContext() , login.class);
//                           startActivity(i);
//                           finish();
//                       }
//                   }
//               });
//           }
//            }
//        });

   // }



//      u.setEemail(email.getText().toString());
//        u.setMarr(mar.getText().toString());
//        u.setUsername(eusername.getText().toString());
//       u.setPassword(pass.getText().toString());
//        u.setIdd(idn.getText().toString());
//        u.setNu(numfam.getText().toString());

//        final String mail= email.getText().toString();
//        final String pa = pass.getText().toString();
//
//        auth.createUserWithEmailAndPassword(mail , pa).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//           if (task.isSuccessful()){
//               use=auth.getCurrentUser();
//               user u = new user(mail , pa);
//               reference.child(use.getUid()).setValue(u).addOnCompleteListener(new OnCompleteListener<Void>() {
//                   @Override
//                   public void onComplete(@NonNull Task<Void> task) {
//                       if (task.isSuccessful()){
//
//                           Toast.makeText(getApplicationContext() , "stored" , Toast.LENGTH_LONG).show();
//                           Intent i = new Intent(getApplicationContext() , login.class);
//                           startActivity(i);
//                           finish();
//                       }
//                   }
//               });
//           }
//            }
//        });
//        database = FirebaseDatabase.getInstance();
//        reference = database.getReference().child("aa");
//        auth = FirebaseAuth.getInstance();
//
//        final user u = new user();
//        u.setEemail(email.getText().toString());
//        u.setMarr(mar.getText().toString());
//        u.setUsername(eusername.getText().toString());
//        u.setPassword(pass.getText().toString());
//        u.setIdd(idn.getText().toString());
//        u.setNu(numfam.getText().toString());
//
//
//        reference.setValue("fdsf");
//        Toast.makeText(signup.this,"yesss",Toast.LENGTH_SHORT).show();
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//            }
//        });






