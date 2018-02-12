package com.example.coding4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class DetailedActivity extends AppCompatActivity {
    ImageView imageView;
    //Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        imageView = findViewById(R.id.imageView2);
        //toolbar = findViewById(R.id.toolbar2);
        Bundle bundle = getIntent().getExtras();
        imageView.setImageResource(bundle.getInt("itemPic"));
        //toolbar.setTitle(bundle.getString("itemName"));
    }
}
