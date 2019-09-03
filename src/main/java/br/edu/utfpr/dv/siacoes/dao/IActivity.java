package br.edu.utfpr.dv.siacoes.dao;

import java.sql.SQLException;
import java.util.List;

public interface IActivity {
    public List listAll() throws SQLException;
}
