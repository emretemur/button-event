package com.example.cookie.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
//import kotlinx.android.synthetic.main.activity_main.*

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Button btn1;
    TextView txt;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt =(TextView) findViewById(R.id.textView1);

         btn1 = (Button)findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        //btn1 = findViewById(R.id.button1);
        //btn1.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //      Toast.makeText(MainActivity.this, "Message From Button 1",  Toast.LENGTH_SHORT).show();

        //}
        //});
        btn1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
               startActivity(new Intent(MainActivity.this, Pop.class));
                break;

            case R.id.button2:
                Toast.makeText(this, "Toast button clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.button3:
                txt.setText("The system does not show multiple Snackbar objects at the same time, so if the view is currently displaying another Snackbar,");
                break;

            case R.id.button4:
                txt.setText("The system does...");
                break;
        }
    }
}
