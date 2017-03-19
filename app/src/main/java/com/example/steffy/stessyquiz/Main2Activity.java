package com.example.steffy.stessyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    int quizScore = 0;
    Button btn, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                RadioGroup rbGroup1 = (RadioGroup) findViewById(R.id.radiogrp1);
                int selectedId1 = rbGroup1.getCheckedRadioButtonId();
                if (selectedId1 != -1) {
                    RadioButton selectedRadioButton1 = (RadioButton) findViewById(selectedId1);
                    String radioButtonText1 = selectedRadioButton1.getText().toString();
                    if ((radioButtonText1).equals(getString(R.string.q1answer))) {
                        quizScore = quizScore + 1;
                    }
                }
                RadioGroup rbGroup2 = (RadioGroup) findViewById(R.id.radiogrp2);
                int selectedId2 = rbGroup2.getCheckedRadioButtonId();
                if (selectedId2 != -1) {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId2);
                    String radioButtonText2 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText2).equals(getString(R.string.q2answer))) {
                        quizScore = quizScore + 1;
                    }
                }


                EditText sampleEditTextView = (EditText) findViewById(R.id.editText2);
                String value = sampleEditTextView.getText().toString();
                if ((value).equals(getString(R.string.q3answer))) {
                    quizScore = quizScore + 1;
                }
                CheckBox q4Answer1 = (CheckBox) findViewById(R.id.checkBox);
                boolean isChecked1 = q4Answer1.isChecked();
                CheckBox q4Answer2 = (CheckBox) findViewById(R.id.checkBox2);
                boolean isChecked2 = q4Answer2.isChecked();
                CheckBox q4Answer3 = (CheckBox) findViewById(R.id.checkBox3);
                boolean isChecked3 = q4Answer3.isChecked();
                CheckBox q4Answer4 = (CheckBox) findViewById(R.id.checkBox4);
                boolean isChecked4 = q4Answer4.isChecked();
                if (isChecked1 && isChecked3 && !isChecked2 && !isChecked4) {
                    quizScore = quizScore + 1;
                }
                TextView scoreView = (TextView) findViewById(R.id.result);
                scoreView.setText(String.valueOf(quizScore));
                Toast.makeText(Main2Activity.this, " your Score is" + quizScore, Toast.LENGTH_LONG).show();


            }
        });
    btn1 = (Button) findViewById(R.id.button3);
    btn1.setOnClickListener(new View.OnClickListener() {
        public void onClick(View V) {
            ViewGroup vg = (ViewGroup) findViewById(R.id.activity_main2);
            vg.invalidate();
            setContentView(R.layout.activity_main2);
        }

    });


}
}
