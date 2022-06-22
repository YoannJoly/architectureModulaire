package eu.unareil.dal.jdbc;

import eu.unareil.bo.Auteur;
import eu.unareil.bo.CartePostale;
import eu.unareil.bo.TypeCartePostale;
import eu.unareil.dal.DALException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCartePostaleJDBCImpl {
    static List<Auteur> list = new ArrayList<Auteur>(Arrays.asList(new Auteur("Doe", "John"), new Auteur("Dote", "Jane")));

    public static void main(String[] args) throws DALException, SQLException {
        Connection connection = jdbcTools.getConnection();
        CartePostale cartePostal = new CartePostale("Carte Verte", "Prioritaire", 23, 3, list, TypeCartePostale.Paysage);
        CartePostaleJdbcImpl cartePostaleJdbcImpl = new CartePostaleJdbcImpl();
        AuteurJdbcImpl auteurJdbcImpl = new AuteurJdbcImpl();
        cartePostaleJdbcImpl.insert(cartePostal);
        for (Auteur auteur : list) {
            auteurJdbcImpl.insert(auteur);
        }
        jdbcTools.closeConnection(connection);

    }
}


