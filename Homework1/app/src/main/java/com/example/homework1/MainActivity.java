package com.example.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private static final int REQUEST_CODE = 100;
    private static final String DATA = "data";
    TextView text;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView)findViewById(R.id.textView);
        Button next = (Button)findViewById(R.id.button1);
        next.setOnClickListener(view ->{
            Intent intent = new Intent(this, ActivityTwo.class);
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    private void startActivityForResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case REQUEST_CODE:
                String val = data.getStringExtra(DATA);
                text.setText("New text is" + val);
                break;
        }
    }

}