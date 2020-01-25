package com.example.fin_tech;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //getting firebase auth object
        firebaseAuth = FirebaseAuth.getInstance();

        //if the objects getcurrentuser method is not null
        //means user is already logged in
        if(firebaseAuth.getCurrentUser() != null){
            //close this activity

            //opening profile activity
           //
            // startActivity(new Intent(getApplicationContext(), homepage.class));
        }
        email = (EditText) findViewById(R.id.txtEmail);
        password = (EditText) findViewById(R.id.txtPwd);

        Button login=findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userlogin();
            }
        });
        TextView register=findViewById(R.id.fstTxt);

        register.setMovementMethod(LinkMovementMethod.getInstance());
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),registration.class));
            }
        });



        }
        void userlogin()
        {
            String email1 = email.getText().toString().trim();
            String password1  = password.getText().toString().trim();

             firebaseAuth.signInWithEmailAndPassword(email1, password1)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            //if the task is successfull
                            if(task.isSuccessful()){
                                //start the profile activity

                                startActivity(new Intent(getApplicationContext(), homepage.class));
                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Registration Error", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }





    }





