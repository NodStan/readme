package com.example.gui;

import java.util.Locale;

public class anything {
    public static void main(String[] args) {
        String name = "gideon";
        String firstletter = String.valueOf(name.charAt(0));
        String rem = name.substring(1,name.length()).toLowerCase();
        System.out.println(firstletter.toUpperCase()+rem);
    }
}
