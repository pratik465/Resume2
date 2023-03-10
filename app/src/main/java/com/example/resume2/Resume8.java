package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Resume8 extends AppCompatActivity {


    TextView txname, txnumber, txaddress, txemail, txhobbies;
    TextView txcompany, txexperience, txposition;
    TextView txschool, txpercentage, txboard, txcollage, txgrade, txuniversity;
    TextView txproject;
    TextView txskill;

    SharedPreferences preferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume8);

        preferences = getSharedPreferences("AData", 0);

        txname = findViewById(R.id.txname);
        txnumber = findViewById(R.id.txnumber);
        txaddress = findViewById(R.id.txaddress);
        txemail = findViewById(R.id.txemail);

        txcompany = findViewById(R.id.txcompany);
        txexperience = findViewById(R.id.txexperience);
        txposition = findViewById(R.id.txposition);

        txschool = findViewById(R.id.txschool);
        txpercentage = findViewById(R.id.txpercentage);
        txboard = findViewById(R.id.txboard);
        txcollage = findViewById(R.id.txcollage);
        txgrade = findViewById(R.id.txgrade);
        txuniversity = findViewById(R.id.txuniversity);

        txproject = findViewById(R.id.txproject);

        txskill = findViewById(R.id.txskill);


        String name = preferences.getString("name", "");
        String number = preferences.getString("number", "");
        String address = preferences.getString("address", "");
        String email = preferences.getString("email", "");

        String company = preferences.getString("company", "");
        String experience = preferences.getString("experience", "");
        String position = preferences.getString("position", "");

        String school = preferences.getString("school", "");
        String percentage = preferences.getString("percentage", "");
        String board = preferences.getString("board", "");
        String collage = preferences.getString("collage", "");
        String grade = preferences.getString("grade", "");
        String university = preferences.getString("university", "");


        String project = preferences.getString("project", "");

        String skill = preferences.getString("skill", "");


        txname.setText(name);
        txnumber.setText(number);
        txaddress.setText(address);
        txemail.setText(email);

        txcompany.setText(company);
        txexperience.setText(experience);
        txposition.setText(position);

        txschool.setText(school);
        txpercentage.setText(percentage);
        txboard.setText(board);
        txcollage.setText(collage);
        txgrade.setText(grade);
        txuniversity.setText(university);

        txproject.setText(project);

        txskill.setText(skill);




    }
}