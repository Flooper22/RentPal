package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenantHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant_home_page);

        Button feesbtn = (Button) findViewById(R.id.feesbtn);
        Button historybtn = (Button) findViewById(R.id.historybtn);
        Button methodbtn = (Button) findViewById(R.id.methodbtn);

        feesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeesPage();
            }
        });

        historybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaymentHistory();
            }
        });

        methodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaymentMethodPage();
            }
        });

    }

    public void openFeesPage() {
        Intent intent = new Intent(this,FeesPage.class);
        startActivity(intent);
    }

    public void openPaymentHistory() {
        Intent intent = new Intent(this,PaymentHistory.class);
        startActivity(intent);
    }

    public void openPaymentMethodPage() {
        Intent intent = new Intent(this,PaymentMethodPage.class);
        startActivity(intent);
    }
}