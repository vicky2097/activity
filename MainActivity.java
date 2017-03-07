package com.example.vicky.technocrats_teaminfo;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button about = (Button) findViewById(R.id.about);
        Button developer = (Button) findViewById(R.id.develop);
    }
        public void done(View view)
        {
            Intent i=new Intent(this,appactivity.class);
            startActivity(i);

        }
        public void  get(View view)
        {
            Intent intent=new Intent(this,app2activity.class);
            startActivity(intent);
        }

};