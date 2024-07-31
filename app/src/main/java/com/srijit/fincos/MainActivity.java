package com.srijit.fincos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String LOC ="com.fincos.LOC" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void locationpage (View view){
        //this is the button to pg no 2
        Intent intent = new Intent(this, Servelocationstarter.class) ;
        EditText plates = findViewById(R.id.editTextNumber2);
        EditText foodno = findViewById(R.id.editTextNumber3);
        EditText reason = findViewById(R.id.editTextText);
        String message = "The take-off Order for the donation of " + plates.getText().toString() + " Plates with " + foodno.getText().toString()
                + " types of menu to serve ,for the occation of " + reason.getText().toString() + " will  be pickup from the PIN location entered !!" ;
        intent.putExtra(LOC, message) ;
        startActivity(intent) ;
    }

}