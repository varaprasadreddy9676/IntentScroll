package com.example.prasad.intentscroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void text1(View view) {
        Intent i1=new Intent(this,scroll.class);
        i1.putExtra("text",getString(R.string.first));
        startActivity(i1);

    }

    public void text2(View view) {
        Intent i2=new Intent(this,scroll.class);
        i2.putExtra("text",getString(R.string.second));

        startActivity(i2);
    }

    public void text3(View view) {
        Intent i3=new Intent(this,scroll.class);
        i3.putExtra("text",getString(R.string.third));
        startActivity(i3);
    }
}
