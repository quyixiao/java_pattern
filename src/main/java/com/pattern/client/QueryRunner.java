package com.pattern.client;

import java.sql.Connection;
import java.sql.ResultSet;

public abstract class QueryRunner  {
    public ResultSet run() throws Exception{
        Connection conn = createConnection();
        String sql = createSql();
        return runSql(conn,sql);
    }

    protected abstract Connection createConnection();

    protected abstract String createSql();

    protected abstract ResultSet runSql(Connection conn,String sql) throws Exception;


}
