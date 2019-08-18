package com.pattern.resource;

import org.apache.ibatis.scripting.LanguageDriverRegistry;
import org.apache.xmlbeans.impl.store.Locale;

import javax.security.auth.callback.LanguageCallback;
import java.util.HashMap;
import java.util.ResourceBundle;

public class LingualResource {

    private String language = "en";

    private String region = "US";

    private String localeCode = "en_US";

    private static final String FILE_NAME = "res";

    private static HashMap instances = new HashMap();

    private Locale locale = null;

    private ResourceBundle resourceBundle = null;

    private LingualResource lingualResource;

    // 私有的构造子保证外界无法直接将此类实例化
    private LingualResource (String language,String region){
       this.localeCode = language;
       this.region = region;

    }


    private LingualResource(){

    }


    public String getLocaleString(String code){

        return resourceBundle.getString(code);
    }

    private static String makeLocaleCode(String language,String region){
        return language + "_" + region;
    }



}
