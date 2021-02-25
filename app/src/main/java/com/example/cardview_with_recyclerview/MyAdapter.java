package com.example.cardview_with_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

    }

    @Override
    public int getItemCount() {
        return nameData.length;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView nameView, readmeView;
        ImageView imageView;



        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.nameView);
            readmeView = itemView.findViewById(R.id.readmeView);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
