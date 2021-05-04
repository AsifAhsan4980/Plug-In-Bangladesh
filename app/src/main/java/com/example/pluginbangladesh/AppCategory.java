package com.example.pluginbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AppCategory extends AppCompatActivity {

    ImageView home, social, food, office, personal;
    Button checkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_category);
        home = findViewById(R.id.home);
        social = findViewById(R.id.social);
        food = findViewById(R.id.food);
        office = findViewById(R.id.official);
        personal = findViewById(R.id.personal);
        checkout = findViewById(R.id.checkout);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AppCategory.this,HomeActivity.class));
            }
        });

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AppCategory.this,CheckOut.class));
            }
        });

    }
}
