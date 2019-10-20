package com.example.neverlost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button hi = findViewById(R.id.Status);
        hi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent status = new Intent(getApplicationContext(),KidStatus.class);
                startActivity(status);
            }

        });
        Button we = findViewById(R.id.missingalert);
        we.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent status = new Intent(getApplicationContext(),findthem.class);
                startActivity(status);
            }

        });
    }
}
