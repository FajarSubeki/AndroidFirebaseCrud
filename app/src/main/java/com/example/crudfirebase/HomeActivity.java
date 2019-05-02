package com.example.crudfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button crud1, crud2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        crud1 = findViewById(R.id.btnCrud1);
        crud2 = findViewById(R.id.btnCrud2);

        crud1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        crud2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crud = new Intent(HomeActivity.this ,CrudActivity.class);
                startActivity(crud);
            }
        });
    }
}
