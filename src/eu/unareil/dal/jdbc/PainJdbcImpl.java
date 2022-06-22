package eu.unareil.dal.jdbc;

import eu.unareil.bo.Pain;
import eu.unareil.dal.DALException;
import eu.unareil.dal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PainJdbcImpl implements DAO<Pain> {

    private static final String SQL_INSERT = "INSERT INTO produit (refProd, libelle, marque, prixUnitaire, qteStock,  poids) VALUES (?, ?, ?, ?, ?, ?)";

    @Override
    public void insert(final Pain obj) throws DALException {
        try (Connection connection = jdbcTools.getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(SQL_INSERT)) {
                statement.setInt(1, obj.getRefProd());
                statement.setString(2, obj.getLibelle());
                statement.setString(3, obj.getMarque());
                statement.setDouble(4, obj.getPrixUnitaire());
                statement.setInt(5, obj.getQteStock());
                statement.setInt(6, obj.getPoids());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DALException("Insert failed", e.getCause());
        }

    }
}
