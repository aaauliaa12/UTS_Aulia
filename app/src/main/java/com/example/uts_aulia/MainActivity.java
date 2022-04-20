package com.example.uts_aulia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView indomie_aulia, sarden_aulia, kecap_aulia, result_aulia;
    Button btHitung_aulia;
    private double HasilAkhir_aulia = 0.0,disc_aulia=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indomie_aulia = (TextView) findViewById(R.id.indomie);
        sarden_aulia = (TextView) findViewById(R.id.sarden);
        kecap_aulia = (TextView) findViewById(R.id.kecap);
        result_aulia = (TextView) findViewById(R.id.hasil);

        btHitung_aulia = (Button) findViewById(R.id.hitung);
    }

    public void hitungblj(View V){
        double pan_aulia = Double.parseDouble(indomie_aulia.getText().toString());
        double men_aulia = Double.parseDouble(sarden_aulia.getText().toString());
        double kohi_aulia = Double.parseDouble(kecap_aulia.getText().toString());

        if(pan_aulia>=5){
            disc_aulia=0.8;
        }
        else{
            disc_aulia=1.0;
        }

        HasilAkhir_aulia = HasilAkhir_aulia + (pan_aulia*3000.0*disc_aulia +
                men_aulia*8000.0 + kohi_aulia*6000.0);
        String hasilString_aulia = String.valueOf(HasilAkhir_aulia);
        result_aulia.setText(hasilString_aulia);
    }

    public void tambahblj(View V){
        indomie_aulia.setText("0");
        kecap_aulia.setText("0");
        sarden_aulia.setText("0");
    }

    public void resetblj(View V){
        indomie_aulia.setText("0");
        kecap_aulia.setText("0");
        sarden_aulia.setText("0");
        result_aulia.setText("0");
        HasilAkhir_aulia=0;
        double pan_aulia = Double.parseDouble(indomie_aulia.getText().toString());
        double men_aulia = Double.parseDouble(sarden_aulia.getText().toString());
        double kohi_aulia = Double.parseDouble(kecap_aulia.getText().toString());
        pan_aulia=0; men_aulia=0; kohi_aulia=0;
    }
}