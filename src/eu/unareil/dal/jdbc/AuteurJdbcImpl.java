package eu.unareil.dal.jdbc;

import eu.unareil.bo.Auteur;
import eu.unareil.dal.DALException;
import eu.unareil.dal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuteurJdbcImpl implements DAO<Auteur> {
    private static final String SQL_INSERT = "INSERT INTO auteur (nom, prenom) VALUES (?, ?)";

    @Override
    public void insert(final Auteur obj) throws DALException {
        try (Connection connection = jdbcTools.getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(SQL_INSERT)) {
                statement.setString(1, obj.getNom());
                statement.setString(2, obj.getPrenom());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DALException("Insert failed", e.getCause());
        }


    }
}
