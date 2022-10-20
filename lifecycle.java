package com.example.sjcet.activity_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"oncreate Invoked",Toast.LENGTH_SHORT).show();
    }
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"onstart invoked",Toast.LENGTH_SHORT).show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this,"onResume invoked",Toast.LENGTH_SHORT).show();
    }
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this,"onPause invoked",Toast.LENGTH_SHORT).show();
    }
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"onStop invoked",Toast.LENGTH_SHORT).show();
    }
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"onRestart invoked",Toast.LENGTH_SHORT).show();
    }
}
