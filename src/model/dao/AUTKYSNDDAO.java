/**
 * 
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.AUTKYSND;

/**
 * @author HCD-Fresher204
 *
 */
public class AUTKYSNDDAO {
	DataAccess da = new DataAccess();
	Connection connection = null;
	Statement stmt = null;
	private int seq = 0;

	public boolean addAUTKYSND(AUTKYSND autKYSND) throws Exception {
		connection = da.getConnect();
		ResultSet rs = null;
		String sql = String.format(
				"INSERT INTO ROOM(kYSND_SBET, kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_SEQ, kYSND_MKKG, kYSND_TYPE, "
						+ " kYSND_FORM, kYSND_BHNO1, kYSND_FIL, kYSND_BHNO2, kYSND_SYMD, kYSND_CHNO, kYSND_SKCD, kYSND_SZSU, "
						+ " kYSND_BHME, kYSND_SYCD, kYSND_SPBN) " + " VALUES ( N'%s',%s,N'%s',%s,%s,%s )",
				autKYSND.getkYSND_SBET(), autKYSND.getkYSND_DEPO(), autKYSND.getkYSND_MKCD(), autKYSND.getkYSND_SSCD(),
				autKYSND.getkYSND_SEQ(), autKYSND.getkYSND_MKKG(), autKYSND.getkYSND_TYPE(), autKYSND.getkYSND_FORM(),
				autKYSND.getkYSND_BHNO1(), autKYSND.getkYSND_FIL(), autKYSND.getkYSND_BHNO2(), autKYSND.getkYSND_SYMD(),
				autKYSND.getkYSND_CHNO(), autKYSND.getkYSND_SKCD(), Integer.parseInt(autKYSND.getkYSND_SZSU()), autKYSND.getkYSND_BHME(),
				autKYSND.getkYSND_SYCD(), autKYSND.getkYSND_SPBN());
		try {
			stmt = connection.createStatement();
			stmt.executeUpdate(sql);
			return true;
		} catch (Exception e) {
			throw new Exception("Error occur: " + e.getMessage());
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				throw new SQLException("Error occur: " + e.getMessage());
			}
		}
	}
	
	public int getKYSND_SEQ() throws Exception{
		connection = da.getConnect();
		ResultSet rs = null;
		String sql = "SELECT KYSND_SBET,(MAX(KYSND_SEQ) AS SEQ FROM AUTKYSND Group by (KYSND_SBET)";
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next())
				this.seq = rs.getInt("SEQ");
		} catch (Exception e) {
			throw new Exception("Error occur: " + e.getMessage());
		} finally {
			try{
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				throw new SQLException("Error occur: " + e.getMessage());
			}
		}
		return seq;
	}
}
