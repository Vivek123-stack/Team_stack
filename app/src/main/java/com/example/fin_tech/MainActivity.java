package com.example.fin_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    void showToast(CharSequence msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Spinner dropdown =  findViewById(R.id.spinner1);
//create a list of items for the spinner.
        String[] items = new String[]{"Select Language","English", "Hindi", "Marathi"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);


        dropdown.setOnItemSelectedListener(
             new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(
                    AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        // Whatever you want to happen when the first item gets selected
                        break;
                    case 1:
                        // Whatever you want to happen when the second item gets selected
                        Intent n=new Intent(getApplicationContext(), login.class);
                        n.putExtra("lan", position);

                        startActivity(n);
                        break;
                    case 2:
                        // Whatever you want to happen when the thrid item gets selected
                        break;
                    case 3:


                }

            }

            public void onNothingSelected(AdapterView<?> parent) {
                showToast("Spinner1: unselected");
            }
        });



    }

}

