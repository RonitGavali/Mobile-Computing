package com.GUI.mobile_computing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mobile_computing.R;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    private Button btn1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn1=findViewById(R.id.button4);


        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent button ;
        switch (view.getId())
        {
            case R.id.button4:
                button = new Intent(this,MainActivity5.class);
                startActivity(button);
                break;

        }

    }
}