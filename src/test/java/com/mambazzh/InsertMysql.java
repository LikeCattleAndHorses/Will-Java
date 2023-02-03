package com.mambazzh;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InsertMysql {
    private static final String url = "jdbc:mysql://mambamysql.mysql.rds.aliyuncs.com:3306/mamba?characterEncoding=utf8&useSSL=true&rewriteBatchedStatements=true";
//    private static final String url = "jdbc:mysql://localhost:3306/mamba?characterEncoding=utf8&useSSL=true&rewriteBatchedStatements=true";
    private static final String user = "root";
    private static final String password = "root123_";
    private static final String driver = "com.mysql.jdbc.Driver";

    private static final String CARD_NUMB_PREFIX = "62";
    private static final String ACCOUNT_NUMB_PREFIX = "10";
    private static final String CUST_NUMB_PREFIX = "32";

    public static void main(String[] args) {
//        method1();
//        method2();
        method3();
    }

    /**
     * 普通插入方式
     */
    public static void method1() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO cac values(?,?,?)";
            ps = (PreparedStatement) conn.prepareStatement(sql);
            Long startTime = System.currentTimeMillis();
            for (int i = 1; i <= 100000; i++) {
                ps.setString(1, CARD_NUMB_PREFIX + i);
                ps.setString(2, ACCOUNT_NUMB_PREFIX + i);
                ps.setString(3, CUST_NUMB_PREFIX + i);
                ps.executeUpdate();
            }
            Long endTime = System.currentTimeMillis();
            System.out.println("用时：" + (endTime - startTime) / 1000 + " 秒");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * 普通插入方式 + 事务提交
     * <p>
     * 设置conn.setAutoCommit(false);
     * 最后在所有命令执行完之后再提交事务conn.commit();
     */
    public static void method2() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO cac values(?,?,?)";
            ps = (PreparedStatement) conn.prepareStatement(sql);
            Long startTime = System.currentTimeMillis();
            conn.setAutoCommit(false);
            for (int i = 1; i <= 100000; i++) {
                ps.setString(1, CARD_NUMB_PREFIX + i);
                ps.setString(2, ACCOUNT_NUMB_PREFIX + i);
                ps.setString(3, CUST_NUMB_PREFIX + i);
                ps.executeUpdate();
            }
            conn.commit();
            Long endTime = System.currentTimeMillis();
            System.out.println("用时：" + (endTime - startTime) / 1000 + " 秒");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * 事务提交+批量操作
     * <p>
     * 注意更改url = “jdbc:mysql://localhost:3306/test01?rewriteBatchedStatements=true”;
     * pstm.addBatch();代替ps.executeUpdate();
     * 最后批量操作ps.executeBatch();
     */
    public static void method3() {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO cac values(?,?,?)";
            ps = (PreparedStatement) conn.prepareStatement(sql);
            Long startTime = System.currentTimeMillis();
            conn.setAutoCommit(false);

            Map<Integer, Integer> map = new HashMap<>();
            map.put(10000001,11000000);
//            map.put(11000001,12000000);
//            map.put(12000001,13000000);
//            map.put(13000001,14000000);
//            map.put(14000001,15000000);
//            map.put(15000001,16000000);
//            map.put(16000001,17000000);
//            map.put(17000001,18000000);
//            map.put(18000001,19000000);
//            map.put(19000001,20000000);
//
//            map.put(20000001,21000000);
//            map.put(21000001,22000000);
//            map.put(22000001,23000000);
//            map.put(23000001,24000000);
//            map.put(24000001,25000000);
//            map.put(25000001,26000000);
//            map.put(26000001,27000000);
//            map.put(27000001,28000000);
//            map.put(28000001,29000000);
//            map.put(29000001,30000000);

//            map.put(30000001,31000000);
//            map.put(31000001,32000000);
//            map.put(32000001,33000000);
//            map.put(33000001,34000000);
//            map.put(34000001,35000000);
//            map.put(35000001,36000000);
//            map.put(36000001,37000000);
//            map.put(37000001,38000000);
//            map.put(38000001,39000000);
//            map.put(39000001,40000000);

            Set<Integer> set = map.keySet();
            for (Integer key : set) {
                for (int i = key; i <= map.get(key); i++) {
                    ps.setString(1, CARD_NUMB_PREFIX + i);
                    ps.setString(2, ACCOUNT_NUMB_PREFIX + i);
                    ps.setString(3, CUST_NUMB_PREFIX + i);
                    ps.addBatch();
                }
                ps.executeBatch();
                conn.commit();
                Long endTime = System.currentTimeMillis();
                System.out.println("用时：" + (endTime - startTime) / 1000 + " 秒");
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
