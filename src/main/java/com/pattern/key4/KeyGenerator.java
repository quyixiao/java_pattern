package com.pattern.key4;

import com.pattern.key.KeyInfo;

import java.util.HashMap;


//在上面给出的方案中，第四个和
public class KeyGenerator {

    private static HashMap kengens = new HashMap(10);
    private static final int POOL_SIZE = 20;
    private KeyInfo keyInfo ;



    private KeyGenerator(){

    }

    private KeyGenerator(String keyName){
        keyInfo = new KeyInfo(POOL_SIZE,keyName);

    }

    public static synchronized  KeyGenerator getInstance(String keyName){
        KeyGenerator keyGen ;
        if(kengens.containsKey(keyName)){
            keyGen = (KeyGenerator)kengens.get(keyName);

        }else{
            keyGen = new KeyGenerator(keyName);
        }

        return keyGen;
    }

    public synchronized int getNextKey(){
        return keyInfo.getNextKey();
    }

}
