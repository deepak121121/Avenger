package com.example.avengers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    CircleImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        imageView=findViewById( R.id.image );
        textView=findViewById( R.id.textView );
        img=findViewById( R.id.img1 );
        textView.setText( getIntent().getStringExtra( "header" ) );
        imageView.setImageResource( getIntent().getIntExtra( "imagename",0 ) );
        img.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity( intent );
            }
        } );
    }
}