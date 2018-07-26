package com.mytrendin.facetracking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {
    private static Button button_1,button_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        onClickButtonlistener();
    }
    public void onClickButtonlistener(){
        button_1 = (Button)findViewById(R.id.button18);
        button_1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".SignUp");
                        startActivity(intent);
                    }


                }
        );
        button_2 = (Button)findViewById(R.id.button17);
        button_2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".MainScreen");
                        startActivity(intent);
                    }


                }
        );
    }

}
