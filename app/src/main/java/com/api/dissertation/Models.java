package com.api.dissertation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Models extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_models);
        final ArrayList<Model> arrayList = new ArrayList<>();
        arrayList.add(new Model("Alobee", "isohdioasodhaoshodahosdahoihdoahsodhoahoahod"));
        arrayList.add(new Model("Blobee", "isohdioasodhaoshodahosdahoihdoahsodhoahoahod"));
        arrayList.add(new Model("Clobee", "isohdioasodhaoshodahosdahoihdoahsodhoahoahod"));
        arrayList.add(new Model("Globee", "isohdioasodhaoshodahosdahoihdoahsodhoahoahod"));
        arrayList.add(new Model("Dlobee", "isohdioasodhaoshodahosdahoihdoahsodhoahoahod"));


        ModelAdapter modelAdapter = new ModelAdapter(this, arrayList);
        ListView listView = (ListView) findViewById(R.id.model_list);
        listView.setAdapter(modelAdapter);
    }
}