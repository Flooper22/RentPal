package com.example.tenanthome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class PaymentHistory extends AppCompatActivity {
    private Button backbuttons;
    private Button feesbutt;
    private Button paymentmethodbuttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        backbuttons = findViewById(R.id.backbutton);
        backbuttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (PaymentHistory.this, TenantHome.class);
                startActivity(intent);
            }
        });

        feesbutt = findViewById(R.id.feesbuttons);
        feesbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentHistory.this, Fees.class);
                startActivity(intent);
            }
        });

        paymentmethodbuttons = findViewById(R.id.paymentmethodbutton);
        paymentmethodbuttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentHistory.this, PaymentMethod.class);
                startActivity(intent);
            }
        });
    }
}