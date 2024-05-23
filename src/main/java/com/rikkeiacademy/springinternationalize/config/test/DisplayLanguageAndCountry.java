package com.rikkeiacademy.springinternationalize.config.test;

import java.util.Locale;

public class DisplayLanguageAndCountry {
    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (Locale locale : availableLocales){
            System.out.println(locale.getDisplayCountry()+" : "+locale.getLanguage()+"_"+locale.getCountry());
        }
    }
}
