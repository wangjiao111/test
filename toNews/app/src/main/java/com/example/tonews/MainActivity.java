package com.example.tonews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView) findViewById(R.id.tx);

        Bundle db=new Bundle();
        String inputText=new String();
        inputText=db.getString("Key_input");
        tv.setText("您输入的内容是："+inputText);
    }
}
