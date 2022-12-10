package com.unab.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class Register extends AppCompatActivity {
CircleImageView mReturnCircle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mReturnCircle=findViewById(R.id.Return);
        mReturnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}