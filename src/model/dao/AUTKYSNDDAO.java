/**
 * 
 */
package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.AUTKYSND;

/**
 * AUTKYSNDDAO.java
 *
 * Version 1.1
 *
 * Date: 18-05-2017
 *
 * Copyright
 *
 * Modification Logs: 
 * DATE 			AUTHOR		 	DESCRIPTION
 * -----------------------------------------------------------------------
 * 22-05-2017 		DuyenTB 		Create
 */
public class AUTKYSNDDAO {
	DataAccess da = new DataAccess();
	Connection connection = null;
	Statement stmt = null;
	PreparedStatement preparedStatementInsert = null;
	CallableStatement cs = null;
	private int seq = 0;
	private int isExist1 = 0;
	private int isExist2 = 0;

	/**
	 * Method add a list object AUTKYSND into database
	 * 
	 * @param listAUTKYSND
	 * @return true || false
	 * @throws Exception
	 */
	public boolean addListAUTKYSND(ArrayList<AUTKYSND> listAUTKYSND) throws Exception {

		String sql = "INSERT INTO AUTKYSND(kYSND_SBET, kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_SEQ, kYSND_MKKG, kYSND_TYPE, "
				+ " kYSND_SYK_FORM, kYSND_SYK_BHNO1, kYSND_SYK_FIL, kYSND_SYK_BHNO2, kYSND_SYK_SYMD, kYSND_SYK_CHNO, kYSND_SYK_SKCD, kYSND_SYK_SZSU, "
				+ " kYSND_SYK_BHME, kYSND_SYK_SYCD, kYSND_SYK_SPBN,kYSND_SKJ_SYMD) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			connection = da.getConnect();
			connection.setAutoCommit(false);
			preparedStatementInsert = connection.prepareStatement(sql);
			int size = listAUTKYSND.size();
			for (int i = 0; i < size; i++) {
				preparedStatementInsert.setString(1, listAUTKYSND.get(i).getkYSND_SBET());
				preparedStatementInsert.setString(2, listAUTKYSND.get(i).getkYSND_DEPO());
				preparedStatementInsert.setString(3, listAUTKYSND.get(i).getkYSND_MKCD());
				preparedStatementInsert.setString(4, listAUTKYSND.get(i).getkYSND_SSCD());
				preparedStatementInsert.setInt(5, Integer.parseInt(listAUTKYSND.get(i).getkYSND_SEQ()));
				preparedStatementInsert.setString(6, listAUTKYSND.get(i).getkYSND_MKKG());
				preparedStatementInsert.setString(7, listAUTKYSND.get(i).getkYSND_TYPE());
				preparedStatementInsert.setString(8, listAUTKYSND.get(i).getkYSND_FORM());
				preparedStatementInsert.setString(9, listAUTKYSND.get(i).getkYSND_BHNO1());
				preparedStatementInsert.setString(10, listAUTKYSND.get(i).getkYSND_FIL());
				preparedStatementInsert.setString(11, listAUTKYSND.get(i).getkYSND_BHNO2());
				preparedStatementInsert.setString(12, listAUTKYSND.get(i).getkYSND_SYMD());
				preparedStatementInsert.setString(13, listAUTKYSND.get(i).getkYSND_CHNO());
				preparedStatementInsert.setString(14, listAUTKYSND.get(i).getkYSND_SKCD());
				preparedStatementInsert.setInt(15, Integer.parseInt(listAUTKYSND.get(i).getkYSND_SZSU()));
				preparedStatementInsert.setString(16, listAUTKYSND.get(i).getkYSND_BHME());
				preparedStatementInsert.setString(17, listAUTKYSND.get(i).getkYSND_SYCD());
				preparedStatementInsert.setString(18, listAUTKYSND.get(i).getkYSND_SPBN());
				preparedStatementInsert.setString(19, "");
				preparedStatementInsert.executeUpdate();
			}
			connection.commit();
			return true;
		} catch (Exception e) {
			connection.rollback();
			return false;
		} finally {
			try {
				if (preparedStatementInsert != null) {
					preparedStatementInsert.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new SQLException("Error occur: " + e.getMessage());
			}
		}
	}

	/**
	 * Method get value kYSND_SEQ
	 * 
	 * @return true || false
	 * @throws Exception
	 */
	public int getKYSND_SEQ() throws Exception {
		connection = da.getConnect();
		ResultSet rs = null;
		String sql = "Select KYSND_SBET,KYSND_DEPO,KYSND_MKCD,KYSND_SSCD,Max(KYSND_SEQ) as SEQ "
				+ " From AUTKYSND Group by KYSND_SBET,KYSND_DEPO,KYSND_MKCD,KYSND_SSCD ";
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				this.seq = rs.getInt("SEQ") + 1;
			}
		} catch (Exception e) {
			throw new Exception("Error occur: " + e.getMessage());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new SQLException("Error occur: " + e.getMessage());
			}
		}
		return seq;
	}

	/**
	 * Method check kYSND_DEPO is exist in database
	 * 
	 * @param kYSND_DEPO
	 * @return true || false
	 * @throws Exception
	 */
	public boolean isKYSND_DEPO_Exist(String kYSND_DEPO) throws Exception {
		connection = da.getConnect();
		String sql = String.format("SELECT count(kYSND_DEPO) as num FROM AUTKYSND WHERE kYSND_DEPO = N'%s'",
				kYSND_DEPO);
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				isExist1 = rs.getInt("num");
			}
		} catch (Exception e) {
			throw new Exception("Error occur: " + e.getMessage());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new SQLException("Error occur: " + e.getMessage());
			}
		}

		return (isExist1 != 0);
	}

	/**
	 * Method check mandory primary key (kYSND_DEPO,kYSND_MKCD,kYSND_SSCD)
	 * 
	 * @param kYSND_DEPO
	 * @param kYSND_MKCD
	 * @param kYSND_SSCD
	 * @return true || false
	 * @throws Exception
	 */
	public boolean checkInputData_Exist(String kYSND_DEPO, String kYSND_MKCD, String kYSND_SSCD) throws Exception {
		connection = da.getConnect();
		String sql = String.format("SELECT KYSND_DEPO,KYSND_MKCD,KYSND_SSCD, count(*) as num " + " FROM AUTKYSND "
				+ " WHERE kYSND_DEPO = N'%s' AND kYSND_MKCD = N'%s' AND kYSND_SSCD = N'%s' "
				+ " GROUP BY KYSND_DEPO,KYSND_MKCD,KYSND_SSCD ", kYSND_DEPO, kYSND_MKCD, kYSND_SSCD);
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				isExist2 = rs.getInt("num");
			}
		} catch (Exception e) {
			throw new Exception("Error occur: " + e.getMessage());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new SQLException("Error occur: " + e.getMessage());
			}
		}

		return (isExist2 != 0);
	}
}
