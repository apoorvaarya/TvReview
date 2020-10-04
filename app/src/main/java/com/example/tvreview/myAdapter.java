package com.example.tvreview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter {



}

class TvViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mTitle, mGenre, mRate;
    CardView mCardView;

    public TvViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mGenre = itemView.findViewById(R.id.tvGenre);
        mRate = itemView.findViewById(R.id.tvRate);

        mCardView = itemView.findViewById(R.id.myCardView);

    }
}