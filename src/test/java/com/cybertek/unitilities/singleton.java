package com.cybertek.unitilities;

public class singleton {
    private static String str;

    public static String getStr() {
        if(str ==null){
            System.out.println("adding value");
            str = "abcdefg";
        }
        return str;

    }
}
