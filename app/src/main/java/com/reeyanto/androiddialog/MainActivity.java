package com.reeyanto.androiddialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button btnAlert;
    private ImageButton btnDate, btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        btnAlert.setOnClickListener(view -> showAlertDialog());
    }

    private void initComponents() {
        btnAlert = findViewById(R.id.btn_alert);
        btnDate  = findViewById(R.id.btn_date);
        btnTime  = findViewById(R.id.btn_time);
    }

    private void showAlertDialog() {
        AlertFragment alertFragment = new AlertFragment("Informasi", "Ini adalah pesan alert dialog!");
        alertFragment.show(getSupportFragmentManager(), null);
    }

}