package com.example.proyek1adewyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity2 extends AppCompatActivity {
    String user, kepada, subyek, pesan; //menampung data user dari Frame2Layout dan utk LatihanActivity
    EditText eKepada, eSubyek, ePesan; //menghubungkan dengan EditText kepada, subyek, dan pesan
    Button bkirim; //deklarasi tombol kirim

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);

        //ambil data dari intent Frame2Layout
        //pastikan key yg digunakan sama, apabila tidak, tidak dapat mengambil data
        user = getIntent().getExtras().getString("user");

        //hubungkan dgn EditText dgn id kepada, subyek, pesan, dan Button kirim
        eKepada = findViewById(R.id.kepada);
        eSubyek = findViewById(R.id.subyek);
        ePesan = findViewById(R.id.pesan);
        bkirim = findViewById(R.id.kirim);

        //tulis user pada EditText kepada
        eKepada.setText(user);

        bkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { kirim(); }
        });
    }
    public void kirim() {
        kepada = eKepada.getText().toString();
        subyek = eSubyek.getText().toString();
        pesan = ePesan.getText().toString();
        Intent intent = new Intent(LinearActivity2.this, LatihanActivity.class);
        intent.putExtra("kepada",kepada);
        intent.putExtra("subyek",subyek);
        intent.putExtra("pesan",pesan);
        startActivity(intent);
    }
    }