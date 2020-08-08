package com.example.afrahcom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btnProvider,btnVisitor;



    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProvider=findViewById(R.id.providerButt);
        btnVisitor=findViewById(R.id.visitorButt);


        btnProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              i=new Intent(MainActivity.this, salatUsers.class)  ;
              startActivity(i);

            }
        });








   }
}