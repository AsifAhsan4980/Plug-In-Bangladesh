package com.example.pluginbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AnCategory extends AppCompatActivity {
    ImageView home, fbcover, comp,  anad ;
    Button checkout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an_category);

        home = findViewById(R.id.home);
        fbcover = findViewById(R.id.fbcover);
        comp = findViewById(R.id.comp);
        checkout = findViewById(R.id.checkout);
        anad = findViewById(R.id.anad);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnCategory.this,HomeActivity.class));
            }
        });

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnCategory.this,CheckOut.class));
            }
        });



    }
}
