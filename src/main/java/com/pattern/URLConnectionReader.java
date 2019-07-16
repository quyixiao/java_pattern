package com.pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

    // 可以看出
    // 1.创建一个以http://www.baidu.com为目标URL对象
    // 2.调用URL对象openConnection()方法，得到一个http://www.baidu.com的远程连接对象，这个对象的类型就是URLConnection
    // 3.客户端调用URLConnection对象getInputStream()方法读入远程URL的数据
    // 这个系统在运行时会打印http://www.baidu.com主页全部HTML源代码
    public static void main(String[] args)  throws Exception{
        URL yahoo = new URL("http://www.baidu.com");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine())!=null){
            System.out.println(inputLine);
        }
        in.close();


    }
}
