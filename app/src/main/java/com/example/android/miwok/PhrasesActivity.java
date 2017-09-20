package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /**
         * ArrayList to store the Phrases in the word class which is custom created by us.
         * It holds both the english translation and the miwok translation
         */
        ArrayList<Word> words = new ArrayList<Word>();

        //Adding the words to the words arrayList
        words.add(new Word("Where are you going?", "Minto Wuksus"));
        words.add(new Word("What is your name?", "Tinnә Oyaase'nә"));
        words.add(new Word("My name is...", "Oyaaset..."));
        words.add(new Word("How are you feeling?", "Michәksәs?"));
        words.add(new Word("I’m feeling good.", "Kuchi Achit"));
        words.add(new Word("Are you coming?", "әәnәs'Aa?"));
        words.add(new Word("Yes, I’m coming.", "Hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "Yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Setting the itemsAdapter to the listView
        listView.setAdapter(adapter);

    }
}
