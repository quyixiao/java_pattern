package com.pattern.client.impl;

import com.pattern.client.QueryRunner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SysbaseQueryRunner extends QueryRunner {
    @Override
    protected Connection createConnection() {
        return null;
    }

    @Override
    protected String createSql() {
        return "select * from lsd_user";
    }

    @Override
    protected ResultSet runSql(Connection conn, String sql) throws Exception {
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(sql);
    }
}
