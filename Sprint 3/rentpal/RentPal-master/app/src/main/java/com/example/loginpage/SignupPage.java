package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        EditText fullnameid = (EditText) findViewById(R.id.fullnameid);//fullname textbox
        EditText phonenumid = (EditText) findViewById(R.id.phonenumid);//phonenumber textbox
        EditText emailid = (EditText) findViewById(R.id.emailid);//emailaddress textbox
        EditText passid = (EditText) findViewById(R.id.passid);//password textbox

        Button signupbutton = (Button) findViewById(R.id.signupbutton);//signup button

        //signup button functionality: will register all inputted values in textbox
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //conversion of values from textbox to string: this is to test if input is working; delete later for database
                String fullname = fullnameid.getText().toString();
                String phone = phonenumid.getText().toString();
                String email = fullnameid.getText().toString();
                String password = passid.getText().toString();

                //will show a message in the system; change the variable (i.e fullname) to verify if input is working
                Toast.makeText(SignupPage.this, "Welcome " + fullname + "!", Toast.LENGTH_SHORT).show();

                //go back to loginpage
                openMainActivity(); //MainActivity = login page
            }
        });
    }
    public void openMainActivity() { //openMainActivity function: will prompt the program to move to next activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}