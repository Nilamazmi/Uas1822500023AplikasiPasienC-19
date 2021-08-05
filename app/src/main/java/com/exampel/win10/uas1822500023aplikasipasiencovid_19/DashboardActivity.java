package com.exampel.win10.uas1822500023aplikasipasiencovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    Button tambahData, tampilData, btnOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        tambahData = (Button)findViewById(R.id.tambahData);
        tampilData = (Button)findViewById(R.id.tampilData);
        btnOut = (Button)findViewById(R.id.btnOut);

        tambahData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create the intent
                Intent intent = new Intent(getApplicationContext(), TambahDataActivity.class);
                startActivity(intent);

                tampilData.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //create the intent
                        Intent intent = new Intent(getApplicationContext(), TampilDataActivity.class);
                        startActivity(intent);

                    }
                });
            }
        });
    }
}