package com.example.Calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */

    private TextView firstText, secondText, thirdText;
    private Button but0, but1, but2, but3, but4, but5, but6, but7, but8, but9, butEqual, butMinus, butPlus, butDevision, butMultiplication, butCancel;

    private long first, second, result;
    private String firstStr, secondStr, resultStr;

    private boolean isFirst;
    private int operationId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        InitComponents();
    }



    public void InitComponents()
    {
        firstText = (TextView)findViewById(R.id.txtFirst);
        secondText = (TextView)findViewById(R.id.txtSecond);
        thirdText = (TextView)findViewById(R.id.txtEqual);

        but0 = (Button)findViewById(R.id.but_0);
        but1 = (Button)findViewById(R.id.but_1);
        but2 = (Button)findViewById(R.id.but_2);
        but3 = (Button)findViewById(R.id.but_3);
        but4 = (Button)findViewById(R.id.but_4);
        but5 = (Button)findViewById(R.id.but_5);
        but6 = (Button)findViewById(R.id.but_6);
        but7 = (Button)findViewById(R.id.but_7);
        but8 = (Button)findViewById(R.id.but_8);
        but9 = (Button)findViewById(R.id.but_9);
        butEqual = (Button)findViewById(R.id.but_equal);
        butCancel = (Button)findViewById(R.id.but_cancel);
        butPlus = (Button)findViewById(R.id.but_plus);
        butMinus = (Button)findViewById(R.id.but_minus);
        butMultiplication = (Button)findViewById(R.id.but_multiplication);
        butDevision = (Button)findViewById(R.id.but_division);

        but0.setOnClickListener(this);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);
        but8.setOnClickListener(this);
        but9.setOnClickListener(this);
        butPlus.setOnClickListener(this);
        butMinus.setOnClickListener(this);
        butMultiplication.setOnClickListener(this);
        butDevision.setOnClickListener(this);
        butCancel.setOnClickListener(this);
        butEqual.setOnClickListener(this);

        ClearCalc();

    }

    private void ClearCalc()
    {
        firstStr = "";
        secondStr = "";
        resultStr = "";
        first = 0;
        second =0;
        result = 0;
        isFirst = true;

        firstText.setText("");
        secondText.setText("");
        thirdText.setText("");
        operationId = 0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.but_0:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "0";
                }
                else
                {
                    secondStr = secondStr + "0";
                }
            }
            break;
            case R.id.but_1:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "1";
                }
                else
                {
                    secondStr = secondStr + "1";
                }
            }
            break;
            case R.id.but_2:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "2";
                }
                else
                {
                    secondStr = secondStr + "2";
                }
            }
            break;
            case R.id.but_3:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "3";
                }
                else
                {
                    secondStr = secondStr + "3";
                }
            }
            break;
            case R.id.but_4:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "4";
                }
                else
                {
                    secondStr = secondStr + "4";
                }
            }
            break;
            case R.id.but_5:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "5";
                }
                else
                {
                    secondStr = secondStr + "5";
                }
            }
            break;
            case R.id.but_6:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "6";
                }
                else
                {
                    secondStr = secondStr + "6";
                }
            }
            break;
            case R.id.but_7:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "7";
                }
                else
                {
                    secondStr = secondStr + "7";
                }
            }
            break;
            case R.id.but_8:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "8";
                }
                else
                {
                    secondStr = secondStr + "8";
                }
            }
            break;
            case R.id.but_9:
            {
                if (isFirst)
                {
                    firstStr = firstStr + "9";
                }
                else
                {
                    secondStr = secondStr + "9";
                }
            }
            break;
            case R.id.but_plus:
            {
                isFirst = false;
                operationId = 1;
            }
            break;
            case R.id.but_minus:
            {
                isFirst = false;
                operationId = 2;
            }
            break;
            case R.id.but_division:
            {
                isFirst = false;
                operationId =3;
            }
            break;
            case R.id.but_multiplication:
            {
                isFirst = false;
                operationId = 4;
            }
            break;
            case R.id.but_equal:
            {
                if(secondStr != "" && firstStr != "" && operationId != 0)
                {
                    ProcessEquals();
                }
            }
            break;
            case R.id.but_cancel:
            {
                ClearCalc();

            }
            break;
        }

        firstText.setText(firstStr);
        secondText.setText(secondStr);
    }

    private void ProcessEquals()
    {
        switch (operationId){
            case 1:
            {
                first = Long.parseLong(firstStr);
                second = Long.parseLong(secondStr);
                result = first + second;
                thirdText.setText(result + "");
            }
            break;
            case 2:
            {

            }
            break;
            case 3:
            {

            }
            break;
            case 4:
            {

            }
            break;
        }
    }
}
