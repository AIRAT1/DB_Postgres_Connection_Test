package de;

import java.sql.*;

public class Program {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String user = "root";
        String password = "root";
        String url = "jdbc:postgresql://localhost:5432/fix_users";
        String query = "SELECT * FROM fix_user";
//        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("password"));
        }
    }
}
