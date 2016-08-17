package com.example.vatsalmankodi.calculatormark1;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainCalculator extends AppCompatActivity implements View.OnClickListener{

    public Button additionButton,subtractionButton, multiplicationButton,divisionButton;
    public EditText firstNumber, secondNumber;
    public TextView answerHere;

    public void init(){
        additionButton = (Button) findViewById(R.id.additionButton);
        subtractionButton = (Button) findViewById(R.id.subtractionButton);
        multiplicationButton = (Button) findViewById(R.id.multiplicationButton);
        divisionButton = (Button) findViewById(R.id.divisionButton);
        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);
        answerHere = (TextView) findViewById(R.id.answerHere);

        additionButton.setOnClickListener(this);
        subtractionButton.setOnClickListener(this);
        multiplicationButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);
        init();
    }

    @Override
    public void onClick(View view) {
        int first,second,answer;
        if(firstNumber.getText().toString().matches("") || secondNumber.getText().toString().matches("")) {
            answerHere.setText("Enter Values!");
            return;
        }
        first = Integer.parseInt(firstNumber.getText().toString());
        second = Integer.parseInt(secondNumber.getText().toString());
        switch (view.getId()){
            case R.id.additionButton:
                answerHere.setText(String.valueOf(first+second));
                break;
            case R.id.subtractionButton:
                answerHere.setText(String.valueOf(first-second));
                break;
            case R.id.multiplicationButton:
                answerHere.setText(String.valueOf(first*second));
                break;
            case R.id.divisionButton:
                try{
                    answerHere.setText(String.valueOf(first/second));
                }catch (Exception e){
                    answerHere.setText("Cannot Calculate!");
                }
                break;
        }

    }
}
