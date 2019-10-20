package com.example.neverlost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class KidStatus extends AppCompatActivity {
String u;
String p;

    //public static final String EXTRA_KEY_1 = "EXTRA_KEY_1";
    //public static final String EXTRA_KEY_2 = "EXTRA_KEY_2";
    //TextView receive;
    //TextView receive2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Intent i = getIntent();
        //i.putExtra("EXTRA_KEY_1",R.id.textView1);
        //i.putExtra("EXTRA_KEY_2",R.id.textView5);
       // receive = (TextView)findViewById(R.id.textView1);

       // receive.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));
       // receive2 = (TextView)findViewById(R.id.textView5);

        //receive2.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));

        setContentView(R.layout.activity_kid_status);

       // u = i.getStringExtra("uadsdsadsdf");
       // p = i.getStringExtra("paafegeg");
       /// TextView tvu = (TextView) findViewById(R.id.textView1);
        //TextView tvp = (TextView) findViewById(R.id.textView5);


       // tvu.setText((u.toString()));
       // tvp.setText(p.toString());
        Button hi = findViewById(R.id.button2);
        hi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent status = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(status);
            }

        });




    }

}