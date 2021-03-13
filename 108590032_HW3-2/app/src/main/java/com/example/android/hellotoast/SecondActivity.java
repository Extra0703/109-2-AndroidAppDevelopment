package com.example.android.hellotoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView aaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        aaa = (TextView) findViewById(R.id.num);

        Bundle bundle = getIntent().getExtras();
        int number = bundle.getInt("count");
        aaa.setText(""+number+"");
    }
}
