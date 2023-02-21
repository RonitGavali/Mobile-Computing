package com.GUI.mobile_computing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mobile_computing.R;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button btn1 ,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1=findViewById(R.id.button2);
        btn2=findViewById(R.id.button4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent button ;
        switch (view.getId())
        {
            case R.id.button2:
                button = new Intent(this,MainActivity3.class);
                startActivity(button);
                break;

            case R.id.button4:
                button = new Intent(this,MainActivity4.class);
                startActivity(button);
                break;
        }

    }
}