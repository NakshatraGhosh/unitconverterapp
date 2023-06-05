package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    TextView textview1;
    Button convert;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textView1);
        textview1=findViewById(R.id.textView2);
        convert=findViewById(R.id.button1);
        input=findViewById(R.id.text1);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           double kilos=Double.parseDouble(input.getText().toString());

           textview1.setText(""+conversion(kilos));
            }
        });
    }

    public double conversion(double kk)
    {
        double pp=2.2*kk;
        return pp;
    }
}