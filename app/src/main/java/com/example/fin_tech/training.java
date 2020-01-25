package com.example.fin_tech;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class training extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        TextView t1 =  findViewById(R.id.t1);
        Button t2 =  findViewById(R.id.t2);
        Button t3 =  findViewById(R.id.t3);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        t3.setMovementMethod(LinkMovementMethod.getInstance());
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), training_description.class);
                startActivity(intent);


            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }


}
