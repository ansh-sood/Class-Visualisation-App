package com.mytrendin.facetracking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddStudent extends AppCompatActivity {
    private static Button button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        onClickButtonlistener();
    }
    public void onClickButtonlistener(){
        button_1 = (Button)findViewById(R.id.button10);
        button_1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".ConfirmAdd");
                        startActivity(intent);
                    }


                }
        );
    }
}
