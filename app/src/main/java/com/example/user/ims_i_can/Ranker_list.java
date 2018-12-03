package com.example.user.ims_i_can;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Ranker_list extends AppCompatActivity {
    Button Signup,Signin;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranker_list);
        Signup=(Button)findViewById(R.id.Signup);

        toolbar = (Toolbar) findViewById(R.id.toolbar_rankerlist);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Hi");

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Ranker_list.this,Signup.class);
                startActivity(intent);
            }
        });
        Signin=(Button)findViewById(R.id.Signin);
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Ranker_list.this,LogIn.class);
                startActivity(intent1);

            }
        });


    }
}
