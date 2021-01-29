package com.api.dissertation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class TeacherActivity extends AppCompatActivity {

    private Button unity, cg_trader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        unity = findViewById(R.id.unity);
        cg_trader = findViewById(R.id.cg_trader);

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
        ListView listView = (ListView) findViewById(R.id.subjects);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) listView.getItemAtPosition(position);
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ar@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Sending Content to AR Implementation");
                emailIntent.putExtra(Intent.EXTRA_TEXT   , "Here is all the content for "+item);
                startActivity(emailIntent);
            }
        });

        unity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlString = "https://assetstore.unity.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.android.chrome");
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException ex) {
                    // Chrome browser presumably not installed so allow user to choose instead
                    intent.setPackage(null);
                    startActivity(intent);
                }
            }
        });

        cg_trader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlString = "https://www.cgtrader.com/free-3d-models";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.android.chrome");
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException ex) {
                    // Chrome browser presumably not installed so allow user to choose instead
                    intent.setPackage(null);
                    startActivity(intent);
                }
            }
        });
    }
}