package com.example.proyek1adewyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Frame2Layout extends AppCompatActivity {
    EditText eUserName; //deklarasi username
    ImageButton bLogin; //deklarasi tombol login
    String user; //deklarasi menampung input user

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2_layout);

        eUserName = findViewById(R.id.username); //hubungkan dgn EditText username
        bLogin = findViewById(R.id.login); //hubungkan dgn ImageButton login

        //fungsi setOnClickListener saat tombol login dtekan
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { login(); }
        });
    }
    public void login (){
        //fungsi login dbuat utk menampilkan pesan dan berpindah dari 1 activity ke lainnya
        //simpan input dari pengguna ke variabel user
        user = eUserName.getText().toString();

        //intent digunakan utk berpindah activity, dalam kasus ini berpindah dari Frame2Layout
        //yaitu activity saat ini ke LinearActivity
        Intent intent = new Intent(Frame2Layout.this,LinearActivity2.class);

        //putExtra utk menyimpan data dari 1 activity ke lainnya
        //kasus ini disimpan adalah data dari variabel user yg diberi nama "user"
        intent.putExtra("user",user);

        //menjalankan intent
        startActivity(intent);
    }
}