package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextWeight,editTextHeight;
    private TextView textViewResult;
    private ImageView ImageViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        //Linking UI to the program
        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        textViewResult = (TextView)findViewById(R.id.textViewResult);
        ImageViewResult = (ImageView)findViewById(R.id.ImageViewResult);
    }

    public void calculateBMI(View view){
        double weight,height,bmi;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());
        bmi = weight / (height * height);

        if(bmi <= 18.5){
            textViewResult.setText(getString(R.string.under) + " "+bmi);
            ImageViewResult.setImageResource(R.drawable.under);
        }
        else if(bmi>18.5 && bmi <= 21){
            textViewResult.setText(getString(R.string.normal) + " "+bmi);
            ImageViewResult.setImageResource(R.drawable.normal);
        }
        else{
            textViewResult.setText(getString(R.string.over) + " "+bmi);
            ImageViewResult.setImageResource(R.drawable.over);
        }
    }

    public void Reset(View view){
        editTextWeight.setText("");
        editTextHeight.setText("");
        textViewResult.setText("");
        ImageViewResult.setImageResource(R.drawable.empty);
    }

}
