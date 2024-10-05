package com.example.chesswithrecview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoneAdapter extends RecyclerView.Adapter<StoneAdapter.ViewHolder> {
    private ArrayList<Stone>Stones;
    ItemSelected activity;
    public interface ItemSelected{
        void onItemClicked(int Index);
    }
    public StoneAdapter(Context context,ArrayList<Stone> list){
        this.Stones=list;
        activity=(ItemSelected)context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName =itemView.findViewById(R.id.tvName);
            imageView=itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onItemClicked(Stones.indexOf(view.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public StoneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoneAdapter.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(Stones.get(i));
        viewHolder.tvName.setText(Stones.get(i).getName());
        viewHolder.imageView.setImageResource(Stones.get(i).getImg());
    }

    @Override
    public int getItemCount() {
        return Stones.size();
    }

}

