package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Project2 extends AppCompatActivity {

    TextView txtnumber, txtaddress, txtemail, txtname, txthobby;
    TextView txtcompany, txtexp, txtposition;
    TextView txtschool, txtper, txtboard, txtcollage, txtgrade, txtuniversity;
    TextView txtproject;
    TextView txtskill;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2);

        preferences = getSharedPreferences("AData", 0);

        txtnumber = findViewById(R.id.txtnumber);
        txtname = findViewById(R.id.txtname);
        txtaddress = findViewById(R.id.txtaddress);
        txtemail = findViewById(R.id.txtemail);

        txtcompany = findViewById(R.id.txtcompany);
        txtexp = findViewById(R.id.txtexp);
        txtposition = findViewById(R.id.txtposition);

        txtschool = findViewById(R.id.txtschool);
        txtper = findViewById(R.id.txtper);
        txtboard = findViewById(R.id.txtboard);
        txtcollage = findViewById(R.id.txtcollage);
        txtgrade = findViewById(R.id.txtgrade);
        txtuniversity = findViewById(R.id.txtuniversity);

        txtproject = findViewById(R.id.txtproject);

        txtskill = findViewById(R.id.txtskill);


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


        txtname.setText(name);
        txtnumber.setText(number);
        txtaddress.setText(address);
        txtemail.setText(email);

        txtcompany.setText(company);
        txtexp.setText(experience);
        txtposition.setText(position);

        txtschool.setText(school);
        txtper.setText(per);
        txtboard.setText(board);
        txtcollage.setText(collage);
        txtgrade.setText(grade);
        txtuniversity.setText(university);

        txtproject.setText(project);

        txtskill.setText(skill);

    }
}