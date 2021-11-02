package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v) {
        EditText t1 = (EditText) findViewById(R.id.editTextNumber);
        EditText t2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText t3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int result = n1 + n2;

        t3.setText("" + result);
    }

    public void Subtract(View v) {
        EditText t1 = (EditText) findViewById(R.id.editTextNumber);
        EditText t2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText t3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int result = n1 - n2;

        t3.setText("" + result);
    }

    public void Multiply(View v) {
        EditText t1 = (EditText) findViewById(R.id.editTextNumber);
        EditText t2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText t3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int result = n1 * n2;

        t3.setText("" + result);
    }

    public void Divide(View v) {
        EditText t1 = (EditText) findViewById(R.id.editTextNumber);
        EditText t2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText t3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int result = n1 / n2;

        t3.setText("" + result);
    }

    public void hide(View v)
    {
    try

    {
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    } catch(Exception e)

    {
        // TODO: handle exception
    }
}

}