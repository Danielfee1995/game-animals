package com.example.legendpeng.animal_game;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {
    private Button btnplay;
    private Button btset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplay = (Button) findViewById(R.id.button);
        btset=(Button)findViewById(R.id.button2);
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, play.class);
                startActivity(intent);
            }
        });
        btset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

//        Resources resources=getApplicationContext().getResources();
//        Drawable bgDrawable=resources.getDrawable(R.drawable.bg_blue_game.png);
//        R.layout.setBackGroundDrawable(bgDrawable);
    }

}


