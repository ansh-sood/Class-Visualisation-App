package com.mytrendin.facetracking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeScreen extends AppCompatActivity {
    private static Button button_sbm,button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        onClickButtonlistener();
    }
    public void onClickButtonlistener(){
        button_sbm = (Button)findViewById(R.id.button2);
        button_sbm.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".MainScreen");
                        startActivity(intent);
                    }


                }
        );
        button_1 = (Button)findViewById(R.id.button16);
        button_1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".SignUp");
                        startActivity(intent);
                    }


                }
        );
    }
}
