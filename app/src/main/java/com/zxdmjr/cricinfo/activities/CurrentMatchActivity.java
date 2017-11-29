package com.zxdmjr.cricinfo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zxdmjr.cricinfo.R;
import com.zxdmjr.cricinfo.adapters.CurrentMatchAdapter;
import com.zxdmjr.cricinfo.constants.Common;
import com.zxdmjr.cricinfo.constants.Constant;
import com.zxdmjr.cricinfo.models.Match;
import com.zxdmjr.cricinfo.responses.CurrentMatch;
import com.zxdmjr.cricinfo.services.CricInfoService;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrentMatchActivity extends AppCompatActivity {

    @BindView(R.id.rv_current_matches)
    RecyclerView rvCurrentMatches;

    private CricInfoService cricInfoService;

    private List<Match> matches;

    private CurrentMatchAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_match);

        ButterKnife.bind(this);

        rvCurrentMatches.setLayoutManager(new LinearLayoutManager(this));
        rvCurrentMatches.setHasFixedSize(true);

        cricInfoService = Common.getService();

        fetchCurrentMatches();
    }

    private void fetchCurrentMatches() {

        Call<CurrentMatch> call = cricInfoService.getCurrentMatches(Constant.API_KEY);

        call.enqueue(new Callback<CurrentMatch>() {
            @Override
            public void onResponse(Call<CurrentMatch> call, Response<CurrentMatch> response) {

                if(response.body() != null){

                    matches = response.body().getMatches();

                    if(matches != null && matches.size() > 0){

                        setAdapter();
                    }
                }

            }

            @Override
            public void onFailure(Call<CurrentMatch> call, Throwable t) {

            }
        });

    }

    private void setAdapter(){

        if(matches != null && matches.size() > 0) {
            adapter = new CurrentMatchAdapter(this, matches);
            rvCurrentMatches.setAdapter(adapter);
        }

    }
}
