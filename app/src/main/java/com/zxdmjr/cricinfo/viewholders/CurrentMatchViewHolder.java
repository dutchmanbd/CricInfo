package com.zxdmjr.cricinfo.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.zxdmjr.cricinfo.R;
import com.zxdmjr.cricinfo.constants.ISO8601DateParser;
import com.zxdmjr.cricinfo.interfaces.ItemClickListener;
import com.zxdmjr.cricinfo.models.Match;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by eict on 11/29/17.
 */

public class CurrentMatchViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    @BindView(R.id.tv_team1)
    TextView tvTeam1;

    @BindView(R.id.tv_team2)
    TextView tvTeam2;

    @BindView(R.id.tv_date)
    TextView tvDate;


    private ItemClickListener itemClickListener;

    public CurrentMatchViewHolder(View view) {
        super(view);

        ButterKnife.bind(this, view);

        view.setOnClickListener(this);
    }


    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void bind(Match match){

        ColorGenerator generator = ColorGenerator.MATERIAL;
        int color1 = generator.getRandomColor();
        int color2 = generator.getRandomColor();

        tvTeam1.setTextColor(color1);
        tvTeam2.setTextColor(color2);

        tvTeam1.setText(match.getTeam1());
        tvTeam2.setText(match.getTeam2());

        Date date = null;
        try {
            date = ISO8601DateParser.parse(match.getDate());

        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(date != null)
            tvDate.setText(new SimpleDateFormat("dd-MM-yyyy").format(date));


        boolean isStarted = Boolean.parseBoolean(match.getMatchStarted());

        if(isStarted){



        } else{


        }
    }

    @Override
    public void onClick(View v) {

        itemClickListener.onClick(v, getAdapterPosition(), false);

    }
}
