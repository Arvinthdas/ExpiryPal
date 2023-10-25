package com.example.expirypal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class addfood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_food_items);

        ImageButton addfoodback = findViewById(R.id.afiback);

        addfoodback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent afibackintent = new Intent(addfood.this, food.class);
                startActivity(afibackintent);
            }
        });
    }
}
