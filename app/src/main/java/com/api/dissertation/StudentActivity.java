package com.api.dissertation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static androidx.core.content.ContextCompat.startActivity;

public class StudentActivity extends AppCompatActivity {

    private Button sub, mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        sub = findViewById(R.id.subj);
        mode = findViewById(R.id.model);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentActivity.this , Subject.class));
            }
        });

        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentActivity.this , Models.class));
            }
        });
    }
}