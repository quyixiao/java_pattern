package com.pattern.singleton;

import java.util.HashMap;

public class RegSingleton {


    private static HashMap m_registry = new HashMap();


    static {
        RegSingleton x = new RegSingleton();
        m_registry.put(x.getClass().getName(), x);
    }

    protected RegSingleton() {

    }

    static public RegSingleton getInstance(String name) {
        if (name == null) {
            name = "com.pattern.singleton.RegSingleton";
        }
        try {
            if (m_registry.get(name) == null) {
                m_registry.put(name, Class.forName(name).newInstance());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (RegSingleton) (m_registry.get(name));
    }


    public String about() {
        return "hello ,i am RegSingleton";
    }


}
