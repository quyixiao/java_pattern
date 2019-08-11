package com.pattern.config;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("type quit to quit ");
        do {
            System.out.println("Property item to read");
            String line = reader.readLine();
            if(line.equals("quit")){
                break;
            }
            System.out.println(ConfigManager.getInstance().getConfigItem(line ,"not found"));

        }while (true);

    }
}
