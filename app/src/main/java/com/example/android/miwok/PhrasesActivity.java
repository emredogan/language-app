package com.example.android.miwok;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    ArrayList<Word> words = new ArrayList<Word>();

    LinearLayout rootView;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        rootView = (LinearLayout) findViewById(R.id.rootView);

        words.add(new Word("Where are you going?","minto wuksus"));
        words.add(new Word("What is your name? ","tinnә oyaase'nә"));
        words.add(new Word("My name is...","oyaaset"));
        words.add(new Word("How are you feeling?","michәksәs?"));
        words.add(new Word("I’m feeling good.","kuchi achit"));
        words.add(new Word("Are you coming?","әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming." ,"hәә’ әәnәm"));
        words.add(new Word("I’m coming.","әәnәm"));
        words.add(new Word("Let’s go.","yoowutis"));
        words.add(new Word("Come here.","әnni'nem"));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
