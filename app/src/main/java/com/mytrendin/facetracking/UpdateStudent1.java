package com.mytrendin.facetracking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdateStudent1 extends AppCompatActivity {
    private static Button button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_student1);
        onClickButtonlistener();
    }
    public void onClickButtonlistener(){
        button_1 = (Button)findViewById(R.id.button14);
        button_1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(".ConfirmUpdate");
                        startActivity(intent);
                    }


                }
        );
    }
}
