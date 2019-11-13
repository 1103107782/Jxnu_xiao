package database;

import java.sql.*;


public class DatabaseCon {

    private Connection connection = null;
    private Statement statement= null;
    private ResultSet resultSet = null;
    public DatabaseCon(){
        String usrName = "root";
        String password = "123456";
        String url = "jdbc:mysql://localHost:3306/school";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,usrName,password);
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ResultSet executeQuery(String sql){
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return resultSet;
    }
    public int executeUpdate(String sql){
        int rs = 0;
        try {
            statement = connection.createStatement();
            rs = statement.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void closeStatement(){
        try {
            statement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
