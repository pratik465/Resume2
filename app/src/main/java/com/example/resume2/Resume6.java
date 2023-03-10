package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resume6 extends AppCompatActivity {

    EditText Skill;
    TextView btnNext5;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume6);

        preferences = getSharedPreferences("AData",0);
        editor = preferences.edit();

        Skill = findViewById(R.id.Skill);
        btnNext5 = findViewById(R.id.btnNext5);

        btnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String skill = Skill.getText().toString();
                editor.putString("skill",skill);
                editor.commit();

                if (skill.isEmpty()){
                    Skill.setError("Please Enter Your Skill!!");
                }else {

                    Intent intent= new Intent(Resume6.this,Resume7_My_Project.class);
                    intent.putExtra("skill",skill);
                    startActivity(intent);
                }

            }
        });
    }
}