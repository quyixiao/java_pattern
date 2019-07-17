package com.pattern.client;

import com.pattern.client.impl.SysbaseQueryRunner;

import java.sql.ResultSet;

public class Client {


    public static void main(String[] args) throws Exception{
        QueryRunner runner = new SysbaseQueryRunner();
        ResultSet rs = runner.run();
    }
}
