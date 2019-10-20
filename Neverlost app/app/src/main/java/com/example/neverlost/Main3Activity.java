package com.example.neverlost;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PublicKey;

public class Main3Activity extends AppCompatActivity {
    EditText SendValue;
    EditText SendValue2;
    Button SendEditTextValue;
    Intent intent;
    Intent intent2;
    Button SendEditTextValue2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

       // SendEditTextValue = (Button)findViewById(R.id.button1);
        EditText we = (EditText)findViewById(R.id.editText1);
       // SendEditTextValue2 = (Button)findViewById(R.id.button1);
        EditText ew= (EditText)findViewById(R.id.editText2);
        final String wew = we.getText().toString();
        final String r = ew.getText().toString();






        Button w = findViewById(R.id.Done);
        w.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent  i= new Intent(getApplicationContext(),Main4Activity.class);
                i.putExtra("Data",(new Object(){String value1=wew; String value2 = r;}));
                Intent status = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(status);
            }

        });

    }
}