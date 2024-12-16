package com.example.company_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1;

    EditText e1, e2;

    String Suser, Spass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.lbtn);
        e1 = (EditText) findViewById(R.id.luname);
        e2 = (EditText) findViewById(R.id.lpass);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Suser = e1.getText().toString();
                Spass = e2.getText().toString();
                if (Suser.equals("admin") && Spass.equals("12345")) {
                    Intent i = new Intent(MainActivity.this, RedirectPageActivity.class);
                    startActivity(i);
                } else {
                    showInvalidLoginDialog();

                }

            }
        });

    }

    private void showInvalidLoginDialog()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Login Failed");
        builder.setMessage("Invalid username and password .please try again");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alterDialog= builder.create();
        alterDialog.show();



    }
}

