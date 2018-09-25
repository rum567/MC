package com.rum29.assno1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UniversityActivity extends AppCompatActivity {
     TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        tv1.findViewById(R.id.dd1);
        Intent t=getIntent();
        if(t!=null)
        {
            String message=t.getStringExtra("message");
            tv1.setText(message);
        }
    }
}
