package com.example.pr_71;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pr_71.R;
import com.example.pr_71.UserInterface.BlankFragment;
import com.example.pr_71.UserInterface.BlankFragment2;

public class MainActivity extends AppCompatActivity {
    private BlankFragment blank = new BlankFragment();
    private BlankFragment2 blank2 = new BlankFragment2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
