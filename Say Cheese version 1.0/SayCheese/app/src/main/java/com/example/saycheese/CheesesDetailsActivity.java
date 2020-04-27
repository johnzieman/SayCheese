package com.example.saycheese;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CheesesDetailsActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textViewTitle;
    private TextView textViewInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheeses_details);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
        imageView = findViewById(R.id.imageViewId);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewInfo = findViewById(R.id.textViewInfo);
        Intent intent = getIntent();
        if(intent.hasExtra("image") && intent.hasExtra("title") && intent.hasExtra("info")){
            int imageId = intent.getIntExtra("image", -1);
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            imageView.setImageResource(imageId);
            textViewTitle.setText(title);
            textViewInfo.setText(info);
        }
        else{
            Intent returnBack = new Intent(this, cheeseCateghory.class);
            startActivity(returnBack);
        }
    }
}
