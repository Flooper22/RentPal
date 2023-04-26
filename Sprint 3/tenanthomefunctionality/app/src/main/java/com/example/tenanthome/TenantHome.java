package com.example.tenanthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenantHome extends AppCompatActivity {
    private Button feesbutton;
    private Button paymenthis;
    private Button paymentmetho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        feesbutton = findViewById(R.id.feesbutton);
        feesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenantHome.this, Fees.class);
                startActivity(intent);
            }
        });

        paymentmetho = findViewById(R.id.paymentmetbutton);
        paymentmetho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenantHome.this, PaymentMethod.class);
                startActivity(intent);
            }
        });

        paymenthis = findViewById(R.id.paymenthisbutton);
        paymenthis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenantHome.this, PaymentHistory.class);
                startActivity(intent);
            }
        });

    }
}