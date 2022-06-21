package eu.unareil.dal.jdbc;

import com.mysql.cj.jdbc.Driver;
import eu.unareil.dal.DALException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTools {
    private static final String URL = Settings.getProperty("url");
    private static final String USER = Settings.getProperty("user");
    private static final String PASSWORD = Settings.getProperty("password");
    private static final String DB_NAME = Settings.getProperty("dbName");


    public static Connection getConnection() throws DALException, SQLException {
        DriverManager.registerDriver(new Driver());
        try {
            return DriverManager.getConnection(URL + DB_NAME, USER, PASSWORD);
        } catch (SQLException e) {
            throw new DALException("Connection failed", e.getCause());
        }
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

}
