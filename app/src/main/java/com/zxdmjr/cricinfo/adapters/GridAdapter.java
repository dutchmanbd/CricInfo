package com.zxdmjr.cricinfo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zxdmjr.cricinfo.R;
import com.zxdmjr.cricinfo.models.Title;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by eict on 11/29/17.
 */

public class GridAdapter extends BaseAdapter {

    private Context context;
    private List<Title> titles;

    @BindView(R.id.iv_title_logo)
    ImageView ivLogo;

    @BindView(R.id.tv_title)
    TextView tvTitle;

    public GridAdapter(Context context, List<Title> titles) {
        this.context = context;
        this.titles = titles;
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int position) {
        return titles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if(view == null){

            view = LayoutInflater.from(context).inflate(R.layout.single_grid_item, parent, false);
        }

        ButterKnife.bind(this, view);

        Title title = titles.get(position);

        ivLogo.setImageResource(title.getLogo());
        tvTitle.setText(title.getName());

        Animation anim = new ScaleAnimation(
                0.95f, 1f, // Start and end values for the X axis scaling
                0.95f, 1f, // Start and end values for the Y axis scaling
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                Animation.RELATIVE_TO_SELF, 0.5f); // Pivot point of Y scaling
        anim.setFillAfter(true); // Needed to keep the result of the animation
        anim.setDuration(2000);
        anim.setRepeatMode(Animation.INFINITE);
        anim.setRepeatCount(Animation.INFINITE);
        ivLogo.startAnimation(anim);

        return view;
    }
}
