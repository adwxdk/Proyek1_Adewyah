package com.example.proyek1adewyah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LatihanActivity extends AppCompatActivity {
    String kepada, subyek, pesan;
    EditText eKepada, eSubyek, ePesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        //ambil data dari inteng LinearActivity2
        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        pesan = getIntent().getExtras().getString("pesan");

        //hubungkan
        eKepada = findViewById(R.id.latihankepada);
        eSubyek = findViewById(R.id.latihansubyek);
        ePesan = findViewById(R.id.latihanpesan);

        //tulis pada EditText
        eKepada.setText(kepada);
        eSubyek.setText(subyek);
        ePesan.setText(pesan);
    }
}