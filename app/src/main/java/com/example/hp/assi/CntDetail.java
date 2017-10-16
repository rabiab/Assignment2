package com.example.hp.assi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class CntDetail extends AppCompatActivity {
ImageView img;
    TextView txtname,txtemail,txtmob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnt_detail);
        img=(ImageView)findViewById(R.id.im);
        txtname=(TextView)findViewById(R.id.name);
        txtemail=(TextView)findViewById(R.id.email);
        txtmob=(TextView)findViewById(R.id.mob);
img.setImageResource(getIntent().getIntExtra("img id",0));
        txtname.setText("Name:"+getIntent().getStringExtra("Name"));
        txtemail.setText("Email:"+getIntent().getStringExtra("Email"));
        txtmob.setText("Mob No:"+getIntent().getStringExtra("MobNo"));


    }
}
