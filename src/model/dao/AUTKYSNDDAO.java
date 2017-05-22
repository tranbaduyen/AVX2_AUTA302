/**
 * 
 */
package model.dao;

import java.sql.CallableStatement;
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
	CallableStatement cs = null;
	private int seq = 0;
	private int num = 0;

	public boolean addAUTKYSND(AUTKYSND autKYSND) throws Exception {
		connection = da.getConnect();
		ResultSet rs = null;
		String sql = String.format(
				"INSERT INTO AUTKYSND(kYSND_SBET, kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_SEQ, kYSND_MKKG, kYSND_TYPE, "
						+ " kYSND_SYK_FORM, kYSND_SYK_BHNO1, kYSND_SYK_FIL, kYSND_SYK_BHNO2, kYSND_SYK_SYMD, kYSND_SYK_CHNO, kYSND_SYK_SKCD, kYSND_SYK_SZSU, "
						+ " kYSND_SYK_BHME, kYSND_SYK_SYCD, kYSND_SYK_SPBN,kYSND_SKJ_SYMD) " + " VALUES ('%s','%s','%s','%s',%s,'%s','%s','%s','%s','%s','%s','%s','%s','%s',%s,'%s','%s','%s','')",
				autKYSND.getkYSND_SBET(), autKYSND.getkYSND_DEPO(), autKYSND.getkYSND_MKCD(), autKYSND.getkYSND_SSCD(),
				Integer.parseInt(autKYSND.getkYSND_SEQ()), autKYSND.getkYSND_MKKG(), autKYSND.getkYSND_TYPE(), autKYSND.getkYSND_FORM(),
				autKYSND.getkYSND_BHNO1(), autKYSND.getkYSND_FIL(), autKYSND.getkYSND_BHNO2(), autKYSND.getkYSND_SYMD(),
				autKYSND.getkYSND_CHNO(), autKYSND.getkYSND_SKCD(), Integer.parseInt(autKYSND.getkYSND_SZSU()), autKYSND.getkYSND_BHME(),
				autKYSND.getkYSND_SYCD(), autKYSND.getkYSND_SPBN());
		System.out.println(sql);
		
		try {
			stmt = connection.createStatement();
			stmt.executeUpdate(sql);
//			cs = connection.prepareCall("{call addAUTKYSND(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
//			cs.setString(1, autKYSND.getkYSND_SBET());
//			cs.setString(2, autKYSND.getkYSND_DEPO());
//			cs.setString(3, autKYSND.getkYSND_MKCD());
//			cs.setString(4, autKYSND.getkYSND_SSCD());
//			cs.setInt(5, Integer.parseInt(autKYSND.getkYSND_SEQ()));
//			cs.setString(6, autKYSND.getkYSND_MKKG());
//			cs.setString(7, autKYSND.getkYSND_TYPE());
//			cs.setString(8, autKYSND.getkYSND_FORM());
//			cs.setString(9, autKYSND.getkYSND_BHNO1());
//			cs.setString(10, autKYSND.getkYSND_FIL());
//			cs.setString(11, autKYSND.getkYSND_BHNO2());
//			cs.setString(12, autKYSND.getkYSND_SYMD());
//			cs.setString(13, autKYSND.getkYSND_CHNO());
//			cs.setString(14, autKYSND.getkYSND_SKCD());
//			cs.setInt(15, Integer.parseInt(autKYSND.getkYSND_SZSU()));
//			cs.setString(16, autKYSND.getkYSND_BHME());
//			cs.setString(17, autKYSND.getkYSND_SYCD());
//			cs.setString(18, autKYSND.getkYSND_SPBN());
//			cs.setString(19, "");
//			cs.addBatch();
//			
//			cs.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			//throw new Exception("Error occur: " + e.getMessage());
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (cs != null)
					cs.close();
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
		String sql = "Select KYSND_SBET,KYSND_DEPO,KYSND_MKCD,KYSND_SSCD,Max(KYSND_SEQ) as SEQ "
				+ " From AUTKYSND Group by KYSND_SBET,KYSND_DEPO,KYSND_MKCD,KYSND_SSCD ";
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next())
				this.seq = rs.getInt("SEQ")+1;
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
	
	public boolean isKYSND_DEPO_Exist(String kYSND_DEPO) throws Exception {
		connection = da.getConnect();
		String sql = String.format("SELECT count(kYSND_DEPO) as num FROM AUTKYSND WHERE kYSND_DEPO = N'%s'", kYSND_DEPO);
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				num = rs.getInt("num");
			}
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
		
		return (num != 0)? true : false;
	}
	
	public boolean checkInputData_Exist( String kYSND_DEPO,String kYSND_MKCD,String kYSND_SSCD) throws Exception {
		connection = da.getConnect();
		String sql = String.format("SELECT KYSND_DEPO,KYSND_MKCD,KYSND_SSCD, count(*) as num "
				+ " FROM AUTKYSND "
				+ " WHERE kYSND_DEPO = N'%s' AND kYSND_MKCD = N'%s' AND kYSND_SSCD = N'%s' "
				+ " GROUP BY KYSND_DEPO,KYSND_MKCD,KYSND_SSCD ", kYSND_DEPO, kYSND_MKCD, kYSND_SSCD);
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				num = rs.getInt("num");
			}
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
		
		return (num != 0)? true : false;
	}
}
