package com.mytrendin.facetracking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainScreen extends AppCompatActivity {
    private static Button button_1,button_2,button_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        onClickButtonlistener();
    }
    public void onClickButtonlistener(){
        button_1 = (Button)findViewById(R.id.button3);
        button_2 = (Button)findViewById(R.id.button4);
        button_3 = (Button)findViewById(R.id.button5);
        button_1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".FaceTrackerActivity");
                        startActivity(intent);
                    }


                }
        );
        button_2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".StudentDatabase");
                        startActivity(intent);
                    }


                }
        );
        button_3.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("android.intent.action.MAIN");
                        startActivity(intent);
                    }


                }
        );

    }
}
