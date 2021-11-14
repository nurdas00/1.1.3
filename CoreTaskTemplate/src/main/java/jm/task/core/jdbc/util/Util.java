package jm.task.core.jdbc.util;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.*;

public class Util {
    String userName = "root";
    String password = "12345678";
    String URL = "jdbc:mysql://localhost:3306/new_schema";

    public Statement connectToSQL() {
        Connection connection;
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, userName, password);

            return connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
