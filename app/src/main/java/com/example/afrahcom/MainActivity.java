package com.example.afrahcom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    TextView t1;
    TextView t2;

    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.img11);
        btn2=findViewById(R.id.img12);
        btn3=findViewById(R.id.img13);
        btn4=findViewById(R.id.img21);
        btn5=findViewById(R.id.img22);
        btn6=findViewById(R.id.img23);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              i=new Intent(MainActivity.this,page2.class)  ;
              startActivity(i);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,page2.class)  ;
                startActivity(i);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,page2.class)  ;
                startActivity(i);

            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,page2.class)  ;
                startActivity(i);

            }
        });



        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,page2.class)  ;
                startActivity(i);

            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,page2.class)  ;
                startActivity(i);

            }
        });







    }
}