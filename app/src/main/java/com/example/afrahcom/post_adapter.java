package com.example.afrahcom;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class post_adapter extends RecyclerView.Adapter<post_adapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView ){
            super((itemView));
        }
    }



    @NonNull
    @Override
    public post_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull post_adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
