package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int score = 0;
    private int countRight = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        if (getAnswerOne()) {
            countRight += 1;
        }
        if (getAnswerTwo()) {
            countRight += 1;
        }
        if (getAnswerThree()) {
            countRight += 1;
        }
        if (getAnswerFour()) {
            countRight += 1;
        }
        if (getAnswerFive()) {
            countRight += 1;
        }
        score = countRight;
        Toast.makeText(this, " Your score is " + score + " Right Answers = " + countRight + " Wrong Answers = " + (5 - score) + "", Toast.LENGTH_LONG).show();
    }

    public boolean getAnswerOne() {
        String rightAnswerOne = "Albert Einstein";
        EditText answerOne = (EditText) findViewById(R.id.edit);
        String myAnswerOne = answerOne.getText().toString();
        if (myAnswerOne.equalsIgnoreCase(rightAnswerOne)) {
            return true;
        }
        return false;
    }

    public boolean getAnswerTwo() {
        String rightAnswerTwo = "Stefan Hawking";
        EditText answerTwo = (EditText) findViewById(R.id.editTwo);
        String myAnswertwo = answerTwo.getText().toString();
        if (myAnswertwo.equalsIgnoreCase(rightAnswerTwo)) {
            return true;
        }
        return false;
    }

    public boolean getAnswerThree() {
        CheckBox checkOne = (CheckBox) findViewById(R.id.firstCheckBox);
        boolean hasCheckOne = checkOne.isChecked();

        CheckBox checkTwo = (CheckBox) findViewById(R.id.secondCheckBox);
        boolean hasCheckSecond = checkTwo.isChecked();

        CheckBox checkThree = (CheckBox) findViewById(R.id.thirdCheckBox);
        boolean hasCheckThird = checkThree.isChecked();

        if ((hasCheckOne) && (hasCheckSecond) && (!hasCheckThird)) {
            return true;
        }
        return false;
    }

    public boolean getAnswerFour() {


        RadioButton heckYes = (RadioButton) findViewById(R.id.yes_button);
        boolean myHeckYes = heckYes.isChecked();

        RadioButton heckNo = (RadioButton) findViewById(R.id.no_button);
        boolean myHeckNo = heckNo.isChecked();
        if (myHeckYes) {
            return true;
        }
        return false;

    }

    public boolean getAnswerFive() {
        RadioButton heckYesTwo = (RadioButton) findViewById(R.id.yesTwo_button);
        boolean myHeckYesTwo = heckYesTwo.isChecked();

        RadioButton heckNoTwo = (RadioButton) findViewById(R.id.noTwo_button);
        boolean myHeckNoTwo = heckNoTwo.isChecked();
        if (myHeckYesTwo) {
            return true;
        }
        return false;
    }

}
