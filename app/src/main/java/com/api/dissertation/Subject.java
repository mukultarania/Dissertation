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

        subjects.add("Geography");
        subjects.add("Science");
        subjects.add("Building & Planning");
        subjects.add("Arts & Humanities");
        subjects.add("Computing and IT");
        subjects.add("Design");
        subjects.add("Engineering");
        subjects.add("Health & Wellbeing");
        subjects.add("Law");
        subjects.add("Medical Sciences");
        subjects.add("Social Sciences");
        subjects.add("Technology");
        subjects.add("Nursing & Healthcare Practice");
        subjects.add("Mathematics & Statistics");
        subjects.add("Languages");
        subjects.add("Environment & Development");
        subjects.add("Education, Childhood & Youth");
        subjects.add("Business & Management");
        subjects.add("History");
        subjects.add("Civics");
        subjects.add("Hindi");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subjects);
        ListView listView = (ListView) findViewById(R.id.subject_activity);
        listView.setAdapter(itemsAdapter);
    }
}