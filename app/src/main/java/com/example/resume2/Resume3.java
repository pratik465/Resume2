package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resume3 extends AppCompatActivity {

    EditText Company,Experience,Position;
    TextView btnNext2;

    SharedPreferences preferences;

    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume3);

        preferences = getSharedPreferences("AData",0);
        editor = preferences.edit();

        Company=findViewById(R.id.Company);
        Experience=findViewById(R.id.Experience);
        Position=findViewById(R.id.Position);
        btnNext2=findViewById(R.id.btnNext2);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String company = Company.getText().toString();
                String experience = Experience.getText().toString();
                String position = Position.getText().toString();

                editor.putString("company",company);
                editor.putString("experience",experience);
                editor.putString("position",position);
                editor.commit();

            if (company.isEmpty()){
                Company.setError("Please Enter Company Name!!");
            }else if (experience.isEmpty()){
                Experience.setError("Please Enter Experience!!");
            }else if (position.isEmpty()){
                Position.setError("Please Enter Position");
            }else {

                Intent intent = new Intent(Resume3.this,Resume4.class);
                intent.putExtra("company",company);
                intent.putExtra("experience",experience);
                intent.putExtra("position",position);
                startActivity(intent);
            }

            }
        });
    }
}