package com.gwamelody.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button find;
    EditText name;
EditText score;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find = (Button) findViewById(R.id.find);
        exit = (Button) findViewById(R.id.exit);
        name = (EditText) findViewById(R.id.name1);
        score = (EditText) findViewById(R.id.score1);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grade ="";
                int score1 = Integer.valueOf(score.getText().toString());
                String namee = name.getText().toString();
                String scoree = score.getText().toString();
                Intent NewPage = new Intent(MainActivity.this,MainActivityTwo.class);
                startActivity(NewPage);
                if (namee.length()==0 || scoree.length()==0) {
                    name.setError("ป้อนชื่อ");
                    score.setError("ป้อนคะแนน");
                    if (namee.length()==0) {
                        name.setError("ป้อนชื่อ");
                    }
                    else if (scoree.length()==0) {
                        score.setError("ป้อนคะแนน");

                    }
                }

                      else {


                    if (score1 >= 80) {
                        grade = "A";

                    } else if (score1 >= 70 && score1 <= 79) {
                        grade = "B";
                    } else if (score1 >= 60 && score1 <= 69) {
                        grade = "C";

                    } else if (score1 >= 50 && score1 <= 59) {

                        grade = "D";
                    } else if (score1 <= 49) {

                        grade = "F";
                    }

                }

                NewPage.putExtra("textGrade",grade);
                NewPage.putExtra("Name",namee);
                startActivity(NewPage);

            }
        });

    }
}
