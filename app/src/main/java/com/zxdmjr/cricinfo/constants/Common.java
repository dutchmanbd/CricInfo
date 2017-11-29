package com.zxdmjr.cricinfo.constants;

import com.zxdmjr.cricinfo.services.CricInfoClient;
import com.zxdmjr.cricinfo.services.CricInfoService;

/**
 * Created by eict on 11/29/17.
 */

public class Common {

    private static CricInfoService cricInfoService = null;

    public static CricInfoService getService(){

        if (cricInfoService == null)
            cricInfoService = CricInfoClient.getClient().create(CricInfoService.class);

        return cricInfoService;
    }
}
