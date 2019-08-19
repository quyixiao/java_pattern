package com.pattern.key;

public class KeyGenerator {


    private static KeyGenerator keygen = new KeyGenerator();

    private KeyGenerator() {

    }


    public static KeyGenerator getInstance() {

        return keygen;
    }

    public synchronized int getNextKey() {

        return getNextKeyFromDB();
    }

    private int getNextKeyFromDB() {
        String sql = "update keyTable set keyValue = keyValue + 1";
        String sql2 = "SELECT keyValue from keyTable";

        return 1000;
    }

}
