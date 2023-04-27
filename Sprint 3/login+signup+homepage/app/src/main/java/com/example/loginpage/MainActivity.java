package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialization or declaration of components
        TextView usernamelogin =(TextView) findViewById(R.id.usernamelogin); //emailaddress textbox
        TextView passwordlogin =(TextView) findViewById(R.id.passid); //password textbox
        Button loginbutton = (Button) findViewById(R.id.loginbutton); //login button
        TextView signupid = (TextView) findViewById(R.id.signupid); //signup button/label

        //login button functionality
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override

            //functionality of login button; i.e: verify username and password and move to next page when button is clicked
            public void onClick(View v) {
                if (usernamelogin.getText().toString().equals("username")
                        && passwordlogin.getText().toString().equals("password")) {
                    //correct
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    //prompt to next page (TenantHomePage)
                    openTenantHomePage();

                } else
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        });

        signupid.setOnClickListener(new View.OnClickListener() {

            @Override
            //prompt the user to the signup page
            public void onClick(View v) {
                openSignupPage();
            }
        });
    }

    public void openTenantHomePage() { //openTenantHomePage function: will prompt the button to go to next page

        Intent intent = new Intent(this,TenantHomePage.class);
        startActivity(intent);
    }

    public void openSignupPage(){
        Intent intent = new Intent(this, SignupPage.class);
        startActivity(intent);
    }


}