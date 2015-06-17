/*
 * Copyright (C) 2015 The Android Developer Nanodegree Project 0
 */

package com.sideez.mynanodegreeportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


public class PortfolioActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    /* Called when the user clicks the button */

    public void displayMessage(View view) {

        // Display message in response to button click

        Toast toast;

        switch (view.getId()) {
            case R.id.spotifyStreamerButton:
                toast = Toast.makeText(getApplicationContext(), "This will launch Spotify Streamer App", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0 , 15);
                toast.show();
                break;
            case R.id.scoresAppButton:
                toast = Toast.makeText(getApplicationContext(), "This will launch Scores App", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0 , 15);
                toast.show();
                break;
            case R.id.libraryAppButton:
                toast = Toast.makeText(getApplicationContext(), "This will launch Library App", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0 , 15);
                toast.show();
                break;
            case R.id.buildBiggerButton:
                toast = Toast.makeText(getApplicationContext(), "This will launch Build it Bigger App", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0 , 15);
                toast.show();
                break;
            case R.id.xyzReaderButton:
                toast = Toast.makeText(getApplicationContext(), "This will launch XYZ Reader App", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0 , 15);
                toast.show();
                break;
            case R.id.capstoneButton:
                toast = Toast.makeText(getApplicationContext(), "This will launch Capstone: My Own App", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0 , 15);
                toast.show();
                break;
            default:
                toast = Toast.makeText(getApplicationContext(), "No button was clicked", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0 , 15);
                toast.show();
                break;
        }
    }
}
