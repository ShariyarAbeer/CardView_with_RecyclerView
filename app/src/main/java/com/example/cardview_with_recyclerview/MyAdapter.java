package com.example.cardview_with_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {

    String nameData[], readmeData[];
    int imagesData[];
    Context context;

    public MyAdapter(Context cnt, String name[], String readme[], int images[]){
        context = cnt;
        nameData = name;
        readmeData = readme;
        imagesData = images;

    }







    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_view, parent, false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.nameView.setText(nameData[position]);
        holder.readmeView.setText(readmeData[position]);
        holder.imageView.setImageResource(imagesData[position]);
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DataShow.class);
                intent.putExtra("namepass",nameData[position]);
                intent.putExtra("realmepass",readmeData[position]);
                intent.putExtra("imagepass",imagesData[position]);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return nameData.length;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView nameView, readmeView;
        ImageView imageView;
        LinearLayout mainLayout;



        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.nameView);
            readmeView = itemView.findViewById(R.id.readmeView);
            imageView = itemView.findViewById(R.id.image);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
