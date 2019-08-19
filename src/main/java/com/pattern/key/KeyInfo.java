package com.pattern.key;

public class KeyInfo {
    private int keyMax ;
    private int keyMin;
    private int nextKey ;
    private int poolSize ;

    private String keyName;


    public KeyInfo(int poolSize,String keyName){
        this.poolSize = poolSize;
        this.keyName = keyName;

        retrieveFromDB();
    }


    public KeyInfo(int poolSize){
        this.poolSize = poolSize;

    }



    public int getKeyMax(){
        return keyMax;
    }

    public int getKeyMin(){
        return keyMin;
    }

    public int getNextKey(){
        if(nextKey > keyMax){
            retrieveFromDB();
        }
        return nextKey ++;
    }
    private void retrieveFromDB(){
        String sql1 = "update keyTable set keyValue " + poolSize + " where keyName= 'PO_NUMBER'";

    }
}
