package com.nsv.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) throws ParseException {


        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate);

        Date parsedDate = simpleDateFormat.parse(formattedDate);
        System.out.println(parsedDate);


    }
}
