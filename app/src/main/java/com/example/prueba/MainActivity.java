package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private Button buttonSend;
     private EditText editTextDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();

    }
    private void setViews(){
        buttonSend=findViewById(R.id.main_btn_check);
        buttonSend.setOnClickListener(this);
        editTextDate=findViewById(R.id.main_ed_week_number);
   }

    //private void gotoResultActivity(){
    //    startActivity(CheckActivity.makeIntent( this, getWeekNumber()));
    //}

    //private int getWeekNumber() {

   // }


    @Override
    public void onClick(View v) {
        if (v== buttonSend){
            if (! hasWindowFocus()){

            }
        }
    }
}