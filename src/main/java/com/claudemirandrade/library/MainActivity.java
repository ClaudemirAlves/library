package com.claudemirandrade.library;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.claudemirandrade.library.author.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //metodo necessario para a criacao do menu.

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_main, new MainFragment()).commit();
        }
    }
}