package net.lukifiagnia.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputNama = (EditText) findViewById(R.id.idName);
        EditText inputEmail = (EditText) findViewById(R.id.idEmail);
        EditText inputTelp = (EditText) findViewById(R.id.idTelp);
        EditText inputPw = (EditText) findViewById(R.id.idPw);

        Button btnsave = (Button) findViewById(R.id.idButton);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("--Nama--", inputNama.getText().toString());
                Log.d("--Email--", inputEmail.getText().toString());
                Log.d("--Telp--", inputTelp.getText().toString());
                Log.d("--Password--", inputPw.getText().toString());
            }
        });
    }
}