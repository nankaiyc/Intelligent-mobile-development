package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button ButtonCount;
    private Button ButtonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        ButtonCount = findViewById(R.id.button_count);
        ButtonZero = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void turnZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        ButtonCount.setBackgroundColor(Color.parseColor("#0000FF"));
        ButtonZero.setBackgroundColor(Color.parseColor("#A9A9A9"));
    }

    public void countUp(View view) {
        ++mCount;
        if (mCount % 2 == 1){
            ButtonCount.setBackgroundColor(Color.parseColor("#7FFF00"));
        }

        if (mCount % 2 == 0){
            ButtonCount.setBackgroundColor(Color.parseColor("#0000FF"));
        }

        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            ButtonZero.setBackgroundColor(Color.parseColor("#FF69B4"));
        }

    }
}