package com.gcdevs.listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.listView);

        final ArrayList<String> familyNames = new ArrayList<>(
            asList(
                "Modesto",
                "Julia",
                "Antonio",
                "Laura",
                "Susana",
                "Carolina",
                "Alejandro"
            )
        );

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, familyNames);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(
                            MainActivity.this,
                            "Has pulsado en " + familyNames.get(i),
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        );
    }
}