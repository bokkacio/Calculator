package com.example.Calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public void onClick(View v) {
    }
}
