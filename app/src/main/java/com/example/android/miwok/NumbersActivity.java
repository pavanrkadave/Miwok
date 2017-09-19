package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        //Find the rootView to add child views to it
        LinearLayout rootView = (LinearLayout) findViewById(R.id.root_view);


        //in for Loop the counter variable is initialized and
        // incremented inside the for loop body itself
        //While Loop Keeps looping until the we reach the end of the list
        for (int index = 0; index < wordsList.size(); index++) {

            //Create a new textView
            TextView wordView = new TextView(this);

            //Set the text to the word at the current index
            wordView.setText(wordsList.get(index));

            //Add the textView to the rootView
            rootView.addView(wordView);
        }

    }
}
