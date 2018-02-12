package com.example.coding4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;
/*
* customised listview
* */
public class MainActivity extends AppCompatActivity {
    ListView listView;
    //Toolbar toolbar;

    String[] items = {"Google Plus", "Twitter", "Windows", "Bing", "itunes", "wordpress", "drupal"};
    int[] items_pics = {R.drawable.googleplus, R.drawable.twitter, R.drawable.windows, R.drawable.bing,
                        R.drawable.itunes, R.drawable.wordpress, R.drawable.drupal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar = findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.listview);
        if (listView == null) {
            Log.i("mylog", "null listView");
        } else {
            Log.i("mylog", "listView");
        }
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, items, items_pics);
        if (myAdapter == null) {
            Log.i("mylog", "null adapter");
        } else {
            Log.i("mylog", "adapter");
        }
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
                intent.putExtra("itemName", items[i]);
                intent.putExtra("itemPic", items_pics[i]);
                startActivity(intent);
            }
        });
    }
}
