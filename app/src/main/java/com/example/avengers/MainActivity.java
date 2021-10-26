package com.example.avengers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerView=findViewById( R.id.Recycle );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        Adapter adapter=new Adapter(data() ,getApplicationContext());
        recyclerView.setAdapter( adapter );
    }
    public ArrayList<Model>data(){
        ArrayList<Model>holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader( "super man" );
        ob1.setDesc("very good");
        ob1.setImg( R.drawable.supermen );
        holder.add( ob1 );
        Model ob2=new Model();
        ob2.setHeader( "spider man" );
        ob2.setDesc("Normal");
        ob2.setImg( R.drawable.spiderman );
        holder.add( ob2 );
        Model ob3=new Model();
        ob3.setHeader( "    hulk" );
        ob3.setDesc("Awesome");
        ob3.setImg( R.drawable.hulk );
        holder.add( ob3);

        return holder;
    }


}