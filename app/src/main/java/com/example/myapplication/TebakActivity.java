package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TebakActivity extends AppCompatActivity {

    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;

    String jawaban;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        setInitalisasi();
        cekIntent();
        onClickJos();
    }

    private void setInitalisasi() {
        imageView_tebak = (ImageView)findViewById(R.id.imageView_tebak);
        editText_jawabb = (EditText)findViewById(R.id.editText_jawab);
        button_cek = (Button)findViewById(R.id.buttonCek);
    }

    private void cekIntent() {
        Intent cek = getIntent();
        String nama_makanan = cek.getStringExtra("nama makanan");

        if (nama_makanan.equals("bakso")){
            imageView_tebak.setImageResource(R.drawable.bakso);
            jawaban = "bakso";

        } else if (nama_makanan.equals("soto")){
            imageView_tebak.setImageResource(R.drawable.soto);
            jawaban = "soto";
        } else if (nama_makanan.equals("sate ayam")){
            imageView_tebak.setImageResource(R.drawable.sateayam);
            jawaban = "sate ayam";
        } else if (nama_makanan.equals("gulai")){
            imageView_tebak.setImageResource(R.drawable.gulai);
            jawaban = "gulai";
        } else if (nama_makanan.equals("gado-gado")){
            imageView_tebak.setImageResource(R.drawable.gadogado);
            jawaban = "gado-gado";
        } else {
            imageView_tebak.setImageResource(R.drawable.rendang);
            jawaban = "rendang";
        }
    }

    private void onClickJos() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawabb.getText().toString().equals(jawaban)){
                    Toast.makeText(TebakActivity.this,"Yee Benar!",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TebakActivity.this,"oo Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}