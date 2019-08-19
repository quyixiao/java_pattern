package com.pattern.key3;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public class KeyGenerator {
    private static KeyGenerator keyGenerator = new KeyGenerator();


    private static final int POOL_SIZE = 20 ;


    private KeyInfo keyInfo;


    private KeyGenerator (){

    }

}


