package com.example.tonews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    private EditText et;
    private Button bt;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        et=(EditText) findViewById(R.id.t1);
        bt=(Button) findViewById(R.id.but1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent();
                it.setClass(LoginActivity.this,MainActivity.class);
                Bundle bd=new Bundle();
                Intent intent=new Intent();
                bd.putString("Key_input",et.getText().toString());
                intent.putExtras(bd);
                startActivity(intent);
                LoginActivity.this.finish();
            }
        });
    }

}
