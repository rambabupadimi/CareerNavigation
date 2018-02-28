package com.educate;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Ramu on 28-02-2018.
 */

public class BottomSheetFragment extends BottomSheetDialogFragment {
    SampleData sampleData;

    LinearLayout exit,share,feedback,rate,aboutus,bookmark;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.dialog_layout, container);
        sampleData = new SampleData(getContext());
        exit = (LinearLayout) contentView.findViewById(R.id.exit_layout);
        share = (LinearLayout) contentView.findViewById(R.id.share_layout);
        feedback = (LinearLayout) contentView.findViewById(R.id.feedback_layout);
        rate = (LinearLayout) contentView.findViewById(R.id.rateapp_layout);
        aboutus = (LinearLayout) contentView.findViewById(R.id.about_us_layout);
        bookmark = (LinearLayout) contentView.findViewById(R.id.bookmark_layout);


        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                SampleData.openFeedback(getContext());
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                Intent intent=new Intent(getContext(),AboutUsActivity.class);
                startActivity(intent);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                SampleData.shareTextUrl(getContext());
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return contentView;

    }

}
