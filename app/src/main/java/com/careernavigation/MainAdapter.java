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

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Ramu on 04-02-2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    Context context;
    ArrayList<BasicModel> itemModelArrayList;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text;
        CircleImageView leftIcon;
        LinearLayout parentLayout;
        public MyViewHolder(View view) {
            super(view);

            text = (TextView) view.findViewById(R.id.text);
            parentLayout = (LinearLayout) view.findViewById(R.id.parent_layout);
            leftIcon = (CircleImageView) view.findViewById(R.id.left_icon);
        }
    }


    public MainAdapter(ArrayList<BasicModel> itemModelArrayList,Context context) {
        this.itemModelArrayList = itemModelArrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_adapter, parent, false);

        return new MyViewHolder(itemView);
    }

    public int getImage(String imageName) {

        int drawableResourceId =context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());

        return drawableResourceId;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final BasicModel sampleData = itemModelArrayList.get(position);
        holder.text.setText(sampleData.text);

try {
    holder.leftIcon.setImageDrawable(sampleData.drawable);
    //holder.parentLayout.setBackgroundColor(Color.parseColor(sampleData.color));
}catch (Exception e)
{
    e.printStackTrace();
}
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(context, SubActivity.class);
                    if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.after_graduation))) {
                        intent.putExtra("from", context.getString(R.string.after_graduation));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.after_post_graduation))) {
                        intent.putExtra("from", context.getString(R.string.after_post_graduation));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.top_colleges))) {
                        intent.putExtra("from", context.getString(R.string.top_colleges));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.after_x))) {
                        intent.putExtra("from", context.getString(R.string.after_x));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.after_intermediate))) {
                        intent.putExtra("from", context.getString(R.string.after_intermediate));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.top_universities))) {
                        intent.putExtra("from", context.getString(R.string.top_universities));
                    } else if (sampleData.text.toString().equalsIgnoreCase(context.getString(R.string.competitive_exams))) {
                        intent.putExtra("from", context.getString(R.string.competitive_exams));
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
