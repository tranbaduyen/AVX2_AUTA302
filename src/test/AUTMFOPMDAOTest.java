/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.bean.AUTMFOPM;
import model.dao.AUTMFOPMDAO;

/**
 * AUTMFOPMDAOTest.java
 *
 * Version 1.0
 *
 * Date: 25-05-2017
 *
 * Copyright
 *
 * Modification Logs: 
 * DATE 			AUTHOR		 	DESCRIPTION
 * -----------------------------------------------------------------------
 * 25-05-2017 		DuyenTB 		Create
 */
public class AUTMFOPMDAOTest {

	protected AUTMFOPM autMFOPM;
	protected AUTMFOPMDAO autMFOPMDAO;
	protected ArrayList<AUTMFOPM> arrAUTMFOPMExpected;
	protected ArrayList<AUTMFOPM> arrAUTMFOPMActual;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		autMFOPMDAO = new AUTMFOPMDAO();
		arrAUTMFOPMExpected = new ArrayList<AUTMFOPM>();
		arrAUTMFOPMExpected.add(new AUTMFOPM("01", "01-NNNNN"));
		arrAUTMFOPMExpected.add(new AUTMFOPM("02", "02-NNNNN"));
		arrAUTMFOPMExpected.add(new AUTMFOPM("03", "03-NNNNN"));
		arrAUTMFOPMActual = autMFOPMDAO.getListAUTMFOPM();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetListAUTMFOPM() {
		assertEquals(arrAUTMFOPMExpected.get(0).getmFOPM_MKCD(), arrAUTMFOPMActual.get(0).getmFOPM_MKCD().trim());
		assertEquals(arrAUTMFOPMExpected.get(0).getmFOPM_NAME(), arrAUTMFOPMActual.get(0).getmFOPM_NAME().trim());
	
		assertEquals(arrAUTMFOPMExpected.get(1).getmFOPM_MKCD(), arrAUTMFOPMActual.get(1).getmFOPM_MKCD().trim());
		assertEquals(arrAUTMFOPMExpected.get(1).getmFOPM_NAME(), arrAUTMFOPMActual.get(1).getmFOPM_NAME().trim());
	
		assertEquals(arrAUTMFOPMExpected.get(2).getmFOPM_MKCD(), arrAUTMFOPMActual.get(2).getmFOPM_MKCD().trim());
		assertEquals(arrAUTMFOPMExpected.get(2).getmFOPM_NAME(), arrAUTMFOPMActual.get(2).getmFOPM_NAME().trim());
	}
	
	

}
