package com.educate;

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
public class SubOneAdapter extends RecyclerView.Adapter<SubOneAdapter.MyViewHolder> {

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


    public SubOneAdapter(ArrayList<BasicModel> itemModelArrayList,Context context) {
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

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    Intent intent = new Intent(context, SubTwoActivity.class);
                    if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_commerce))) {
                        intent.putExtra("from", context.getString(R.string.two_commerce));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_arts))) {
                        intent.putExtra("from", context.getString(R.string.two_arts));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_science))) {
                        intent.putExtra("from", context.getString(R.string.two_science));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_technical))) {
                        intent.putExtra("from", context.getString(R.string.two_technical));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_non_technical))) {
                        intent.putExtra("from", context.getString(R.string.two_non_technical));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_animation_and_mulitmedia))) {
                        intent.putExtra("from", context.getString(R.string.two_animation_and_mulitmedia));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_creative_and_working))) {
                        intent.putExtra("from", context.getString(R.string.two_creative_and_working));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_digital_marketing))) {
                        intent.putExtra("from", context.getString(R.string.two_digital_marketing));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_seo))) {
                        intent.putExtra("from", context.getString(R.string.two_seo));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_graphic_designer_course))) {
                        intent.putExtra("from", context.getString(R.string.two_graphic_designer_course));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_webdesign_and_development_course))) {
                        intent.putExtra("from", context.getString(R.string.two_webdesign_and_development_course));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_appdevelopment_and_design_course))) {
                        intent.putExtra("from", context.getString(R.string.two_appdevelopment_and_design_course));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.two_appdevelopment_and_design_course))) {
                        intent.putExtra("from", context.getString(R.string.two_appdevelopment_and_design_course));
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

