package com.example.proyek1adewyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Frame1Layout extends AppCompatActivity {
    ImageView gambarLoading; //menampung gambar loading dari activity_frame1
    Animation rotasiAnimasi; //melakukan animasi rotasi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame1_layout);
        //simpan gambar loading
        gambarLoading = findViewById(R.id.loading);
        rotasi(); //panggil fungsi rotasi

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //intent untuk berpindah dari satu activity ke lainnya
                //hal ini berpindah dari Frame1Layout ke Frame2Layout
                Intent intent = new Intent(Frame1Layout.this, Frame2Layout.class);
                //jalankan fungsi intent
                startActivity(intent);
                //tutup, masuk ke dalam mode bg
                finish();

            }
        }, 3000);
    }
        private void rotasi(){
            rotasiAnimasi = AnimationUtils.loadAnimation(this,R.anim.rotasi_searah);
            gambarLoading.startAnimation(rotasiAnimasi);
        }
    }

