package com.pattern.multiton;

import org.apache.poi.ss.formula.functions.Vlookup;
import sun.security.util.AuthResources_it;

import java.util.Date;
import java.util.Random;


public class Die {

    private static Die die1 = new Die();
    private static Die die2 = new Die();

    private Die() {

    }

    public static Die getInstance(int whichOne) {
        if (whichOne == 1) {
            return die1;
        } else {
            return die2;
        }
    }

    public  synchronized int dice() {
        Date d = new Date();
        Random random = new Random(d.getTime());
        int value = random.nextInt();
        value = Math.abs(value);
        System.out.println("============value====================="+ value);
        value = value % 6;
        System.out.println("+++++++++++++++value----------------"+value);
        value += 1;
        return value;
    }


}
