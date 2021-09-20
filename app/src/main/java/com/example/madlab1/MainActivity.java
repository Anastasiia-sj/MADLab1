package com.example.madlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn, btnNext;
    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMainLabel);
        this.btnNext = (Button) findViewById(R.id.btnNext);
        this.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity2();
            }
        });
    }

    public void activity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void onBtnChangeClick(View view) {
        this.tvMain.setText("Text has been changed!");
        this.tvMain.setTextColor(Color.BLUE);
    }

}