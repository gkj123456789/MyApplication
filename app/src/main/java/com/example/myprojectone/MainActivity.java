package com.example.myprojectone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1_mainactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findid();
        setidlister();

    }

    private void setidlister() {
        tv1_mainactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String name =  tv1_mainactivity.getText().toString();
                if(name=="你好 我的世界!"){
                    tv1_mainactivity.setText("谢谢你，我的世界！");
                }else{
                    tv1_mainactivity.setText("你好 我的世界!");
                }
            }
        });
    }

    private void findid() {
        tv1_mainactivity = (TextView) findViewById(R.id.tv1_mainactivity);
    }
}
