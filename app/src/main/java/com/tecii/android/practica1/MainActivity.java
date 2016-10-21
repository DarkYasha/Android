package com.tecii.android.practica1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    EditText txtN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtN = (EditText)findViewById(R.id.txtN);
        this.txt = (TextView)findViewById(R.id.txt);
    }
    public void suma(View vista){
        String var = txtN.getText().toString();
        int n = Integer.parseInt(var);
        int sum = n*(n+1)/2;
        String res = "El resultado de la suma es: " + sum;
        txt.setText(res);
    }
}
