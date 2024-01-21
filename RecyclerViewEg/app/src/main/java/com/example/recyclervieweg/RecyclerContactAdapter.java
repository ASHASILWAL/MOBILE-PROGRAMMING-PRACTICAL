package com.example.recyclervieweg;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrContact;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContact)
    {
        this.context = context;
        this.arrContact = arrContact;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.imgcontact.setImageResource(arrContact.get(i).img) ;

    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
ImageView imgcontact;
TextView txtName, txtPhone;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgcontact = itemView.findViewById(R.id.imgcontact);
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);

        }




    }
}
