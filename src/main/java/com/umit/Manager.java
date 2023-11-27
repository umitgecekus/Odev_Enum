package com.umit;

import com.umit.enums.Corbalar;
import com.umit.enums.Icecekler;
import com.umit.enums.Tatlilar;
import com.umit.enums.Yemekler;

import java.awt.*;
import java.util.Random;

public class Manager {
    public static Menu gunlukMenu(){
        Random random=new Random();
        Corbalar corba = Corbalar.values()[random.nextInt(Corbalar.values().length)];
        Yemekler yemek = Yemekler.values()[random.nextInt(Yemekler.values().length)];
        Icecekler icecek= Icecekler.values()[random.nextInt(Icecekler.values().length)];
        Tatlilar tatli = Tatlilar.values()[random.nextInt(Tatlilar.values().length)];

        return new Menu(corba,icecek,tatli,yemek);
    }
}
