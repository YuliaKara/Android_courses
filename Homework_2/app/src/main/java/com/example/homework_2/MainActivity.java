package com.example.homework_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null){
            FragmentManager fragMan = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragMan.beginTransaction();
            Fragment myFrag = new Fragment();
            fragmentTransaction.add(R.id.jar, myFrag);
            fragmentTransaction.commit();

        }

    }
}