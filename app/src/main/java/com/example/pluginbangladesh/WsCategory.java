package com.example.pluginbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class WsCategory extends AppCompatActivity {
    ImageView machine, food, personal, home, official;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ws_category);

        machine = findViewById(R.id.mechine);
        food = findViewById(R.id.food);
        personal = findViewById(R.id.personal);
        home = findViewById(R.id.home);
        official = findViewById(R.id.official);


    }
}
