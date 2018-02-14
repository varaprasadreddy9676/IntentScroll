package com.example.prasad.intentscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class scroll extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        tv1=findViewById(R.id.tv1) ;

        Bundle b1=getIntent().getExtras();
        String s1=b1.getString("text");
        tv1.setText(s1);
    }
}
