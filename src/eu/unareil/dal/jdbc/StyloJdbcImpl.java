package eu.unareil.dal.jdbc;

import eu.unareil.bo.Stylo;
import eu.unareil.dal.DALException;
import eu.unareil.dal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StyloJdbcImpl implements DAO<Stylo> {
    private static final String SQL_INSERT = "INSERT INTO produit (refProd, libelle, marque, prixUnitaire, qteStock,  couleur, typeMine) VALUES (?, ?, ?, ?, ?, ?, ?)";


    @Override
    public void insert(final Stylo obj) throws DALException {
        try (Connection connection = jdbcTools.getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(SQL_INSERT)) {
                statement.setInt(1, obj.getRefProd());
                statement.setString(2, obj.getLibelle());
                statement.setString(3, obj.getMarque());
                statement.setDouble(4, obj.getPrixUnitaire());
                statement.setInt(5, obj.getQteStock());
                statement.setString(6, obj.getCouleur());
                statement.setString(7, obj.getTypeMine());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DALException("Insert failed", e.getCause());
        }

    }
}

