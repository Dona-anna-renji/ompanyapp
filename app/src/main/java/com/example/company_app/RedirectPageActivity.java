package com.example.company_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RedirectPageActivity extends AppCompatActivity {
    Button b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_redirect_page);

        b2=(Button) findViewById(R.id.Redirectadd);
        b3=(Button) findViewById(R.id.Redirectsearch);
        b4=(Button) findViewById(R.id.Redirectlogout);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o2=new Intent(getApplicationContext(),AddEmployeeActivity.class);
                startActivity(o2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o3=new Intent(getApplicationContext(),SearchEmpActivity.class);
                startActivity(o3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o4=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(o4);
            }
        });
    }
}