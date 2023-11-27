package com.umit;

import com.umit.enums.Corbalar;
import com.umit.enums.Icecekler;
import com.umit.enums.Tatlilar;
import com.umit.enums.Yemekler;

public class Menu {
    private Corbalar corba;
    private Icecekler icecek;
    private Tatlilar tatli;
    private Yemekler yemek;
    public Menu(Corbalar corba, Icecekler icecek, Tatlilar tatli, Yemekler yemek) {
        this.corba = corba;
        this.yemek = yemek;
        this.icecek = icecek;
        this.tatli = tatli;

    }
    @Override
    public String toString() {
        return "Menu{" +
                "corba=" + corba +
                ", yemek=" + yemek +
                ", icecek=" + icecek +
                ", tatli=" + tatli +

                '}';
    }
}
