package eu.unareil.dal.jdbc;

import eu.unareil.bo.Stylo;
import eu.unareil.dal.DALException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestStyloJdbcImpl {
    public static void main(String[] args) throws DALException, SQLException {
        Connection connection = jdbcTools.getConnection();
        Stylo stylo = new Stylo(115454, "Stylo bic", "Bic", 10.0f, 100, "rouge", "Bille");
        StyloJdbcImpl styloJdbcImpl = new StyloJdbcImpl();
        styloJdbcImpl.insert(stylo);
        jdbcTools.closeConnection(connection);
    }
}
