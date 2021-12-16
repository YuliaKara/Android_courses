package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    private List<Data> dataList;

    public void setData(List<Data> dataList){
        this.dataList = dataList;
        notifyDataChanged();
    }

    private void notifyDataChanged() {
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.res_data, parent,false);
        return new DataViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        Data currentData = dataList.get(position);
        if(currentData!=null){
            holder.avatar.setImageResource(currentData.getAvatar());
            holder.name.setText(currentData.getName());
            holder.dateB.setText(currentData.getDateB());
            holder.email.setText(currentData.getEmail());
        }
    }

    public int getItemCount(){return dataList.size();}

    public class DataViewHolder extends RecyclerView.ViewHolder{
        public ImageView avatar;
        public TextView name;
        public TextView dateB;
        public TextView email;
        public DataViewHolder(@NonNull View itemView){
            super(itemView);
            avatar = itemView.findViewById(R.id.avatarIV);
            name = itemView.findViewById(R.id.nameTV);
            dateB = itemView.findViewById(R.id.dateOfBirth);
            email = itemView.findViewById(R.id.email);
        }

    }


}
