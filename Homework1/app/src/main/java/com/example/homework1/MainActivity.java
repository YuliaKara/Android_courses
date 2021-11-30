package com.example.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView text;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView)findViewById(R.id.textView);
        Button next = (Button)findViewById(R.id.button1);
        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivityForResult(intent,1);
    }

    private void startActivityForResult(int requestCode, int resultCode, Intent value) {
        if (value == null) {return;}
        String val = value.getStringExtra("value");
        text.setText(val);
    }

}