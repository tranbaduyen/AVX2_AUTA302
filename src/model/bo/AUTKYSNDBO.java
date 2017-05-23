/**
 * 
 */
package model.bo;

import model.bean.AUTKYSND;
import model.dao.AUTKYSNDDAO;

/**
 * @author HCD-Fresher204
 *
 */
public class AUTKYSNDBO {
	AUTKYSNDDAO autKYSNDDAO = new AUTKYSNDDAO();

	/**
	 * @param autKYSND
	 * @return
	 * @throws Exception
	 */
	public boolean addAUTKYSND(AUTKYSND autKYSND) throws Exception {
		return autKYSNDDAO.addAUTKYSND(autKYSND);
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public int getKYSND_SEQ() throws Exception {
		return autKYSNDDAO.getKYSND_SEQ();
	}

	/**
	 * @param kYSND_DEPO
	 * @return
	 * @throws Exception
	 */
	public boolean isKYSND_DEPO_Exist(String kYSND_DEPO) throws Exception {
		return autKYSNDDAO.isKYSND_DEPO_Exist(kYSND_DEPO);
	}

	/**
	 * @param kYSND_DEPO
	 * @param kYSND_MKCD
	 * @param kYSND_SSCD
	 * @return
	 * @throws Exception
	 */
	public boolean checkInputData_Exist(String kYSND_DEPO, String kYSND_MKCD, String kYSND_SSCD) throws Exception {
		return autKYSNDDAO.checkInputData_Exist(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD);
	}
	
	/**
	 * @param kYSND_DEPO
	 * @param kYSND_MKCD
	 * @param kYSND_SSCD
	 * @throws Exception
	 */
	public void deleteAUTKYSND(String kYSND_DEPO, String kYSND_MKCD, String kYSND_SSCD) throws Exception{
		autKYSNDDAO.deleteAUTKYSND(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD);
	}
}
