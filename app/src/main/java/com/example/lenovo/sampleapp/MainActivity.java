package com.example.lenovo.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashSet<String> set = new HashSet<String>();
        set.add("SURESH 1");
        set.add("SURESH 2");
        set.add("SURESH 3");
        set.add("SURESH 4");
        set.add("SURESH 5");
        set.add("SURESH 6");
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println("TTTTTEEESSTTT" + itr.next());
        }

    }
}



