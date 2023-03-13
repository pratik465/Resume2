package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Resume8 extends AppCompatActivity {


    TextView TEXTname, TEXTnumber, TEXTaddress, TEXTemail, TEXThobbies;
    TextView TEXTcompany, TEXTexperience, TEXTposition;
    TextView TEXTschool, TEXTpercentage, TEXTboard, TEXTcollage, TEXTgrade, TEXTuniversity;
    TextView TEXTproject;
    TextView TEXTskill;

    SharedPreferences preferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume8);

        preferences = getSharedPreferences("AData", 0);

        TEXTname = findViewById(R.id.TEXTname);
        TEXTnumber = findViewById(R.id.TEXTnumber);
        TEXTaddress = findViewById(R.id.TEXTaddress);
        TEXTemail = findViewById(R.id.TEXTemail);

        TEXTcompany = findViewById(R.id.TEXTcompany);
        TEXTexperience = findViewById(R.id.TEXTexperience);
        TEXTposition = findViewById(R.id.TEXTposition);

        TEXTschool = findViewById(R.id.TEXTschool);
        TEXTpercentage = findViewById(R.id.TEXTpercentage);
        TEXTboard = findViewById(R.id.TEXTboard);
        TEXTcollage = findViewById(R.id.TEXTcollage);
        TEXTgrade = findViewById(R.id.TEXTgrade);
        TEXTuniversity = findViewById(R.id.TEXTuniversity);

        TEXTproject = findViewById(R.id.TEXTproject);

        TEXTskill = findViewById(R.id.TEXTskill);


        String name = preferences.getString("name", "");
        String number = preferences.getString("number", "");
        String address = preferences.getString("address", "");
        String email = preferences.getString("email", "");

        String company = preferences.getString("company", "");
        String experience = preferences.getString("experience", "");
        String position = preferences.getString("position", "");

        String school = preferences.getString("school", "");
        String per = preferences.getString("percentage", "");
        String board = preferences.getString("board", "");
        String collage = preferences.getString("collage", "");
        String grade = preferences.getString("grade", "");
        String university = preferences.getString("university", "");


        String project = preferences.getString("project", "");

        String skill = preferences.getString("skill", "");


        TEXTname.setText(name);
        TEXTnumber.setText(number);
        TEXTaddress.setText(address);
        TEXTemail.setText(email);



        TEXTcompany.setText(company);
        TEXTexperience.setText(experience);
        TEXTposition.setText(position);

        TEXTschool.setText(school);
        TEXTpercentage.setText(per);
        TEXTboard.setText(board);
        TEXTcollage.setText(collage);
        TEXTgrade.setText(grade);
        TEXTuniversity.setText(university);

        TEXTproject.setText(project);

        TEXTskill.setText(skill);

    }
}