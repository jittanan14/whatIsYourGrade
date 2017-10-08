package com.gwamelody.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivityTwo extends AppCompatActivity {
TextView name;
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        Intent Page = getIntent();
        String grade = Page.getStringExtra("textGrade");
        score = (TextView) findViewById(R.id.grade);
       name = (TextView)  findViewById(R.id.textView1);
        score.setText(grade);



     //  name.setText((CharSequence) name);

    }
}
