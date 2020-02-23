package com.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author tjy
 * @Date 2020/2/5 17:43
 */

public class DateUtils {
    public static String datetoString(Date date, String patt){
        SimpleDateFormat sdf=new SimpleDateFormat(patt);
        String format=sdf.format(date);
        return format;
    }
    public static Date String(String str,String patt) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(patt);
        Date parse=sdf.parse(str);
        return parse;
    }
}
