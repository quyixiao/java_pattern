package com.pattern.singleton;


/****
 * 使用单例模式有一个必要的条件，在一个系统要求中一个类只有一个实例时才会应当使用单例模式，反过来，如果一个类可以有几个实例同时存在的时候，
 * 那么就没有必要使用单例类，
 * 但是有经验的读者可能会看到很多的不当的使用单例的模式的例子，可见做到上面的这一点并不容易，下面就是这样的一个情况
 * 问我一个系统需要一些全程的变量，产了单例模式以后，我就可以发现可以使用一个单例类入所有的例程变量，请问
 * 如果一个单例对象可以持有一个int类型的属性，用来给一个系统提供一个数值惟一的序列号码，作为某个贩卖系统的账单号码，用户会看到同一个出现
 * 好几次的
 *
 */
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
