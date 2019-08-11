package com.pattern.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigManager {


    // 属性文件命名
    private static final String PFILE = System.getProperty("user.dir") + File.separator + "Singleton.properties";

    // 对应属性文件的文件对象变量
    private File m_file = null;

    // 属性文件的最后修改日期
    private long m_lastModifiedTime = 0;

    // 属性文件所对应的属性对象变量
    private Properties m_props = null;

    // 本类可能存在一个惟一的一个实例
    private static ConfigManager m_instance = new ConfigManager();


    private ConfigManager() {
        m_file = new File(PFILE);
        m_lastModifiedTime = m_file.lastModified();
        if (m_lastModifiedTime == 0) {
            System.out.println(PFILE + " file does not exits ");
        }
        m_props = new Properties();
        try {
            m_props.load(new FileInputStream(PFILE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 私有的构造子，用以保证外界无法直接实例化
    synchronized public static ConfigManager getInstance(){

        return m_instance;
    }


    final public Object getConfigItem(String name,Object defalut){
        long newTime = m_file.lastModified();
        //检查属性文件是否被其他的程序
        // （多数情况下是程序员手动）修改过
        // 如果是，重新重新读取此文件
        if(newTime == 0) {
            // 属性文件不存在
            if (m_lastModifiedTime == 0) {
                System.out.println(PFILE + "file does not exits ");
            } else {
                System.out.println(PFILE + " file was delete ");
            }
            return defalut;
        } else if (newTime > m_lastModifiedTime){
            m_props.clear();
            try {
                m_props.load(new FileInputStream(PFILE));
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
        m_lastModifiedTime = newTime;
        Object val = m_props.getProperty(name);
        if(val == null){
            return defalut;
        }else {
            return val;
        }

    }


}
