package com.example.hw4_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button countBtn;
    private TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countBtn = (Button) findViewById(R.id.count);
        num = (TextView) findViewById(R.id.counter);

        if(savedInstanceState != null){
            num.setText(savedInstanceState.getString("reply_visible"));
        }

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int step = 1;
                int nowNum = Integer.parseInt(num.getText().toString());
                String count_text = (nowNum + step) + "";
                num.setText(count_text);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("reply_visible", num.getText().toString());
    }
}