package com.example.slidepuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class FreeModeScreen extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_mode_screen);

        //btn_gamestart 구현
        ImageButton btnFreeMode = findViewById(R.id.btn_game_start);
        btnFreeMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FreeModeScreen.this, FreeModePlayScreen.class);
                startActivity(intent);
            }
        });

        //btn_back 구현
        ImageButton btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnBack.goBack(FreeModeScreen.this);
            }
        });
    }
}
