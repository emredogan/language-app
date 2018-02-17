package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by emredogan on 13/02/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    private int mColorsResourceId;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);




        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultTextView);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);

        miwokTextView.setText(currentWord.getMiwokTranslation());







        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView


        if(currentWord.hasImage()) {

            iconView.setImageResource(currentWord.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);


        } else {


            iconView.setVisibility(View.GONE);



        }


        View textContainer = listItemView.findViewById(R.id.textContainer);

        int color = ContextCompat.getColor(getContext(),mColorsResourceId);

        textContainer.setBackgroundColor(color);

        ImageView playButtonImageView = (ImageView) listItemView.findViewById(R.id.playButtonImageView);
        playButtonImageView.setBackgroundColor(color);

        LinearLayout imageLayout = (LinearLayout) listItemView.findViewById(R.id.imageLayout);
        imageLayout.setBackgroundColor(color);

        LinearLayout homeLayout = (LinearLayout) listItemView.findViewById(R.id.homeLayout);
        homeLayout.setBackgroundColor(color);





        return listItemView;

       // return super.getView(position, convertView, parent);
    }

    public WordAdapter(Activity context, ArrayList<Word> words, int colorsResourceId) {
        super(context, 0, words);
        mColorsResourceId  = colorsResourceId;

    }




}


