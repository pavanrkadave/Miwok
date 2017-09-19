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

    //ImageRes Id to get the image resource
    private int mImageResId;


    /**
     * Create a new word object
     *
     * @param defaultTranslation is the word in a language that a user is already familier with (like English).
     * @param miwokTranslation   is the miwok translation of the same word in language user is familier with.
     */
    Word(String defaultTranslation, String miwokTranslation, int imageResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResId = imageResId;
    }

    /**
     * Get the default translation of the word
     *
     * @returns the default translation of the word
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word
     *
     * @returns the miwok translation of the word
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image resource id fetch the proper image
     *
     * @returns the image for the proper imageView
     */
    public int getmImageResId() {
        return mImageResId;
    }
}
