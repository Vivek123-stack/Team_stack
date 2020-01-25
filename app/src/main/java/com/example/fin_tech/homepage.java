package com.example.fin_tech;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class homepage extends AppCompatActivity {
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        mAuth=FirebaseAuth.getInstance();


        Button t2 =  findViewById(R.id.btnlogout);
        ImageButton i1 = (ImageButton) findViewById(R.id.i1);
        ImageButton i2 = (ImageButton) findViewById(R.id.i2);
        ImageButton i3 = (ImageButton) findViewById(R.id.i3);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);


            }
        });




        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), training.class);
                startActivity(intent);

            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Insurance_policies.class);
                startActivity(intent);

            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), loans.class);
                startActivity(intent);

            }
        });
    /*    button4.setMovementMethod(LinkMovementMethod.getInstance());
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), loans.class);
                startActivity(intent);

            }
        });
        button5.setMovementMethod(LinkMovementMethod.getInstance());
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),investments.class);
                startActivity(intent);

            }
        });
        button6.setMovementMethod(LinkMovementMethod.getInstance());
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),government_schemes.class);
                startActivity(intent);

            }
        });*/
    }

    }


