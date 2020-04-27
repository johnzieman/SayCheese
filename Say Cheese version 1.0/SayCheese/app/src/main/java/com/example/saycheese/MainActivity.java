package com.example.saycheese;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        listView = findViewById(R.id.categhoryList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent cheeseWindowIntent = new Intent(getApplicationContext(), cheeseCateghory.class);
                        startActivity(cheeseWindowIntent);
                        break;
                    case 1:
                        Intent productionWindowIntent = new Intent(getApplicationContext(), productionCateghory.class);
                        startActivity(productionWindowIntent);
                        break;
                }
            }
        });
    }
}
