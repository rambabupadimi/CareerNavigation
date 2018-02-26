package com.educate;

/**
 * Created by Ramu on 11-02-2018.
 */

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
 * Created by Ramu on 04-02-2018.
 */

public class SubAdapter extends RecyclerView.Adapter<SubAdapter.MyViewHolder> {

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


    public SubAdapter(ArrayList<BasicModel> itemModelArrayList,Context context) {
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

        if(sampleData.drawable!=null )
            holder.leftIcon.setImageDrawable(sampleData.drawable);
        //holder.parentLayout.setBackgroundColor(Color.parseColor(sampleData.color));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

try {
    Intent intent = new Intent(context, SubOneActivity.class);
    if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.one_xii))) {
        intent.putExtra("from", context.getString(R.string.one_xii));
    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.one_diploma))) {
        intent.putExtra("from", context.getString(R.string.one_diploma));
    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.one_iti))) {
        intent.putExtra("from", context.getString(R.string.one_iti));
    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.one_paramedical_courses))) {
        intent.putExtra("from", context.getString(R.string.one_paramedical_courses));
    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.one_computer_courses))) {
        intent.putExtra("from", context.getString(R.string.one_computer_courses));
    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.one_seo))) {
        intent.putExtra("from", context.getString(R.string.one_seo));
    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.one_others))) {
        intent.putExtra("from", context.getString(R.string.one_others));
    }

    context.startActivity(intent);
}catch (Exception e)
{
    e.printStackTrace();
}
            }
        });

    }


    @Override
    public int getItemCount() {
        return itemModelArrayList.size();
    }


}
