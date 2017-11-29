package com.zxdmjr.cricinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zxdmjr.cricinfo.activities.CurrentMatchActivity;
import com.zxdmjr.cricinfo.adapters.CurrentMatchAdapter;
import com.zxdmjr.cricinfo.adapters.GridAdapter;
import com.zxdmjr.cricinfo.constants.Constant;
import com.zxdmjr.cricinfo.models.Title;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.gv_option)
    GridView gvOption;

    private GridAdapter adapter;

    private List<Title> titles;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        titles = Constant.getTitles();

        setAdapter();

        gvOption.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(adapter != null){

                    chooseOption(position);

                }
            }
        });

    }

    private void chooseOption(int position) {

        switch (position){

            case 0:
                gotoCurrentMatchActivity();
                break;

            case 1:

                break;

            case 2:

                break;

        }
    }

    private void gotoCurrentMatchActivity() {

        startActivity(new Intent(getApplicationContext(), CurrentMatchActivity.class));
    }

    private void setAdapter() {

        if(titles != null) {
            adapter = new GridAdapter(this, titles);
            gvOption.setAdapter(adapter);
        }
    }
}
