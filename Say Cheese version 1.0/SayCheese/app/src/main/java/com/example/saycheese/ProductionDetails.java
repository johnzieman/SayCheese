package com.example.saycheese;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductionDetails extends AppCompatActivity {
    private ImageView imageViewImage;
    private TextView textViewTitle;
    private TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_details);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
        imageViewImage = findViewById(R.id.imageViewImage);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewInfo = findViewById(R.id.textViewInfo);
        Intent intent = getIntent();
        if(intent.hasExtra("image") && intent.hasExtra("title") && intent.hasExtra("info")){
            int image = intent.getIntExtra("image", -1);
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            imageViewImage.setImageResource(image);
            textViewTitle.setText(title);
            textViewInfo.setText(info);
        }
        else{
            Intent intentBack = new Intent(this, Production.class);
            startActivity(intentBack);
        }
    }
}
