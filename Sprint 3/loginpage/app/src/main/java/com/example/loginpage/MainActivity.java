package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView usernamelogin =(TextView) findViewById(R.id.usernamelogin);
        TextView passwordlogin =(TextView) findViewById(R.id.passwordlogin);

        Button loginbutton = (Button) findViewById(R.id.loginbutton);

        //admin and admin
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernamelogin.getText().toString().equals("admin")
                        && passwordlogin.getText().toString().equals("password")){
                    //correct
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}