package com.zxdmjr.cricinfo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zxdmjr.cricinfo.R;
import com.zxdmjr.cricinfo.interfaces.ItemClickListener;
import com.zxdmjr.cricinfo.models.Match;
import com.zxdmjr.cricinfo.viewholders.CurrentMatchViewHolder;

import java.util.List;

/**
 * Created by eict on 11/29/17.
 */

public class CurrentMatchAdapter extends RecyclerView.Adapter<CurrentMatchViewHolder> {

    private Context context;
    private List<Match> matches;

    public CurrentMatchAdapter(Context context, List<Match> matches) {
        this.context = context;
        this.matches = matches;
    }

    @Override
    public CurrentMatchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.single_current_match, parent, false);

        return new CurrentMatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CurrentMatchViewHolder holder, int position) {

        holder.bind(matches.get(position));

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return matches.size();
    }
}
