package com.example.alab.for_j;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RatingBar;

/**
 * Created by Alab on 8/1/2016.
 */
public class sad_movie extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_sad);
        RatingBar classicrating = (RatingBar) findViewById(R.id.classic_rating);
        classicrating.setRating((float)4.0);
        RatingBar sadrating = (RatingBar) findViewById(R.id.sad_rating);
        sadrating.setRating((float)3.5);

    }
    public void happy(View v)
    {
        Intent intent = new Intent(this, happy_movie.class);
        startActivityForResult(intent, 1);

    }


}