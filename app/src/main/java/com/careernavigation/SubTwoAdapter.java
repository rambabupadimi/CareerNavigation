package com.careernavigation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ramu on 15-02-2018.
 */
public class SubTwoAdapter extends RecyclerView.Adapter<SubTwoAdapter.MyViewHolder> {

    Context context;
    ArrayList<BasicModel> itemModelArrayList;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text;
        ImageView leftIcon;
        LinearLayout parentLayout;
        public MyViewHolder(View view) {
            super(view);

            text = (TextView) view.findViewById(R.id.text);
            parentLayout = (LinearLayout) view.findViewById(R.id.parent_layout);
            leftIcon = (ImageView) view.findViewById(R.id.left_icon);
        }
    }


    public SubTwoAdapter(ArrayList<BasicModel> itemModelArrayList,Context context) {
        this.itemModelArrayList = itemModelArrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_adapter, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final BasicModel sampleData = itemModelArrayList.get(position);
        holder.text.setText(sampleData.text);
       if(sampleData.drawable!=null)
            holder.leftIcon.setImageDrawable(sampleData.drawable);
       else
           holder.leftIcon.setImageDrawable(context.getResources().getDrawable(R.drawable.default_image));

        //holder.parentLayout.setBackgroundColor(Color.parseColor(sampleData.color));


    }


    @Override
    public int getItemCount() {
        return itemModelArrayList.size();
    }


}


