package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mix_Projects extends AppCompatActivity {

    ImageView pro1,pro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix_projects);

        pro1 = findViewById(R.id.pro1);
        pro2 = findViewById(R.id.pro2);

        pro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mix_Projects.this,Project2.class);
                startActivity(intent);

            }
        });

        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mix_Projects.this,Resume8.class);
                startActivity(intent);

            }
        });
    }
}