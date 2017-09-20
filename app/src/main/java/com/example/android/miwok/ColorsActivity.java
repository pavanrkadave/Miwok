package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /**
         * ArrayList to store the Colors in the word class which is custom created by us.
         * It holds both the english translation and the miwok translation
         */
        ArrayList<Word> words = new ArrayList<Word>();

        //Adding the words to the words arrayList
        words.add(new Word("Red", "Weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("Green", "Chokokki", R.drawable.color_green));
        words.add(new Word("Brown", "Takaakki", R.drawable.color_brown));
        words.add(new Word("Gray", "Topoppi", R.drawable.color_gray));
        words.add(new Word("Black", "Kululli", R.drawable.color_black));
        words.add(new Word("White", "Kelelli", R.drawable.color_white));
        words.add(new Word("Dusty Yellow", "Topiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "Chiwiiṭә", R.drawable.color_mustard_yellow));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Setting the itemsAdapter to the listView
        listView.setAdapter(adapter);

    }
}
