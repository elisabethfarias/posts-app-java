package com.example.postapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.postapp.databinding.PostsItemBinding;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PostsViewHolder extends RecyclerView.ViewHolder {
        PostsItemBinding binding;

        public PostsViewHolder(PostsItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
