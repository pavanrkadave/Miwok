package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
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

        //Using the ArrayAdapter to recycle the views
        //This method makes efficient use of memory
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wordsList);

        //Identifying the ListView to put the words in the list
        ListView listView = (ListView)findViewById(R.id.list);

        //Setting the itemsAdapter to the listView
        listView.setAdapter(itemsAdapter);

    }
}
