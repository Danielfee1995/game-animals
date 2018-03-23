package com.example.legendpeng.animal_game;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class play extends AppCompatActivity {
    private ImageButton btleftt;
    private ImageButton btleftc;
    private ImageButton btleftb;
    private ImageButton btrightt;
    private ImageButton btrightc;
    private ImageButton btrightb;
    private ImageButton bttemp;
    private Button btconcon;

    int[]numph=new int[5];
    int clqian=0;
    int score=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Random random=new Random();

        numph[0]=R.drawable.fish_okartboard;
        numph[1]=R.drawable.bird_okartboard;
        numph[2]=R.drawable.cat_okartboard;
        numph[3]=R.drawable.honey_okartboard;
        numph[4]=R.drawable.pig_okartboard;


        btleftt = (ImageButton) findViewById(R.id.buttonleftt);
        btleftc =(ImageButton)findViewById(R.id.buttonleftc);
        btleftb =(ImageButton)findViewById(R.id.buttonleftb);
        btrightt = (ImageButton) findViewById(R.id.buttonrightt);
        btrightc =(ImageButton)findViewById(R.id.buttonrightc);
        btrightb =(ImageButton)findViewById(R.id.buttonrightb);
        btconcon=(Button)findViewById(R.id.confirm);


        final int pngid[]=new int[6];
        for(int j=0;j<6;j++)
        {
            pngid[j]=random.nextInt(4);
        }

        btleftt.setImageResource(numph [pngid[3]]);
        btleftc.setImageResource(numph [pngid[4]]);
        btleftb.setImageResource(numph [pngid[5]]);
        btrightt.setImageResource(numph[pngid[0]]);
        btrightc.setImageResource(numph[pngid[1]]);
        btrightb.setImageResource(numph[pngid[2]]);


        btrightt.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                //Toast.makeText(play.this, "111", Toast.LENGTH_SHORT).show();
                btrightt.getBackground().setAlpha(255);
                //clqian+=1;
                //Toast.makeText(play.this, clqian, Toast.LENGTH_SHORT).show();
               // Log log;
               // log.i("clqian:",clqian);
                if(clqian==0)
                {
                    clqian=numph [pngid[0]];
                    bttemp=btrightt;
                }
                else
                {
                    if(clqian==numph[pngid[0]])
                    {
                        score+=1;
                        Toast.makeText(play.this, "score:"+score, Toast.LENGTH_SHORT).show();
                        btrightt.setVisibility(View.INVISIBLE);
                        bttemp.setVisibility(View.INVISIBLE);


                    }
                    else {
                        Intent intent = new Intent();
                        intent.setClass(play.this, OverActivity.class);

                        intent.putExtra("score",Integer.toString(score));
                        startActivity(intent);
                    }
                    clqian=0;
                }
            }
        });
        btrightc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(play.this, clqian, Toast.LENGTH_SHORT).show();
                if(clqian==0)
                {
                    clqian=numph [pngid[1]];
                    bttemp=btrightc;
                }
                else
                {
                    if(clqian==numph[pngid[1]])
                    {
                        score+=1;
                        Toast.makeText(play.this, "score:"+score, Toast.LENGTH_SHORT).show();
                        btrightc.setVisibility(View.INVISIBLE);
                        bttemp.setVisibility(View.INVISIBLE);

                    }
                    else {
                        Intent intent = new Intent();
                        intent.setClass(play.this, OverActivity.class);
                        intent.putExtra("score",Integer.toString(score));
                        startActivity(intent);
                    }
                    clqian=0;
                }

            }
        });
        btrightb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clqian==0)
                {
                    clqian=numph [pngid[2]];
                    bttemp=btrightb;
                }
                else
                {
                    if(clqian==numph[pngid[2]])
                    {
                        score+=1;
                        Toast.makeText(play.this, "score:"+score, Toast.LENGTH_SHORT).show();
                        btrightb.setVisibility(View.INVISIBLE);
                        bttemp.setVisibility(View.INVISIBLE);

                    }
                    else {
                        Intent intent = new Intent();
                        intent.setClass(play.this, OverActivity.class);
                        intent.putExtra("score",Integer.toString(score));
                        startActivity(intent);
                    }
                    clqian=0;
                }

            }
        });
        btleftt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clqian==0)
                {
                    clqian=numph [pngid[3]];
                    bttemp=btleftt;
                }
                else
                {
                    if(clqian==numph[pngid[3]])
                    {
                        score+=1;
                        Toast.makeText(play.this, "score:"+score, Toast.LENGTH_SHORT).show();
                        btleftt.setVisibility(View.INVISIBLE);
                        bttemp.setVisibility(View.INVISIBLE);

                    }
                    else {
                        Intent intent = new Intent();
                        intent.setClass(play.this, OverActivity.class);
                        intent.putExtra("score",Integer.toString(score));
                        startActivity(intent);
                    }
                    clqian=0;
                }

            }
        });
        btleftc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clqian==0)
                {
                    clqian=numph [pngid[4]];
                    bttemp=btleftc;
                }
                else
                {
                    if(clqian==numph[pngid[4]])
                    {
                        score+=1;
                        Toast.makeText(play.this, "score:"+score, Toast.LENGTH_SHORT).show();
                        btleftc.setVisibility(View.INVISIBLE);
                        bttemp.setVisibility(View.INVISIBLE);

                    }
                    else {
                        Intent intent = new Intent();
                        intent.setClass(play.this, OverActivity.class);
                        intent.putExtra("score",Integer.toString(score));
                        startActivity(intent);
                    }
                    clqian=0;
                }

            }
        });
        btleftb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clqian==0)
                {
                    clqian=numph [pngid[5]];
                    bttemp=btleftb;
                }
                else
                {
                    if(clqian==numph[pngid[5]])
                    {
                        score+=1;
                        Toast.makeText(play.this, "score:"+score, Toast.LENGTH_SHORT).show();
                        btleftb.setVisibility(View.INVISIBLE);
                        bttemp.setVisibility(View.INVISIBLE);

                    }
                    else {
                        Intent intent = new Intent();
                        intent.setClass(play.this, OverActivity.class);
                        intent.putExtra("score",Integer.toString(score));
                        startActivity(intent);
                    }

                    clqian=0;
                }

            }
        });
        btconcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                for(int j=0;j<6;j++)
                {
                    pngid[j]=random.nextInt(4);
                }

                btleftt .setImageResource(numph [pngid[3]]);
                btleftc .setImageResource(numph [pngid[4]]);
                btleftb .setImageResource(numph [pngid[5]]);
                btrightt.setImageResource(numph[pngid[0]]);
                btrightc.setImageResource(numph[pngid[1]]);
                btrightb.setImageResource(numph[pngid[2]]);

                btleftt .setVisibility(View.VISIBLE);
                btleftc .setVisibility(View.VISIBLE);
                btleftb .setVisibility(View.VISIBLE);
                btrightt.setVisibility(View.VISIBLE);
                btrightc.setVisibility(View.VISIBLE);
                btrightb.setVisibility(View.VISIBLE);





            }
        });

    }

}


