package com.example.homework_2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
                throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String stringFromFragment = intent.getStringExtra("string param");
        Toast.makeText(this, "Данные переданы в сервис", Toast.LENGTH_SHORT).show();


        return START_NOT_STICKY;
    }
}