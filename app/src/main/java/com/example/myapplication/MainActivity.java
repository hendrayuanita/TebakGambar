package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_bakso, imageView_soto, imageView_rendang,imageView_sateayam, imageView_gadogado, imageView_gulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab() {
        imageView_bakso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this,TebakActivity.class);
                d.putExtra("nama makanan","bakso");
                startActivity(d);
            }
        });

        imageView_rendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this,TebakActivity.class);
                c.putExtra("nama makanan","rendang");
                startActivity(c);
            }
        });

        imageView_sateayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, TebakActivity.class);
                a.putExtra("nama makanan","sate ayam");
                startActivity(a);
            }
        });

        imageView_gulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama makanan","gulai");
                startActivity(al);
            }
        });

        imageView_gadogado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama makanan","gado-gado");
                startActivity(al);
            }
        });

        imageView_soto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama makanan","soto");
                startActivity(al);
            }
        });
    }

    private void setInisialisasi() {
        imageView_bakso = (ImageView)findViewById(R.id.imageView_bakso);
        imageView_gulai = (ImageView)findViewById(R.id.imageView_gulai);
        imageView_sateayam = (ImageView)findViewById(R.id.imageView_sateayam);
        imageView_rendang = (ImageView)findViewById(R.id.imageView_rendang);
        imageView_gadogado = (ImageView)findViewById(R.id.imageView_gadogado);
        imageView_soto = (ImageView)findViewById(R.id.imageView_soto);

    }
}