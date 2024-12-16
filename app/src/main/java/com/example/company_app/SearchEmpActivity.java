package com.example.company_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SearchEmpActivity extends AppCompatActivity {
    Button b5,searchbtn;
    EditText searchcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_emp);

        b5=(Button) findViewById(R.id.Sbacktomenu);
        searchcode=(EditText) findViewById(R.id.Sempcode);
        searchbtn=(Button) findViewById(R.id.Ssearch);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o5=new Intent(getApplicationContext(),RedirectPageActivity.class);
                startActivity(o5);
            }
        });



    }
}