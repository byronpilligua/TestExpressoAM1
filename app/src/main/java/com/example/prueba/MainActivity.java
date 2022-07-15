package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText correo, contraseña;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }


    private void setViews() {
        correo = findViewById(R.id.correo);
        contraseña = findViewById(R.id.contraseña);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    /*private  void goToResultActivity(){
        startActivity(CheckActivity.makeIntent(this,getWeekNumber()));
    }*/

    @Override
    public void onClick(View view) {
        if (view == btn) {
            Log.e("test", correo.getText().toString());
            Log.e("test", contraseña.getText().toString());


            if (validateUse(correo.getText().toString(), contraseña.getText().toString())) {
                Toast.makeText(this, "Si se pudo", Toast.LENGTH_SHORT).show();

            } else {
                Log.e("test", "no paso la validacion general");
            }


        }

    }


    public boolean validateUse(String email, String password) {

        if (Prueba.validateEmpty(email) || Prueba.validateEmpty(password)) {
            Toast.makeText(this, "no existe validacion ", Toast.LENGTH_SHORT).show();

            return false;

        }
        if (!Prueba.validateEmail(email)) {
            Toast.makeText(this, "no es correcto el email", Toast.LENGTH_SHORT).show();

            return false;
        }
        if (!Prueba.validateUser(email, password)) {
            Toast.makeText(this, "no es usuario correcto", Toast.LENGTH_SHORT).show();

            return false;
        }


        return true;
    }
}