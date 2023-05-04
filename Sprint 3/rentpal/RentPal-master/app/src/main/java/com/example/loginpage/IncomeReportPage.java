package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IncomeReportPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_report_page);

        ImageView backbtnincomereport = (ImageView) findViewById(R.id.backbtnincomereport);
    }

    public void onClick(View view) {
        openOwnerHomePage();
    }

    public void openOwnerHomePage() { //openTenantHomePage function: will prompt the button to go to next page

        Intent intent = new Intent(this,OwnerHomePage.class);
        startActivity(intent);
    }
}