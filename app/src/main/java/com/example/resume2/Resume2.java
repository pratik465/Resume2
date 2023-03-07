package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resume2 extends AppCompatActivity {

    EditText Name,Number,Address,Email;
    TextView btnNext;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume2);

        preferences = getSharedPreferences("AData",0);
        editor = preferences.edit();

        Name=findViewById(R.id.Name);
        Number=findViewById(R.id.Number);
        Address=findViewById(R.id.Address);
        Email=findViewById(R.id.Email);
        btnNext=findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = Name.getText().toString();
                String number = Number.getText().toString();
                String address = Address.getText().toString();
                String email = Email.getText().toString();

                editor.putString("name",name);
                editor.putString("number",number);
                editor.putString("address",address);
                editor.putString("email",email);
                editor.commit();

                if (name.isEmpty()){
                    Name.setError("Please Enter Name!!");
                }else if (number.isEmpty()){
                    Number.setError("Please Enter Number!!");
                }else if (address.isEmpty()){
                    Address.setError("Please Enter Address!!");
                }else if (email.isEmpty()){
                    Email.setError("Please Enter Email!!");
                }else {

                    Intent intent = new Intent(Resume2.this,Resume3.class);
                    intent.putExtra("name",name);
                    intent.putExtra("number",number);
                    intent.putExtra("email",email);
                    intent.putExtra("address",address);
                    startActivity(intent);

                }

            }
        });
    }
}