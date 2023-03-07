package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resume4 extends AppCompatActivity {

    EditText School,Per,Board,Collage,Grade,University;
    TextView btnNext3;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume4);

        preferences = getSharedPreferences("AData",0);
        editor = preferences.edit();

        School =findViewById(R.id.School);
        Per =findViewById(R.id.Per);
        Board =findViewById(R.id.Board);
        Collage =findViewById(R.id.Collage);
        Grade =findViewById(R.id.Grade);
        University =findViewById(R.id.University);
        btnNext3 =findViewById(R.id.btnNext3);

        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String school = School.getText().toString();
                String per = Per.getText().toString();
                String board = Board.getText().toString();
                String collage = Collage.getText().toString();
                String grade = Grade.getText().toString();
                String university = University.getText().toString();

                editor.putString("school",school);
                editor.putString("per",per);
                editor.putString("board",board);
                editor.putString("collage",collage);
                editor.putString("grade",grade);
                editor.putString("university",university);
                editor.commit();

                if (school.isEmpty()){
                    School.setError(" Please Enter School Name!!");
                }else if (per.isEmpty()){
                    Per.setError("Please Enter Percentage!!");
                }else if (board.isEmpty()){
                    Board.setError("Please Enter Board Name!!");
                }else if (collage.isEmpty()){
                    Collage.setError("Please Enter Collage Name!!");
                }else if (grade.isEmpty()){
                    Grade.setError("Please Enter Grade!!");
                }else if (university.isEmpty()){
                    University.setError("Please Enter University Name!!");
                }else {
                    Intent intent = new Intent(Resume4.this,Resume5.class);
                    intent.putExtra("school",school);
                    intent.putExtra("per",per);
                    intent.putExtra("board",board);
                    intent.putExtra("collage",collage);
                    intent.putExtra("grade",grade);
                    intent.putExtra("university",university);
                    startActivity(intent);
                }

            }
        });
    }
}