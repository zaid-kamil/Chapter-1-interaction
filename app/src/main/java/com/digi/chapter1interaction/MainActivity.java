package com.digi.chapter1interaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mCount = 0 ;
    TextView show_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_count = findViewById(R.id.show_count);
    }

    public void showToast(View v){
        Toast.makeText(this, R.string.toast_msg, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View v){
        mCount++;
        show_count.setText(String.valueOf(mCount));
    }
}