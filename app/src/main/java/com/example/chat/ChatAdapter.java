package com.example.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {
    ArrayList<Chat> list=new ArrayList();

    public ChatAdapter(ArrayList<Chat> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        Chat item=list.get(position);
        holder.tv.setText(item.getName());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
          tv=  itemView.findViewById(R.id.tv_name);
        }
    }

}
