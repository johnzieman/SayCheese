package com.example.saycheese;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class productionCateghory extends AppCompatActivity {
    private ListView listViewPro;
    private ArrayList<Production> production;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_categhory);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        listViewPro = findViewById(R.id.listViewPro);
        production = new ArrayList<>();
        production.add(new Production(getString(R.string.cabot_title), getString(R.string.cabot_info), R.drawable.cabot));
        production.add(new Production(getString(R.string.cowgirl_title), getString(R.string.cowgirl_info), R.drawable.cowgirl));
        production.add(new Production(getString(R.string.grafton_title), getString(R.string.grafton_info), R.drawable.grafton));
        production.add(new Production(getString(R.string.kraft_title), getString(R.string.kraft_info), R.drawable.kraft));
        production.add(new Production(getString(R.string.vermont_title), getString(R.string.vermont_info), R.drawable.vermont));
        listViewPro = findViewById(R.id.listViewPro);
        ArrayAdapter<Production> productionArrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, production);
        listViewPro.setAdapter(productionArrayAdapter);

        listViewPro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Production productions = production.get(position);
                Intent intent = new Intent(getApplicationContext(), ProductionDetails.class);
                intent.putExtra("image", productions.getImageId());
                intent.putExtra("title", productions.getTitle());
                intent.putExtra("info", productions.getInfo());
                startActivity(intent);
            }
        });
    }
}
