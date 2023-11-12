package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    TextView titleView;
    TextView subtitleView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        titleView = findViewById(R.id.detailed_item_title);
        subtitleView = findViewById(R.id.detailed_item_subtitle);
        imageView = findViewById(R.id.detailed_item_image);

        String title = getIntent().getStringExtra("ITEM_TITLE");
        String subtitle = getIntent().getStringExtra("ITEM_SUBTITLE");
        String image = getIntent().getStringExtra("ITEM_IMAGE");

        int imageId = getResources().getIdentifier(image, "drawable", getPackageName());

        titleView.setText(title);
        subtitleView.setText(subtitle);
        imageView.setImageResource(imageId);
    }
}