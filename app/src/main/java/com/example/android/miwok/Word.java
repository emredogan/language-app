package com.example.android.miwok;

/**
 * Created by emredogan on 13/02/2018.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    private static  final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audiResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audiResourceId;






    }


    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,int audiResourceId ) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

        mImageResourceId = imageResourceId;
        mAudioResourceId = audiResourceId;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {



            return mAudioResourceId;
    }

    public boolean hasImage() {

        return mImageResourceId != NO_IMAGE_PROVIDED;

    }







}
