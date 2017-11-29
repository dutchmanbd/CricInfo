package com.zxdmjr.cricinfo.responses;

import com.google.gson.annotations.SerializedName;
import com.zxdmjr.cricinfo.models.Match;

import java.util.List;

/**
 * Created by eict on 11/29/17.
 */

public class CurrentMatch {

//    "matches"
//    "v": "1",
//            "ttl": 44,
//            "provider": {
//        "source": "Various",
//                "url": "https://cricapi.com/",
//                "pubDate": "2017-11-29T09:50:06.692Z"
//    },
//            "creditsLeft": 248

    @SerializedName("matches")
    private List<Match> matches;

    @SerializedName("v")
    private int v;

    @SerializedName("creditsLeft")
    private int creditsLeft;

    public CurrentMatch(List<Match> matches, int v, int creditsLeft) {
        this.matches = matches;
        this.v = v;
        this.creditsLeft = creditsLeft;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getCreditsLeft() {
        return creditsLeft;
    }

    public void setCreditsLeft(int creditsLeft) {
        this.creditsLeft = creditsLeft;
    }
}
