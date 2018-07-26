package com.mytrendin.facetracking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmDelete extends AppCompatActivity {
    private static Button button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_delete);
        onClickButtonlistener();
    }
    public void onClickButtonlistener(){
        button_1 = (Button)findViewById(R.id.button15);
        button_1.setOnClickListener(
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
