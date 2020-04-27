package com.example.saycheese;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class cheeseCateghory extends AppCompatActivity {
    private ArrayList<Cheese> cheeses;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheese_categhory);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        cheeses = new ArrayList<>();
        cheeses.add(new Cheese(getString(R.string.mazarella_title), getString(R.string.mazarella_info), R.drawable.mozzarella));
        cheeses.add(new Cheese(getString(R.string.parmesan_title), getString(R.string.parmesan_info), R.drawable.parmesan));
        cheeses.add(new Cheese(getString(R.string.cheddar_title), getString(R.string.cheddar_info), R.drawable.cheddar));
        cheeses.add(new Cheese(getString(R.string.gouda), getString(R.string.gouda_info), R.drawable.gouda));
        cheeses.add(new Cheese(getString(R.string.swiss_cheese), getString(R.string.swiss_cheese_info), R.drawable.swiss_cheese));
        cheeses.add(new Cheese(getString(R.string.emmentaler),getString(R.string.emmentaler_info), R.drawable.emmentaler));
        cheeses.add(new Cheese(getString(R.string.brie), getString(R.string.brie_info), R.drawable.brie));
        cheeses.add(new Cheese(getString(R.string.camembert), getString(R.string.camembert_info), R.drawable.camembert));
        cheeses.add(new Cheese(getString(R.string.gruyere_cheese), getString(R.string.gruyere_cheese_info), R.drawable.gruyere_cheese));
        cheeses.add(new Cheese(getString(R.string.feta), getString(R.string.feta_info), R.drawable.feta_cheese));
        cheeses.add(new Cheese(getString(R.string.monterey_jack), getString(R.string.monterey_info), R.drawable.monterey));
        cheeses.add(new Cheese(getString(R.string.provolone), getString(R.string.provolone_info), R.drawable.provolone));
        cheeses.add(new Cheese(getString(R.string.edam), getString(R.string.edam_info), R.drawable.edam));
        cheeses.add(new Cheese(getString(R.string.blue_cheese), getString(R.string.blue_cheese_info), R.drawable.blue));
        cheeses.add(new Cheese(getString(R.string.gorgonzola), getString(R.string.gorgonzola_info), R.drawable.gorgonzola));
        cheeses.add(new Cheese(getString(R.string.roquefort), getString(R.string.roquefort_info), R.drawable.roquefort));
        cheeses.add(new Cheese(getString(R.string.cottage_cheese), getString(R.string.cottage_cheese_info), R.drawable.cottage));
        cheeses.add(new Cheese(getString(R.string.ricotta), getString(R.string.ricotta_info), R.drawable.ricotta));
        cheeses.add(new Cheese(getString(R.string.mascarpone), getString(R.string.mascarpone_info), R.drawable.mascarpone));
        cheeses.add(new Cheese(getString(R.string.halloumi), getString(R.string.halloumi_info), R.drawable.halloumi));
        listView = findViewById(R.id.cheeseList);
        ArrayAdapter<Cheese> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, cheeses);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cheese cheese = cheeses.get(position);
                Intent intent = new Intent(getApplicationContext(), CheesesDetailsActivity.class);
                intent.putExtra("title", cheese.getTitle());
                intent.putExtra("info", cheese.getInfo());
                intent.putExtra("image", cheese.getImageId());
                startActivity(intent);
            }
        });
    }
}
