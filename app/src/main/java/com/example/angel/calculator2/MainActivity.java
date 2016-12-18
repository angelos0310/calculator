package com.example.angel.calculator2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMinus, buttonMulti, buttonDiv, buttonEnter, buttonCls;
    String txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView
        result = (TextView) findViewById(R.id.result);

        //Button
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttonCls = (Button) findViewById(R.id.buttonCls);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonEnter = (Button) findViewById(R.id.buttonEnter);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonCls.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEnter.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        txtView = String.valueOf(result.getText());
        if(txtView.startsWith("0")){
            txtView = "";
        }
        int totalNum = 0;

        switch (view.getId()){
            case R.id.button0:
                result.setText(txtView + "0");
                break;
            case R.id.button1:
                result.setText(txtView + "1");
                break;
            case R.id.button2:
                result.setText(txtView + "2");
                break;
            case R.id.button3:
                result.setText(txtView + "3");
                break;
            case R.id.button4:
                result.setText(txtView + "4");
                break;
            case R.id.button5:
                result.setText(txtView + "5");
                break;
            case R.id.button6:
                result.setText(txtView + "6");
                break;
            case R.id.button7:
                result.setText(txtView + "7");
                break;
            case R.id.button8:
                result.setText(txtView + "8");
                break;
            case R.id.button9:
                result.setText(txtView + "9");
                break;
            case R.id.buttonPlus:
                result.setText(txtView + "+");
                break;
            case R.id.buttonMinus:
                result.setText(txtView + "-");
                break;
            case R.id.buttonMulti:
                result.setText(txtView + "*");
                break;
            case R.id.buttonDiv:
                result.setText(txtView + "/");
                break;
            case R.id.buttonEnter:
                String[] arrStr = null;
                int num1 = 0;
                int num2 = 0;

                if(txtView.indexOf("+") > 0){
                    arrStr = txtView.split("\\+");
                    num1 = Integer.parseInt(arrStr[0]);
                    num2 = Integer.parseInt(arrStr[1]);

                    totalNum = (num1 + num2);
                }else if(txtView.indexOf("-") > 0){
                    arrStr = txtView.split("\\-");

                    num1 = Integer.parseInt(arrStr[0]);
                    num2 = Integer.parseInt(arrStr[1]);

                    totalNum = (num1 - num2);
                }else if(txtView.indexOf("*") > 0){
                    arrStr = txtView.split("\\*");

                    num1 = Integer.parseInt(arrStr[0]);
                    num2 = Integer.parseInt(arrStr[1]);

                    totalNum = (num1 * num2);
                }else if(txtView.indexOf("/") > 0){
                    arrStr = txtView.split("\\/");

                    num1 = Integer.parseInt(arrStr[0]);
                    num2 = Integer.parseInt(arrStr[1]);

                    totalNum = (num1 / num2);
                }

                result.setText(txtView + "=" + totalNum);
                break;
            case R.id.buttonCls:
                result.setText("0");
                break;
        }
    }
}
