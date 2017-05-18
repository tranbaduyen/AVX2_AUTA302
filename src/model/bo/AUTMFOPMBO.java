/**
 * 
 */
package model.bo;

import java.util.ArrayList;

import model.bean.AUTMFOPM;
import model.dao.AUTMFOPMDAO;

/**
 * @author HCD-Fresher204
 *
 */
public class AUTMFOPMBO {
	AUTMFOPMDAO autMFOPMDAO = new AUTMFOPMDAO();
	
	public ArrayList<AUTMFOPM> getListAUTMFOPM() throws Exception {
		return autMFOPMDAO.getListAUTMFOPM();
	}
}
