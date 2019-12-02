package com.example.demo;

import ezvcard.VCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class HTML {

    private static URL url;
    private static BufferedReader in;

    public static VCard generate(String name){
        String g = "https://adm.edu.p.lodz.pl/user/users.php?search=" + name;
        try {
            url = new URL(g);
            in = new BufferedReader(
                    new InputStreamReader(url.openStream(), "UTF-8"));

        } catch (MalformedURLException e) {
                e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new VCard();
    }
}
