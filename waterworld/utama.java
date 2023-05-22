package com.example.waterworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class utama extends AppCompatActivity {

    ImageView Image;
    ImageView Image1;
    ImageView Image2;
    ImageView Image3;
    ImageView Image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        Intent i = getIntent();
        String X = i.getStringExtra("nilai");

        Image= findViewById(R.id.laut);

        Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent i = new Intent(getApplicationContext(), laut.class);
                startActivity(i);
            }
        });

        Image1= findViewById(R.id.sungai);
        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent i = new Intent(getApplicationContext(), sungai.class);
                startActivity(i);
            }
        });

        Image2= findViewById(R.id.danau);
        Image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent i = new Intent(getApplicationContext(), danau.class);
                startActivity(i);
            }
        });

        Image3= findViewById(R.id.gambar);
        Image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent i = new Intent(getApplicationContext(), tebak.class);
                startActivity(i);
            }
        });

        Image4= findViewById(R.id.quiz2);
        Image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent i = new Intent(getApplicationContext(), quiz2.class);
                startActivity(i);
            }
        });
    }
}