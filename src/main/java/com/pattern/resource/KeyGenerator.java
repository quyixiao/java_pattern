package com.pattern.resource;

import com.auth0.jwt.internal.org.bouncycastle.jcajce.provider.symmetric.AES;

import java.nio.file.FileSystemNotFoundException;

public class KeyGenerator {


    private static KeyGenerator keygen = new KeyGenerator();

    private int key = 1000;

    // 私有构造子，保证外界无法直接实例化
    private KeyGenerator(){

    }





    public static KeyGenerator getInstance(){
        return keygen;
    }

    public synchronized int getNextKey(){
        return key ++ ;
    }


    private static KeyGenerator keyGenerator;

    public static void main(String[] args) {
        keyGenerator = keyGenerator.getInstance();

        System.out.println("key="+keyGenerator.getNextKey());
        System.out.println("key="+keyGenerator.getNextKey());
        System.out.println("key="+keyGenerator.getNextKey());
        System.out.println("key="+keyGenerator.getNextKey());


    }


}
