package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pavan on 9/19/2017.
 */

class WordAdapter extends ArrayAdapter<Word> {


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words   A List of AndroidFlavor objects to display in a list
     */
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        //Check if the current view is being reused,otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        // Get the default Translation from the current currentWord object and
        // set this text on the defaultTransaltion TextView
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // Get the miwok Translation from the current currentWord object and
        // set this text on the miwokTransaltion TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        //return the entire listItemView which contains 2 TextViews
        return listItemView;
    }
}
