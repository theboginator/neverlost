package com.example.neverlost;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            //URL url = new URL("https://www.youtube.com");

       // try {
        //    URL url = new URL("https://www.youtube.com");
         //   HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //} catch (IOException e) {
        //    e.printStackTrace();
       // }

        Button button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // System.out.println("button clicked");
                Intent status = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(status);
            }

        });
        Button button3 = findViewById(R.id.button6);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // System.out.println("button clicked");
                Intent status = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(status);
            }

        });
        // Toolbar toolbar = findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
       // Map<String,String> website = new HashMap<>();
       /* FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }*/
       // });
    }

}
