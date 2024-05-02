package com.example.restorantuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = getIntent().getExtras();
        int s = bundle.getInt("fiyat");
        TextView textView = findViewById(R.id.tvSiparisler);
        TextView textView2 = findViewById(R.id.TvFiyat);
        Button button = findViewById(R.id.button2);
        sharedPreferences = getSharedPreferences("skipPage", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        int fiyat = sharedPreferences.getInt("total",0);
        String siparisler = sharedPreferences.getString("siparisler","");
        textView2.setText(String.valueOf(fiyat)+ " TL");

        String[] siparislerArray = siparisler.split(","); // Varsayılan olarak virgülle ayrılmış
        StringBuilder mesajBuilder = new StringBuilder();
        for (String siparis : siparislerArray) {
            mesajBuilder.append(siparis).append("\n");
        }
        String mesaj = mesajBuilder.toString().trim(); // İlk ve son boşlukları kaldırmak için
        textView.setText(mesaj);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });

    }
}