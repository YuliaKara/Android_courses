package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
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
            FragmentTransaction fragTrans = fragMan.beginTransaction();
            MyFragment myFrag = new MyFragment();
            fragTrans.add(R.id.fragment, myFrag);
            fragTrans.commit();
        }
    }
}