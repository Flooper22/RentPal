package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OwnerHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_home_page);
        Button rentdetailsbtn = (Button) findViewById(R.id.rentdetailsbtn);
        Button reportbtn = (Button) findViewById(R.id.reportbtn);
        Button propertiesbtn = (Button) findViewById(R.id.propertiesbtn);

        rentdetailsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRentalDetails();
            }
        });

        reportbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIncomeReportPage();
            }
        });

        propertiesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProperties();
            }
        });

    }

    public void openRentalDetails() {
        Intent intent = new Intent(this,RentalDetails.class);
        startActivity(intent);
    }

    public void openIncomeReportPage() {
        Intent intent = new Intent(this,IncomeReportPage.class);
        startActivity(intent);
    }

    public void openProperties() {
        Intent intent = new Intent(this,PropertiesPage.class);
        startActivity(intent);
    }
}