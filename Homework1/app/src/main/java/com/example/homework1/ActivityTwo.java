package com.example.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityTwo extends Activity implements View.OnClickListener{

    EditText newText;
    Button apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        EditText newText = (EditText) findViewById(R.id.editText);
        Button apply = (Button)findViewById(R.id.button2);
        apply.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("value", apply.getText().toString());
        setResult(RESULT_OK,intent);
        finish();

    }
}
