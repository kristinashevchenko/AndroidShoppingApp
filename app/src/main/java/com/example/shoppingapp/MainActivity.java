package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<ShoppingItem> items = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.shopping_list);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        items.add(new ShoppingItem("Buy apples", "3 items", "apple"));
        items.add(new ShoppingItem("Hand in the project", "Till November 8", "laptop"));
        items.add(new ShoppingItem("Plan presents", "For Christmas", "present"));
        ShoppingAppArrayAdapter adapter = new ShoppingAppArrayAdapter(this, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                final ShoppingItem clickedItem = (ShoppingItem) adapterView.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
                intent.putExtra("ITEM_TITLE", clickedItem.getTitle());
                intent.putExtra("ITEM_SUBTITLE", clickedItem.getSubtitle());
                intent.putExtra("ITEM_IMAGE", clickedItem.getImage());
                startActivity(intent);
            }
        });
    }
}