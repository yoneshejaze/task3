package com.example.chesswithrecview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent=getIntent();
        int index=intent.getIntExtra("ItemId",0);
        textView=findViewById(R.id.textView);
        textView.setText(textView.getText().toString()+index);
    }
}
