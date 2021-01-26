package com.api.dissertation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Subject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        ArrayList<String> subjects = new ArrayList<String>();
        subjects.add("Science");
        subjects.add("Geography");
        subjects.add("Science");
        subjects.add("Geography");
        subjects.add("Science");
        subjects.add("Geography");
        subjects.add("Science");
        subjects.add("Geography");
        subjects.add("Science");
        subjects.add("Geography");
        subjects.add("Science");
        subjects.add("Geography");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subjects);
        ListView listView = (ListView) findViewById(R.id.subject_activity);
        listView.setAdapter(itemsAdapter);
    }
}