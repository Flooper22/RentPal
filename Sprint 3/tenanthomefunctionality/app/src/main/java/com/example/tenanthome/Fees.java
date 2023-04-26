package com.example.tenanthome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fees extends AppCompatActivity {
    private Button backbutt;
    private Button paymbutt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees);

        backbutt = findViewById(R.id.backbutt);
        backbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fees.this, TenantHome.class);
                startActivity(intent);
            }
        });

        paymbutt = findViewById(R.id.paymbutton);
        paymbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fees.this, PaymentMethod.class);
                startActivity(intent);
            }
        });

    }
}