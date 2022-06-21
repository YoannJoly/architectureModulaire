package eu.unareil.dal;

import eu.unareil.dal.DALException;

public interface DAO<T> {
    void insert(T obj) throws DALException;
}
