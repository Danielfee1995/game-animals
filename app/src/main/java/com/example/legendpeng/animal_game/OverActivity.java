package com.example.legendpeng.animal_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OverActivity extends AppCompatActivity {

    private TextView tscore;
    private Button btcon;
    private Button btback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over);

        Intent getIntent=getIntent();
        String score=getIntent.getStringExtra("score");
        tscore=(TextView)findViewById(R.id.textViewscore);
        btcon=(Button)findViewById(R.id.buttoncti) ;
        btback=(Button)findViewById(R.id.buttonb);

        tscore.setText("score:"+score);

        btcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(OverActivity.this, play.class);
                startActivity(intent);
            }
        });
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(OverActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
