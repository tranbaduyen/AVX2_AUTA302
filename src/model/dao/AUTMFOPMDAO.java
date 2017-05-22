/**
 * 
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.AUTMFOPM;

/**
 * @author HCD-Fresher204
 *
 */
public class AUTMFOPMDAO {
	DataAccess da = new DataAccess();
	Connection connection = null;
	Statement stmt = null;
	
	public ArrayList<AUTMFOPM> getListAUTMFOPM() throws Exception{
		String sql = "SELECT MFOPM_TRCD, MFOPM_RYAK, MFOPM_NAME "
				+ "FROM AUTMFOPM ";
		ArrayList<AUTMFOPM> list = null;
		list = new ArrayList<AUTMFOPM>();
		AUTMFOPM autMFOPM = null;
		ResultSet rs = null;
		try {
			connection = da.getConnect();
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			list = new ArrayList<AUTMFOPM>();
			autMFOPM = new AUTMFOPM();
			while (rs.next()) {
				autMFOPM = new AUTMFOPM();
				autMFOPM.setmFOPM_MKCD(rs.getString("MFOPM_TRCD"));
				autMFOPM.setmFOPM_RYAK(rs.getString("MFOPM_RYAK"));
				autMFOPM.setmFOPM_NAME(rs.getString("MFOPM_NAME"));
				list.add(autMFOPM);
			}
			rs.close();
		} catch (Exception e) {
			throw new Exception("Error occur: "+ e.getMessage());
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				throw new SQLException("Error occur: "+ e.getMessage());
			}
		}
		return list;
	}
	

}
