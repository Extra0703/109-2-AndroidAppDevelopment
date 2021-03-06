package com.example.HelloConstraint;

import android.graphics.Color;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnZero = (Button) findViewById(R.id.button3);
        final Button btnCount = (Button) findViewById(R.id.button2);

        btnCount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Log.d("Debug", "click!!!!!!");
                TextView show_count = (TextView) findViewById(R.id.textView);
                int count = Integer.parseInt((String) show_count.getText())  + 1;
                show_count.setText(String.valueOf(count));
                if(count!=0){
                    btnZero.setBackgroundColor(Color.parseColor("#3f3f3f"));
                }
                if(count%2==1){
                    btnCount.setBackgroundColor(Color.rgb(150, 150, 100));
                }else{
                    btnCount.setBackgroundColor(Color.parseColor("#3F51B5"));
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView show_count = (TextView) findViewById(R.id.textView);
                show_count.setText(String.valueOf(0));
                btnZero.setBackgroundColor(Color.rgb(170, 170, 170));
            }
        });
    }
}
