package com.mytrendin.facetracking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentDatabase extends AppCompatActivity {
    private static Button button_1,button_2,button_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_database);
        onClickButtonlistener();
    }
    public void onClickButtonlistener(){
        button_1 = (Button)findViewById(R.id.button6);
        button_2 = (Button)findViewById(R.id.button7);
        button_3 = (Button)findViewById(R.id.button8);
        button_1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".AddStudent");
                        startActivity(intent);
                    }


                }
        );
        button_2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".UpdateStudent");
                        startActivity(intent);
                    }


                }
        );
        button_3.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".DeleteStudent");
                        startActivity(intent);
                    }


                }
        );

    }
}
