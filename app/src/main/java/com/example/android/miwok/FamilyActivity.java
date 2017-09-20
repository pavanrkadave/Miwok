package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /**
         * ArrayList to store the FamilyMembers in the word class which is custom created by us.
         * It holds both the english translation and the miwok translation
         */
        ArrayList<Word> words = new ArrayList<Word>();

        //Adding the words to the words arrayList
        words.add(new Word("Father", "әpә", R.drawable.family_father));
        words.add(new Word("Mother", "әṭa", R.drawable.family_mother));
        words.add(new Word("Son", "Angsi", R.drawable.family_son));
        words.add(new Word("Daughter", "Tune", R.drawable.family_daughter));
        words.add(new Word("Older brother", "Taachi", R.drawable.family_older_brother));
        words.add(new Word("Younger brother", "Chalitti", R.drawable.family_younger_brother));
        words.add(new Word("Older sister", "Teṭe", R.drawable.family_older_sister));
        words.add(new Word("Younger sister", "Kolliti", R.drawable.family_younger_sister));
        words.add(new Word("Grandmother", "Ama", R.drawable.family_grandmother));
        words.add(new Word("Grandfather", "Paapa", R.drawable.family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Setting the itemsAdapter to the listView
        listView.setAdapter(adapter);

    }
}
