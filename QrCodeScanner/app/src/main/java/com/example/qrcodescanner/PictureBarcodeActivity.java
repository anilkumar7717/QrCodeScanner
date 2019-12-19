package com.example.qrcodescanner;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class PictureBarcodeActivity extends AppCompatActivity {
    TextView txtResultBody;
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_picture);
        if (getIntent().getExtras() != null) {
            result = getIntent().getStringExtra("intentData");

        }
        initViews();
        txtResultBody.setText(result);
    }

    private void initViews() {
        txtResultBody = findViewById(R.id.txtResultsBody);
    }

}