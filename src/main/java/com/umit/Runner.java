package com.umit;

import com.umit.enums.Gunler;

import static com.umit.Manager.gunlukMenu;

public class Runner {
    public static void main(String[] args) {
        for (Gunler gun:Gunler.values()) {
            System.out.println(gun+" gunu: ");
            System.out.println(gunlukMenu());
            System.out.println("-------------------------------------");
        }

    }
}
