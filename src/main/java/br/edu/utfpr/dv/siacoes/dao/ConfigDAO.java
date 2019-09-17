package br.edu.utfpr.dv.siacoes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ConfigDAO<T> {
    public final T findByDepartment(int idDepartment) throws SQLException {
        return null;
    }

    public final int save(int idUser, T config) throws SQLException{
        return 1;
    }

    protected final T loadObject(ResultSet rs) throws SQLException{
        return null;
    }

}
