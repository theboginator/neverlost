package com.example.neverlost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // }
        // public class Status extends Activity{
        //protected void onCreate2(Bundle savedInstanceState) {
        //  super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.Status);
       // button.setOnClickListener()(new View.OnClickListener() {
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // System.out.println("button clicked");
                 Intent status = new Intent(getApplicationContext(),Main2Activity.class);
                 startActivity(status);
            }
        });
        Button button2 = findViewById(R.id.Status);

        //}
        // }


    }
}



