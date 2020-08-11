package com.example.afrahcom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btnProvider,btnVisitor;



    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProvider=(Button)findViewById(R.id.but1);

        btnProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                i=new Intent(MainActivity.this, FirstFragment.class)  ;
//                startActivity(i);

                Toast.makeText(MainActivity.this, "000000", Toast.LENGTH_SHORT).show();
            }
        });








   }
}