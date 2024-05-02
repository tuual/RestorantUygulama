package com.example.restorantuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private Button button;
    int total = 0;

    private Button btnKiymaliPide, btnLahmacun, btnEtliEkmek, btnSucukluPide, btnPizza, btnKasarliPide, btnAdana;
    private Button btnCola, btnFanta, btnFuseTea, btnKucukAyran, btnBuyukAyran, btnKapaliSalgam, btnAcikSalgam;
    private Button islem;
    List<String> siparisler = new ArrayList<>();
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    Boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setID();
        islem.setOnClickListener(view -> {
            islemler();
        });

        total = 0;
        // KiymaliPide
        btnKiymaliPide.setOnClickListener(view -> {
            if (btnKiymaliPide.isSelected()) {
                total -= 120;
                btnKiymaliPide.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Kıymalı Pide");
            } else {
                total += 120;
                btnKiymaliPide.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Kıymalı Pide");
            }
            btnKiymaliPide.setSelected(!btnKiymaliPide.isSelected());
        });

// Lahmacun
        btnLahmacun.setOnClickListener(view -> {
            if (btnLahmacun.isSelected()) {
                total -= 120;
                btnLahmacun.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Lahmacun");
            } else {
                total += 120;
                btnLahmacun.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Lahmacun");

            }
            btnLahmacun.setSelected(!btnLahmacun.isSelected());
        });

// Etli Ekmek
        btnEtliEkmek.setOnClickListener(view -> {
            if (btnEtliEkmek.isSelected()) {
                total -= 150;
                btnEtliEkmek.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Etli Ekmek");
            } else {
                total += 150;
                btnEtliEkmek.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Etli Ekmek");

            }
            btnEtliEkmek.setSelected(!btnEtliEkmek.isSelected());
        });

// Sucuklu Pide
        btnSucukluPide.setOnClickListener(view -> {
            if (btnSucukluPide.isSelected()) {
                total -= 100;
                btnSucukluPide.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Sucuklu Pide");

            } else {
                total += 100;
                btnSucukluPide.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Sucuklu Pide");

            }
            btnSucukluPide.setSelected(!btnSucukluPide.isSelected());
        });

// Pizza
        btnPizza.setOnClickListener(view -> {
            if (btnPizza.isSelected()) {
                total -= 200;
                btnPizza.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Pizza");
                siparisler.remove("Pizza");
            } else {
                total += 200;
                btnPizza.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Sucuklu Pide");

            }
            btnPizza.setSelected(!btnPizza.isSelected());
        });

// Kasarli Pide
        btnKasarliPide.setOnClickListener(view -> {
            if (btnKasarliPide.isSelected()) {
                total -= 130;
                btnKasarliPide.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Kaşarlı Pide");
            } else {
                total += 130;
                btnKasarliPide.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Kaşarlı Pide");

            }
            btnKasarliPide.setSelected(!btnKasarliPide.isSelected());
        });

// Adana
        btnAdana.setOnClickListener(view -> {
            if (btnAdana.isSelected()) {
                total -= 150;
                btnAdana.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Adana Kebap");
            } else {
                total += 150;
                btnAdana.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Adana Kebap");

            }
            btnAdana.setSelected(!btnAdana.isSelected());
        });
        btnCola.setOnClickListener(view -> {
            if (btnCola.isSelected()) {
                total -= 30;
                btnCola.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Kola");

            } else {
                total += 30;
                btnCola.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Kola");

            }
            btnCola.setSelected(!btnCola.isSelected());
        });

        btnFanta.setOnClickListener(view -> {
            if (btnFanta.isSelected()) {
                total -= 30;
                btnFanta.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Fanta");

            } else {
                total += 30;
                btnFanta.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Fanta");

            }
            btnFanta.setSelected(!btnFanta.isSelected());
        });


        btnFuseTea.setOnClickListener(view -> {
            if (btnFuseTea.isSelected()) {
                total -= 25;
                btnFuseTea.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("FuseTea");

            } else {
                total += 25;
                btnFuseTea.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("FuseTea");

            }
            btnFuseTea.setSelected(!btnFuseTea.isSelected());
        });

        btnKucukAyran.setOnClickListener(view -> {
            if (btnKucukAyran.isSelected()) {
                total -= 20;
                btnKucukAyran.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Küçük Ayran");

            } else {
                total += 20;
                btnKucukAyran.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Küçük Ayran");

            }
            btnKucukAyran.setSelected(!btnKucukAyran.isSelected());
        });
        btnBuyukAyran.setOnClickListener(view -> {
            if (btnBuyukAyran.isSelected()) {
                total -= 35;
                btnBuyukAyran.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Büyük Ayran");

            } else {
                total += 35;
                btnBuyukAyran.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Büyük Ayran");

            }
            btnBuyukAyran.setSelected(!btnBuyukAyran.isSelected());
        });
        btnAcikSalgam.setOnClickListener(view -> {
            if (btnAcikSalgam.isSelected()) {
                total -= 35;
                btnAcikSalgam.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Açık Şalgam");

            } else {
                total += 35;
                btnAcikSalgam.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Açık Şalgam");

            }
            btnAcikSalgam.setSelected(!btnAcikSalgam.isSelected());
        });
        btnKapaliSalgam.setOnClickListener(view -> {
            if (btnKapaliSalgam.isSelected()) {
                total -= 25;
                btnKapaliSalgam.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
                siparisler.remove("Kapalı Şalgam");

            } else {
                total += 25;
                btnKapaliSalgam.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.btngraycolor)));
                siparisler.add("Kapalı Şalgam");

            }
            btnKapaliSalgam.setSelected(!btnKapaliSalgam.isSelected());
        });
    }

    private void setID() {
        btnKiymaliPide = findViewById(R.id.btnKiymaliPide);
        btnLahmacun = findViewById(R.id.btnLahmacun);
        btnEtliEkmek = findViewById(R.id.btnEtliEkmek);
        btnSucukluPide = findViewById(R.id.btnSucukluPide);
        btnPizza = findViewById(R.id.btnPizza);
        btnKasarliPide = findViewById(R.id.btnKasarliPide);
        btnAdana = findViewById(R.id.btnAdana);
        btnCola = findViewById(R.id.btnCola);
        btnFanta = findViewById(R.id.btnFanta);
        btnFuseTea = findViewById(R.id.btnFuseTea);
        btnKucukAyran = findViewById(R.id.btnKucukAyran);
        btnBuyukAyran = findViewById(R.id.btnBuyukAyran);
        btnAcikSalgam = findViewById(R.id.btnAcikSalgam);
        btnKapaliSalgam = findViewById(R.id.btnKapaliSalgam);
        islem = findViewById(R.id.btnislem);

    }

    private void islemler() {


        sharedPreferences = getSharedPreferences("skipPage", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putInt("total",total);
        editor.putString("siparisler",siparisler.toString());
        editor.apply();
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("fiyat", total);
        startActivity(intent);
        finish();
    }


}