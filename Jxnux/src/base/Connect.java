package base;

import java.sql.*;

public class Connect {
    private Statement stmt;
    private Connection conn;
    ResultSet rs;

    public Connect() {
        stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456");
           // System.out.println("连接数据库成功");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            //System.out.println("连接数据库失败");
        }
        rs = null;
    }

    public ResultSet executeQuery(String sql) {
        try {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("Data.executeQuery:" + e.getMessage());
        }
        return rs;
    }

    public int executeUpdate(String sql) {
        int t = 0;
        try {
            stmt = conn.createStatement();
            t = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Data.executeUpdate:" + e.getMessage());
        }
        return t;
    }

    public void closeStmt() {
        try {
            stmt.close();

        } catch (SQLException e) {
            System.err.println("Data.executeQuery:" + e.getMessage());
        }

    }

    public void closeConn() {
        try {

            conn.close();
        } catch (SQLException e) {
            System.err.println("Data.executeQuery:" + e.getMessage());
        }
    }
}
