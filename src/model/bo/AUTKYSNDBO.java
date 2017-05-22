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

	public boolean addAUTKYSND(AUTKYSND autKYSND) throws Exception {
		return autKYSNDDAO.addAUTKYSND(autKYSND);
	}

	public int getKYSND_SEQ() throws Exception {
		return autKYSNDDAO.getKYSND_SEQ();
	}

	public boolean isKYSND_DEPO_Exist(String kYSND_DEPO) throws Exception {
		return autKYSNDDAO.isKYSND_DEPO_Exist(kYSND_DEPO);
	}

	public boolean checkInputData_Exist(String kYSND_DEPO, String kYSND_MKCD, String kYSND_SSCD) throws Exception {
		return autKYSNDDAO.checkInputData_Exist(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD);
	}
}
