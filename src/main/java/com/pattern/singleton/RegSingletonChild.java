package com.pattern.singleton;

public class RegSingletonChild extends RegSingleton {



    public RegSingletonChild(){

    }



    static public RegSingletonChild getInstance(){

        return (RegSingletonChild)RegSingleton.getInstance("com.pattern.singleton.RegSingletonChild");
    }



    public String about(){

        return "Hello ,i am RegSingletonChild";
    }


    public static void main(String[] args) {
        RegSingletonChild child =  getInstance();

        System.out.println(child.about());

        RegSingleton regSingleton =  getInstance("com.pattern.singleton.RegSingleton");

        RegSingleton regSingleton1 =  getInstance("com.pattern.singleton.RegSingleton");

        System.out.println(regSingleton == regSingleton1);

        System.out.println(regSingleton.about());


    }




}
