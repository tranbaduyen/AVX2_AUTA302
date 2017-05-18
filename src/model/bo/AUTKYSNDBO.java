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
	
	public boolean addRoom(AUTKYSND autKYSND) throws Exception {
		return autKYSNDDAO.addAUTKYSND(autKYSND);
	}
	
	public int getKYSND_SEQ() throws Exception{
		return autKYSNDDAO.getKYSND_SEQ();
	}
}
