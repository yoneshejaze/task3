package com.example.chesswithrecview;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent=this.getIntent();
        String name=intent.getStringExtra("name");
        int image = intent.getIntExtra("image", R.drawable.fruit1);
        textView=findViewById(R.id.textView);
        textView.setText(name);
        imageView=findViewById(R.id.imageView2);
        imageView.setImageResource(image);

    }
}
