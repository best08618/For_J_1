package com.example.alab.for_j;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Alab on 8/1/2016.
 */
public class choosing_mood extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosing_mood);

    }

    public void sad_movie (View v)
    {
        Intent intent = new Intent(this,sad_movie.class);
        startActivity(intent);
    }

    public void happy_movie (View v)
    {
        Intent intent = new Intent(this,happy_movie.class);
        startActivity(intent);
    }


}