package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //ArrayList to store the Numbers
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("One");
        wordsList.add("Two");
        wordsList.add("Three");
        wordsList.add("Four");
        wordsList.add("Five");
        wordsList.add("Six");
        wordsList.add("Seven");
        wordsList.add("Eight");
        wordsList.add("Nine");
        wordsList.add("Ten");

        //Log messages to display messages to console while the app is running.
        for (String x : wordsList) {
            Log.v("NumbersActivity : ", "Word at Position " + i + " =>" + x);
            i++;
        }
    }
}
