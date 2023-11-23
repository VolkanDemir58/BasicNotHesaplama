package com.example.uzemsnavhesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnNot;
    TextView txtSonuc;
    EditText edtVize,edtVize2,edtFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVize =findViewById(R.id.edtVize);
        edtVize2=findViewById(R.id.edtVize2);
        edtFinal=findViewById(R.id.edtFinal);
        TextView txtSonuc=findViewById(R.id.txtSonuc);
        Button btnNot=findViewById(R.id.btnNot);
        btnNot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            float sonuc=  (Float.parseFloat(edtVize.getText().toString()))* 0.2F +(Float.parseFloat (edtVize2.getText().toString()))* 0.2F +(Float.parseFloat(edtFinal.getText().toString())) *0.6F ;
            txtSonuc.setText("Sonuc"+sonuc);

            }
        });

    }
}