package com.example.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    ArrayList<User> list=new ArrayList();

    public UserAdapter(ArrayList<User> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null,false));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User item=list.get(position);
        holder.tv.setText(item.getName());

    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        TextView tv;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
           tv= itemView.findViewById(R.id.tv_name);
        }
    }
}
