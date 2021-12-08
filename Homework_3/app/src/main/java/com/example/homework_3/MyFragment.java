package com.example.homework_3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {
    Button ppMenu;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_with_menu, container, false);
        Button permiss = (Button) v.findViewById(R.id.button);


        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.options_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item . getItemId ();
        String getText = item.getTitle().toString();
        switch (id) {
            case R.id.first:
                PopupMenu popupMenu1 = new PopupMenu(MainActivity.this, id);
                popupMenu1.getMenu().add(getText);
                popupMenu1.show();
                break;
            case R.id.second:
                PopupMenu popupMenu2 = new PopupMenu(MainActivity.this, id);
                popupMenu2.getMenu().add(getText);
                popupMenu2.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
