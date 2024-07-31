package com.srijit.fincos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Servelocationstarter extends AppCompatActivity {
    public static final String FIP ="com.fincos.FIP" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servelocationstarter);
        Intent intent = getIntent() ;
        String message =intent.getStringExtra(MainActivity.LOC) ;
        TextView textView = findViewById(R.id.massdisp) ;
        textView.setText(message) ;
    }

    public void finalshow (View view){
        Intent intent = new Intent(Servelocationstarter.this, finalshow.class) ;
        startActivity(intent) ;
    }





}