package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaymentHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_history);

        ImageView backbtnhistory = (ImageView) findViewById(R.id.backbtnhistory);
    }

    public void onClick(View view) {
        openTenantHomePage();
    }

    public void openTenantHomePage() { //openTenantHomePage function: will prompt the button to go to next page

        Intent intent = new Intent(this,TenantHomePage.class);
        startActivity(intent);
    }
}