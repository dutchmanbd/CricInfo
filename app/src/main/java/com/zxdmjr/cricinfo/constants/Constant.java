package com.zxdmjr.cricinfo.constants;

import com.zxdmjr.cricinfo.R;
import com.zxdmjr.cricinfo.models.Title;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eict on 11/29/17.
 */

public class Constant {


    public static final String API_KEY = "WPq4nBVp94Su9PGcbi0JkyjZftJ2";
    public static final String BASE_URL = "http://cricapi.com/";


    public static List<Title> getTitles(){

        List<Title> titles = new ArrayList<>();

        titles.add(new Title("CURRENT MATCHES", R.drawable.ic_current_match));
        titles.add(new Title("OLD MATCHES", R.drawable.ic_old_match));
        titles.add(new Title("MATCH CALENDAR", R.drawable.ic_calendar_small));
//        titles.add(new Title("Current Matches", R.drawable.ic_cric_info));
//        titles.add(new Title("Current Matches", R.drawable.ic_cric_info));
//        titles.add(new Title("Current Matches", R.drawable.ic_cric_info));
//        titles.add(new Title("Current Matches", R.drawable.ic_cric_info));
//        titles.add(new Title("Current Matches", R.drawable.ic_cric_info));

        return titles;

    }



}
