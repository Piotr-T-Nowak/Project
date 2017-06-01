package com.pepenowak.generator;

import android.content.Intent;
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
    TextView result2;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateButton = (Button) findViewById(R.id.generate_button);
        result = (TextView) findViewById(R.id.result);
        result.setText("oczekuje na wynik");
        result2 = (TextView) findViewById(R.id.result2);
        result2.setText("oczekuje na wynmik");
        nextButton = (Button) findViewById(R.id.next);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "Button clicked");
                Random generator = new Random();
                result.setText("" + generator.nextInt(6) + 1);
                result2.setText("" + (generator.nextInt(6) + 1));
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}
