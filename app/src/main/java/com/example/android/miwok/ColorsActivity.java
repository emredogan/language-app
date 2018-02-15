package com.example.android.miwok;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    ArrayList<Word> words = new ArrayList<Word>();

    LinearLayout rootView;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        rootView = (LinearLayout) findViewById(R.id.rootView);


        words.add(new Word("red","weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("green","chokokki", R.drawable.color_green));
        words.add(new Word("brown","ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray","ṭopoppi", R.drawable.color_gray));
        words.add(new Word("black","kululli", R.drawable.color_black));
        words.add(new Word("white","kelelli",R.drawable.color_white));
        words.add(new Word("dusty-yellow" ,"ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Word("mustard-yellow","chiwiiṭә",R.drawable.color_mustard_yellow));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
