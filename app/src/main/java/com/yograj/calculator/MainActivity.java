package com.yograj.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.nio.file.FileAlreadyExistsException;

public class MainActivity extends AppCompatActivity {

//    kinda importing Buttons and TextView from XML as attributes
    private EditText etText;
    private Button btOne, btTwo, btThree, btAdd, btFour, btFive, btSix,
            btSub, btSeven, btEight, btNine, btDiv, btPer, btZero, btEqual, btMulti;
//    store twio value for calculation
    private float value1, value2;

//    boolean variable to check what operations is going on
    private boolean operAdd, operSub, operDiv, operPercent, operMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Fetching values and assinging to our objects
        etText = findViewById(R.id.etText);
        btOne = findViewById(R.id.btOne);
        btTwo = findViewById(R.id.btTwo);
        btThree = findViewById(R.id.btThree);
        btFour = findViewById(R.id.btFour);
        btFive = findViewById(R.id.btFive);
        btSix = findViewById(R.id.btSix);
        btSeven = findViewById(R.id.btSeven);
        btEight = findViewById(R.id.btEight);
        btNine = findViewById(R.id.btNine);
        btZero = findViewById(R.id.btZero);
        btAdd = findViewById(R.id.btAdd);
        btSub = findViewById(R.id.btSub);
        btDiv = findViewById(R.id.btDiv);
        btMulti = findViewById(R.id.btMulti);
        btPer = findViewById(R.id.btPer);
        btEqual = findViewById(R.id.btEqual);

//        setting value to EditText using setText() when button is pressed
        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"1");
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"2");
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"3");
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"4");
            }
        });

        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"5");
            }
        });

        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"6");
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"7");
            }
        });

        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"8");
            }
        });

        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"9");
            }
        });

        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etText.setText(etText.getText()+"0");
            }
        });

//        For Arthamethic operations
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(etText.getText() + "");
                operAdd = true;
                etText.setText(null);
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(etText.getText() + "");
                operSub = true;
                etText.setText(null);
            }
        });

        btMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(etText.getText() + "");
                operMulti = true;
                etText.setText(null);
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(etText.getText() + "");
                operDiv = true;
                etText.setText(null);
            }
        });

        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Float.parseFloat(etText.getText() + "");

                if(operAdd == true){
                    etText.setText(value1 + value2 + "");
                    operAdd = false;
                }

                if(operSub == true){
                    etText.setText(value1 + value2 + "");
                    operSub = false;
                }

                if(operMulti == true){
                    etText.setText(value1 * value2 + "");
                    operSub = false;
                }

                if(operDiv == true){
                    etText.setText(value1 / value2 + "");
                    operDiv = false;
                }

            }
        });

    }
}
