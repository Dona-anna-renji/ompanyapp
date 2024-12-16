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

public class AddEmployeeActivity extends AppCompatActivity {
    Button b6,submit;
    EditText codebtn,namebtn,mailbtn,salbtn,degbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_employee);

        b6=(Button) findViewById(R.id.AddLogOut);
        namebtn=(EditText) findViewById(R.id.addempname);
        degbtn=(EditText) findViewById(R.id.addempdesg);
        mailbtn=(EditText) findViewById(R.id.addempmail);
        codebtn=(EditText) findViewById(R.id.addempcode);
        salbtn=(EditText) findViewById(R.id.addsalary);
        submit=(Button) findViewById(R.id.AddSubmit);





        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o6=new Intent(getApplicationContext(),RedirectPageActivity.class);
                startActivity(o6);
            }
        });

    }
}