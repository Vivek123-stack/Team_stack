package com.example.fin_tech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        // [START initialize_auth]
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() != null) {
            //that means user is already logged in
            //so close this activity


            //and open profile activity
            //startActivity(new Intent(getApplicationContext(), homepage.class));
        }
         name = (EditText) findViewById(R.id.txtName);
         email = (EditText) findViewById(R.id.txtEmail);
         password = (EditText) findViewById(R.id.txtPwd);


        TextView login = (TextView) findViewById(R.id.lnkLogin);
        login.setMovementMethod(LinkMovementMethod.getInstance());
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registration.this, login.class);
                startActivity(intent);
            }
        });
        Button button = (Button) findViewById(R.id.btnLogin);
        button.setMovementMethod(LinkMovementMethod.getInstance());
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                register();
            }




        });

    }
    void register()
    {
        String email1 = email.getText().toString().trim();
        String password1  = password.getText().toString().trim();

        mAuth.createUserWithEmailAndPassword(email1, password1)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if (task.isSuccessful()) {

                            startActivity(new Intent(getApplicationContext(), homepage.class));

                        } else {
                            //display some message here
                            Toast.makeText(getApplicationContext(), "Registration Error", Toast.LENGTH_LONG).show();
                        }

                    }
                });

    }
    }



