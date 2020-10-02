package com.example.unalomuzo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout clickme;
    private int szamlalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szamlalo++;
                AlertDialog.Builder alert= new AlertDialog.Builder(MainActivity.this);
                if (szamlalo==10)
                {
                    alert.setTitle("Message");
                    alert.setMessage("Már csak 90 Click és tiéd az új Iphone X");
                }
                else if(szamlalo==50)
                {

                }
            }
        });
    }
    private void init()
    {
        clickme=findViewById(R.id.main_layout);
        szamlalo=0;
    }
}
