package com.exampel.win10.uas1822500023aplikasipasiencovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class TambahDataActivity extends AppCompatActivity {

    EditText nik, nama;
    RadioButton rb, rb2, rb3, rb4;
    Spinner spinner2, spinner3;
    CheckBox cb, cb2, cb3, cb4;
    Button sd, out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        nik = (EditText) findViewById(R.id.nik);
        nama = (EditText) findViewById(R.id.nama);
        rb = (RadioButton)findViewById(R.id.rb);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton)findViewById(R.id.rb3);
        rb4 = (RadioButton)findViewById(R.id.rb4);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        cb = (CheckBox) findViewById(R.id.cb);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        sd = (Button) findViewById(R.id.sd);
        out = (Button) findViewById(R.id.out);

    }
}