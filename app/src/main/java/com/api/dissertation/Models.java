package com.api.dissertation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class Models extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_models);
        final ArrayList<Model> arrayList = new ArrayList<>();
        arrayList.add(new Model("Poly Earth", "Earth is the third planet from the Sun and the only astronomical object known to harbor life.", R.drawable.earth));
        arrayList.add(new Model("Sun", "The Sun is the star at the center of the Solar System. It is a nearly perfect sphere of hot plasma, heated to incandescence by nuclear fusion reactions in its core, radiating the energy mainly as visible light and infrared radiation. It is by far the most important source of energy for life on Earth.",R.drawable.sun));
        arrayList.add(new Model("Moon", "The Moon is Earth's only proper natural satellite. It is one quarter the diameter of Earth making it the largest natural satellite in the Solar System relative to the size of its planet.", R.drawable.moon));
        arrayList.add(new Model("Jupiter", "Jupiter is the fifth planet from the Sun and the largest in the Solar System. It is a gas giant with a mass one-thousandth that of the Sun, but two-and-a-half times that of all the other planets in the Solar System combined.", R.drawable.jupiter));

        ModelAdapter modelAdapter = new ModelAdapter(this, arrayList);
        ListView listView = (ListView) findViewById(R.id.model_list);
        listView.setAdapter(modelAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try{
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}