package eu.unareil.dal.jdbc;

import eu.unareil.bo.Pain;
import eu.unareil.dal.DALException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestPainJdbcImpl {
    public static void main(String[] args) throws DALException, SQLException {
        Connection connection = jdbcTools.getConnection();
        Pain pain = new Pain("Boulangerie Paul", "Baguette", 360, 400, 2);
        PainJdbcImpl painJdbcImpl = new PainJdbcImpl();
        painJdbcImpl.insert(pain);
        jdbcTools.closeConnection(connection);

    }
}

