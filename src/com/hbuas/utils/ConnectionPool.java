package com.hbuas.utils;

/**
 * Created by zss on 2015/12/13.
 * 数据库连接池
 */
import java.sql.*;
import javax.naming.Context;
import javax.sql.DataSource;
import javax.naming.InitialContext;
public class ConnectionPool {
    private static ConnectionPool pool = null;
    private static DataSource dataSource = null;
    private ConnectionPool() {
        try {
            Context ic = new InitialContext();
            dataSource = (DataSource)ic.lookup("java:/comp/env/jdbc/WeiXinDB");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static ConnectionPool getInstance(){
        if (pool == null){
            pool = new ConnectionPool();
        }
        return pool;
    }
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        }
    }
    public void freeConnection(Connection c)
    {
        try
        {
            c.close();
        }
        catch (SQLException sqle)
        {
            sqle.printStackTrace();
        }
    }
}