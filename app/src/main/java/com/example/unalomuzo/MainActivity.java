package com.example.unalomuzo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout clickme;
    private int szamlalo;
    private TextView szamlaloText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szamlalo++;
                szamlaloText.setText("Szamlalo: "+szamlalo);
                AlertDialog.Builder alert= new AlertDialog.Builder(MainActivity.this);
               if (szamlalo==10)
               {
                   alert.setTitle("Message");
                   alert.setMessage("Még 90 click és öné lehet az új Iphone X");
                   AlertDialog alertShow=alert.create();
                   alertShow.show();
               }
               else if (szamlalo==50)
               {
                    alert.setTitle("Message");
                    alert.setMessage("Még 50 click és öné lehet az új Iphone X");
                    AlertDialog alertShow=alert.create();
                    alertShow.show();
               }
               else if (szamlalo==100)
               {
                   alert.setTitle("Message");
                   alert.setMessage("Sajnáljuk most nem nyert, de ne adja fel próbálja tovább!!");
                   AlertDialog alertShow=alert.create();
                   alertShow.show();
               }
            }
        });
    }
    private void init()
    {
        clickme=findViewById(R.id.main_layout);
        szamlalo=0;
        szamlaloText=findViewById(R.id.szamlalo);
    }
}
