package com.example.avengers;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    ArrayList<Model> list;
    Context mContext;


    public Adapter(ArrayList<Model> list,Context mContext) {

        this.list = list;
        this.mContext=mContext;
    }


    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View v;
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        v=layoutInflater.inflate(R.layout.my_item,parent,false);
        return new MyViewHolder(v);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull @NotNull Adapter.MyViewHolder holder, int position) {

        holder.textView1.setText(list.get(position).getHeader());
        holder.textView.setText(list.get(position).getDesc());
        holder.img.setImageResource( list.get( position ).getImg());








        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Model temp=list.get(position);
               Intent intent=new Intent(mContext,MainActivity2.class);
               intent.setFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
               intent.putExtra( "imagename",temp.getImg() );
                intent.putExtra( "header",temp.getHeader() );

                mContext.startActivity( intent );

//
            }
        });







    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView1,textView;
        ImageView img;




        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            textView1=itemView.findViewById( R.id.textView3 );
            textView=itemView.findViewById( R.id.textView4 );
            img=itemView.findViewById( R.id.imageView2 );




        }
    }


}

