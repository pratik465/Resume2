package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resume7_My_Project extends AppCompatActivity {

    TextView btnNext6,Project;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume7_my_project);

        preferences = getSharedPreferences("AData",0);
        editor = preferences.edit();

        btnNext6 = findViewById(R.id.btnNext6);
        Project = findViewById(R.id.Projects);

        btnNext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String project = Project.getText().toString();
                editor.putString("projects", project);
                editor.commit();

                if (project.isEmpty()) {
                    Project.setError("Please enter Your Projects");
                } else {


                    Intent intent = new Intent(Resume7_My_Project.this, Resume8.class);
                    intent.putExtra("projects", project);
                    startActivity(intent);
                }
            }
        });
    }
}