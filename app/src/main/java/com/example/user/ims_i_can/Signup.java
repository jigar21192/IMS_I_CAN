package com.example.user.ims_i_can;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Signup extends AppCompatActivity {
    ImageView Student,Faculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Student=(ImageView)findViewById(R.id.Student);
        Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Signup.this,Registration.class);
                startActivity(intent);
            }
        });
        Faculty=(ImageView)findViewById(R.id.Faculty);
        Faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Signup.this,Faculty_Registration.class);
                startActivity(intent1);
            }
        });

    }
}
