package com.pepenowak.generator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button generateButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateButton = (Button) findViewById(R.id.generate_button);
        result = (TextView) findViewById(R.id.result);
        result.setText("oczekuje na wynik");
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "Button clicked");
                Random generator = new Random();
                result.setText("" + generator.nextInt(6));
            }
        });

    }
}
