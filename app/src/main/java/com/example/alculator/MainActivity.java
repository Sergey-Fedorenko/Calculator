package com.example.alculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Object ConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Сложение
    public void onButtonClick(View v) {
        EditText el1 = (EditText) findViewById(R.id.number1);
        EditText el2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 + num2;
        resText.setText(Integer.toString(resSum));
    }

    //Вычетание
    public void onButtonClick1(View v) {
        EditText el1 = (EditText) findViewById(R.id.number1);
        EditText el2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resMinus = num1 - num2;
        resText.setText(Integer.toString(resMinus));
    }

    //Умножение
    public void onButtonClick3(View v) {
        EditText el1 = (EditText) findViewById(R.id.number1);
        EditText el2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resUmn = num1 * num2;
        resText.setText(Integer.toString(resUmn));
    }

    //Возведение в квадрат
    public void onButtonClick4(View v) {
        EditText el1 = (EditText) findViewById(R.id.number1);
        TextView resText = (TextView) findViewById(R.id.Result);
        int num1 = Integer.parseInt(el1.getText().toString());
        int reskv = num1 * num1;
        resText.setText(Integer.toString(reskv));
    }

    //Очистка всех полей
    public void onButtonClick5(View v) {
        EditText el1 = (EditText) findViewById(R.id.number1);
        EditText el2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.Result);

        el1.setText(null);
        el2.setText(null);
        resText.setText(null);
    }

    //Деление
    public void onButtonClick6(View v) {
        EditText el1 = (EditText) findViewById(R.id.number1);
        EditText el2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.Result);

        double num1 = Integer.parseInt(el1.getText().toString());
        double num2 = Integer.parseInt(el2.getText().toString());
        double resDel = num1 / num2;
        resText.setText(Double.toString(resDel));
    }

    //Косинус
    public void onButtonClick7(View v) {
        EditText el1 = (EditText) findViewById(R.id.number1);
        TextView resText = (TextView) findViewById(R.id.Result);

        double num1 = Integer.parseInt(el1.getText().toString());

        double resCos = Math.cos(num1);
        resText.setText(Double.toString(resCos));
    }


}