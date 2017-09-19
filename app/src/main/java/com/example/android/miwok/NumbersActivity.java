package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] words = new String[10];
        words[0] = "One";
        words[1] = "Two";
        words[2] = "Three";
        words[3] = "Four";
        words[4] = "Five";
        words[5] = "Six";
        words[6] = "Seven";
        words[7] = "Eight";
        words[8] = "Nine";
        words[9] = "Ten";


        Log.v("NumbersActivity : ","Word At Index 0 => " + words[0]);
        Log.v("NumbersActivity : ","Word At Index 1 => " + words[1]);
        Log.v("NumbersActivity : ","Word At Index 2 => " + words[2]);
        Log.v("NumbersActivity : ","Word At Index 3 => " + words[3]);
        Log.v("NumbersActivity : ","Word At Index 4 => " + words[4]);
        Log.v("NumbersActivity : ","Word At Index 5 => " + words[5]);
        Log.v("NumbersActivity : ","Word At Index 6 => " + words[6]);
        Log.v("NumbersActivity : ","Word At Index 7 => " + words[7]);
        Log.v("NumbersActivity : ","Word At Index 8 => " + words[8]);
        Log.v("NumbersActivity : ","Word At Index 9 => " + words[9]);

    }
}
