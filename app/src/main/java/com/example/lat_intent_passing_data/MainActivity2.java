package com.example.lat_intent_passing_data;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t = (TextView) findViewById(R.id.text_viewdata);
        Bundle bundle=getIntent().getExtras();
        String s=bundle.getString( "name");
        t.setText(s);
    }
}

