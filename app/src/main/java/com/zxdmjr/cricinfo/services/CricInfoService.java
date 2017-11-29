package com.zxdmjr.cricinfo.services;

import com.zxdmjr.cricinfo.responses.CurrentMatch;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by eict on 11/29/17.
 */

public interface CricInfoService {

    @POST("api/matches")
    Call<CurrentMatch> getCurrentMatches(@Header("apikey") String apiKey);


    @POST("api/cricket")
    Call<CurrentMatch> getOldMatches(@Header("apikey") String apiKey);

    @POST("api/matchCalendar")
    Call<CurrentMatch> getMatchCalendar(@Header("apikey") String apiKey);

    @FormUrlEncoded
    @POST("api/cricketScore")
    Call<CurrentMatch> getCricketScore(@Header("apikey") String apiKey, @Field("unique_id") String uniqueId);




}
