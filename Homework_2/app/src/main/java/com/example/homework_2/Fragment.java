package com.example.homework_2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Fragment extends androidx.fragment.app.Fragment {
    
    public final static String BROADCAST_ACTION = "ru.homework_2.action.my_receiver";

    BroadcastReceiver br;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment,container,false);

        br = new BroadcastReceiver(){

            @Override
            public void onReceive(Context context, Intent intent) {

            }
            IntentFilter intFilt = new IntentFilter(BROADCAST_ACTION);
            getActivity().registerReciever
        };

        Button button = (Button)v.findViewById(R.id.button);
        TextView textView = (TextView)v.findViewById(R.id.textView);
        EditText editText = (EditText)v.findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MyService.class);
                intent.putExtra("string param", editText.getText().toString());
                getActivity().startService(intent);

            }
        });
        return v;
    }
}
