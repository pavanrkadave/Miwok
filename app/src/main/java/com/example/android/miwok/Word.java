package com.example.android.miwok;

/**
 * Created by pavan on 9/19/2017.
 * {@link Word} represents a vocabulary of word that a user wants to learn.
 * It contains a default translation and a miwok translation of that word.
 */

public class Word {

    //Default translation of the word
    private String mDefaultTranslation;

    //Miwok translation of the word
    private String mMiwokTranslation;


    /**
     * Create a new word object
     *
     * @param defaultTranslation is the word in a language that a user is already familier with (like English).
     *
     * @param miwokTranslation is the miwok translation of the same word in language user is familier with.
     */
    Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word
     * @returns the default translation of the word
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word
     * @returns the miwok translation of the word
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
