package com.example.frc1764.practiceapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//ALT entered below, might interfere with content.xml
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Mainactivity";

    DatabaseHelper mDatabaseHelper;
    private Button btnAdd, btnViewData;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
    public void database(){
        //Empty Code Slot
    }

    public void Capture(){
        //Empty Code Slot
    }
*/
}