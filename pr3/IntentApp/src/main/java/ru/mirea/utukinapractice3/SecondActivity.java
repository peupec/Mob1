package ru.mirea.utukinapractice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Second_Activity);
        String date = (String) getIntent().getSerializableExtra("date");
        TextView textView = findViewById(R.id.textView);
        textView.setText(date);
    }
}