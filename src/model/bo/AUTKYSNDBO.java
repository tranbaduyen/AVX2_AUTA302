/**
 * 
 */
package model.bo;

import model.bean.AUTKYSND;
import model.dao.AUTKYSNDDAO;

/**
 * AUTKYSNDBO.java
 *
 * Version 1.0
 *
 * Date: 18-05-2017
 *
 * Copyright
 *
 * Modification Logs: 
 * DATE 			AUTHOR		 	DESCRIPTION
 * -----------------------------------------------------------------------
 * 18-05-2017 		DuyenTB 		Create
 */
public class AUTKYSNDBO {
	AUTKYSNDDAO autKYSNDDAO = new AUTKYSNDDAO();

	/**
	 * Method add a object AUTKYSND into database (add 1 lan 1 doi tuong thay vi add 1 list doi tuong)
	 * 
	 * @param autKYSND
	 * @return true || false
	 * @throws Exception
	 */
	public boolean addAUTKYSND(AUTKYSND autKYSND) throws Exception {
		return autKYSNDDAO.addAUTKYSND(autKYSND);
	}

	/**
	 * Method get value kYSND_SEQ
	 * 
	 * @return autKYSNDDAO.getKYSND_SEQ()
	 * @throws Exception
	 */
	public int getKYSND_SEQ() throws Exception {
		return autKYSNDDAO.getKYSND_SEQ();
	}

	/**
	 * Method check kYSND_DEPO is exist in database
	 * 
	 * @param kYSND_DEPO
	 * @return true || false
	 * @throws Exception
	 */
	public boolean isKYSND_DEPO_Exist(String kYSND_DEPO) throws Exception {
		return autKYSNDDAO.isKYSND_DEPO_Exist(kYSND_DEPO);
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
		return autKYSNDDAO.checkInputData_Exist(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD);
	}
	
	/**
	 * Method delete a record in database
	 * 
	 * @param kYSND_DEPO
	 * @param kYSND_MKCD
	 * @param kYSND_SSCD
	 * @throws Exception
	 */
	public void deleteAUTKYSND(String kYSND_DEPO, String kYSND_MKCD, String kYSND_SSCD) throws Exception{
		autKYSNDDAO.deleteAUTKYSND(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD);
	}
}
