package br.edu.utfpr.dv.siacoes.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.utfpr.dv.siacoes.model.SigacConfig;

public class SigacConfigDAO extends ConfigDAO {

	protected SigacConfig loadObject(ResultSet rs) throws SQLException{
		SigacConfig config = new SigacConfig();
		
		config.getDepartment().setIdDepartment(rs.getInt("idDepartment"));
		config.setMinimumScore(rs.getDouble("minimumScore"));
		config.setMaxFileSize(rs.getInt("maxfilesize"));
		
		return config;
	}

    protected String getFindByDepartmentSelectStatement(){
	    return "SELECT * FROM sigacconfig WHERE idDepartment = ?";
    }
    protected String getSaveInsertStatement(){
	    return "INSERT INTO sigacconfig(minimumScore, maxfilesize, idDepartment) VALUES(?, ?, ?)";
    }
    protected String getSaveUpdateStatement(){
	    return "UPDATE sigacconfig SET minimumScore=?, maxfilesize=? WHERE idDepartment=?";
    }

    protected void setSaveStatementParams(PreparedStatement stmt, Object config) throws SQLException {
        stmt.setDouble(1, config.getMinimumScore());
        stmt.setInt(2, config.getMaxFileSize());
        stmt.setInt(3, config.getDepartment().getIdDepartment());
    }

}
