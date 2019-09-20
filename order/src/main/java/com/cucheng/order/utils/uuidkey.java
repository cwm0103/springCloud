package com.cucheng.order.utils;


import java.util.Random;

public class uuidkey {

    public static String getKey()
    {
        Random random=new Random();
        Integer number= random.nextInt(900000)+100000;
        return System.currentTimeMillis()+number.toString();
    }
}
