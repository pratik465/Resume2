package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Resume5 extends AppCompatActivity {

    CheckBox Cricket, Singing, Carom, Kabbadi, Traveling, Writing, Reading, Hockey, Movies;
    TextView btnNext4,Hobbies;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume5);

        preferences = getSharedPreferences("AData", 0);
        editor = preferences.edit();

        btnNext4 = findViewById(R.id.btnNext4);

        btnNext4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {


                String s = "";
                if (Cricket.isChecked()) {
                    s += "Cricket\n";
                } else if (Movies.isChecked()) {
                    s += "Movies\n";
                } else if (Carom.isChecked()) {
                    s += "Carom\n";
                } else if (Writing.isChecked()) {
                    s += "Writing\n";
                } else if (Hockey.isChecked()) {
                    s += "Hockey\n";
                } else if (Singing.isChecked()) {
                    s += "Singing\n";
                } else if (Traveling.isChecked()) {
                    s += "Traveling\n";
                } else if (Reading.isChecked()) {
                    s += "Reading\n";
                } else if (Kabbadi.isChecked()) {
                    s += "Kabbadi\n";
                } else {

                    btnNext4 = findViewById(R.id.btnNext4);
                    Movies = findViewById(R.id.Movies);
                    Carom = findViewById(R.id.Carom);
                    Writing = findViewById(R.id.Writing);
                    Hockey = findViewById(R.id.Hockey);
                    Singing = findViewById(R.id.Singing);
                    Traveling = findViewById(R.id.Traveling);
                    Reading = findViewById(R.id.Reading);
                    Kabbadi = findViewById(R.id.Kabbadi);
                    Cricket = findViewById(R.id.Cricket);
                    Hobbies = findViewById(R.id.Hobbies);

//                    String cricket = Cricket.getText().toString();
//                    String movies = Movies.getText().toString();
//                    String carom = Carom.getText().toString();
//                    String writing = Writing.getText().toString();
//                    String hockey = Hockey.getText().toString();
//                    String singing = Singing.getText().toString();
//                    String traveling = Traveling.getText().toString();
//                    String reading = Reading.getText().toString();
//                    String kabbadi = Kabbadi.getText().toString();
//                    String hobbies = Hobbies.getText().toString();
//
//                    editor.putString("cricket", s);
//                    editor.putString("movies", s);
//                    editor.putString("carom", s);
//                    editor.putString("writing", s);
//                    editor.putString("hockey", s);
//                    editor.putString("singing", s);
//                    editor.putString("traveling", s);
//                    editor.putString("reading", s);
//                    editor.putString("kabbadi", s);
//                    editor.putString("Hobbies", s);
//                    editor.commit();


                    Intent intent = new Intent(Resume5.this, Resume6.class);
//                    intent.putExtra("cricket", s);
//                    intent.putExtra("movies", s);
//                    intent.putExtra("carom", s);
//                    intent.putExtra("writing", s);
//                    intent.putExtra("hockey", s);
//                    intent.putExtra("singing", s);
//                    intent.putExtra("traveling", s);
//                    intent.putExtra("reading", s);
//                    intent.putExtra("kabbadi", s);
//                    intent.putExtra("hobbies",s);
                    startActivity(intent);
//
                }



            }
        });


    }
}