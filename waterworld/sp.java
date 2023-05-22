package com.example.waterworld;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sp extends AppCompatActivity {

    Button button;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        text1 = findViewById(R.id.textView3);
        button = findViewById(R.id.submitButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent i = new Intent(getApplicationContext(), utama.class);
                startActivity(i);
            }
        });
    }
}