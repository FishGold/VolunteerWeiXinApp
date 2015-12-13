package com.hbuas.test;

import com.hbuas.utils.ConnectionPool;

import java.sql.Connection;

/**
 * Created by zss on 2015/12/13.
 * 调试程序
 */
public class DB {
    public DB(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        System.out.println("con success");
        pool.freeConnection(connection);
        System.out.println("close success");
    }
}
