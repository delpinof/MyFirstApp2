package com.example.fherddelpino.myfirstapp2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //getSupportFragmentManager().beginTransaction().add(R.id.fragment_blank, new BlankFragment()).commit();
    }

    public void onFragmentInteraction(Uri uri){

    }


}
