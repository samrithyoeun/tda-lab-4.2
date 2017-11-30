package com.fluffy.samrith.lab4_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view) {
        Intent data = new Intent();
        //---get the EditText view---
        EditText txt_username = (EditText)findViewById(R.id.txtUsername);
        //---set the data to pass back---
        data.setData(Uri.parse( txt_username.getText().toString()));
        setResult(RESULT_OK, data);
        //---closes the activity---
        finish(); }


}

