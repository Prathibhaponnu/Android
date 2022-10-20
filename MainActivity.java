package com.example.sjcet.registration_form;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.EditText;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText nameedt;

    EditText emaildt;

    EditText passedt;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


    public void register(View view) {

        nameedt = (EditText) findViewById(R.id.et1);

        emaildt = (EditText) findViewById(R.id.et2);

        passedt = (EditText) findViewById(R.id.et3);

        String userName = nameedt.getText().toString();

        String password = passedt.getText().toString();


        if (checkAll()) {

            Intent i = new Intent(getApplicationContext(), Main2Activity.class);

            startActivity(i);

        } else {

            Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();


        }


    }


    private boolean checkAll() {

        if (nameedt.length() == 0) {

            nameedt.setError("this field is required");

            return false;


        }

        if (emaildt.length() == 0) {

            emaildt.setError("This field required");

            return false;

        }

        if (passedt.length() == 0) {

            passedt.setError("this is required");

            return false;

        }

        return true;

    }

}