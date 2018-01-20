package com.example.gbhujan.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catImageView;
    private ImageView dogImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImageView = (ImageView) findViewById(R.id.catID);
        dogImageView = (ImageView) findViewById(R.id.dogID);

        catImageView.setOnClickListener(this);
        dogImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch(viewId) {
            case R.id.catID:
                Toast.makeText(MainActivity.this,"Cat Clicked !", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dogID:
                Toast.makeText(MainActivity.this,"Dog Clicked !", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
