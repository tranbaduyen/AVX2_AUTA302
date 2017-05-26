/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.bean.AUTKYSND;
import model.dao.AUTKYSNDDAO;

/**
 * AUTKYSNDDAOTest.java
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
public class AUTKYSNDDAOTest {
	
	
	protected AUTKYSNDDAO autKYSNDDAO;
	
	
	protected AUTKYSND autKYSNDExpected;
	protected AUTKYSND autKYSNDActual01;
	protected AUTKYSND autKYSNDActual02;
	
    protected ArrayList<AUTKYSND> listAUTKYSNDExpect;
    protected ArrayList<AUTKYSND> listAUTKYSNDActual01;
    protected ArrayList<AUTKYSND> listAUTKYSNDActual02;
    
    protected int testExpect01GetKYSND_SEQ;
    protected int testExpect02GetKYSND_SEQ;
    protected int testExpect03GetKYSND_SEQ;
    protected int testActual01GetKYSND_SEQ;
    protected int testActual02GetKYSND_SEQ;
    protected int testActual03GetKYSND_SEQ;
    
    protected boolean testExpect01IsKYSND_DEPO_Exist;
    protected boolean testExpect02IsKYSND_DEPO_Exist;
    protected boolean testExpect03IsKYSND_DEPO_Exist;
    protected boolean testExpect04IsKYSND_DEPO_Exist;
    protected boolean testActual01IsKYSND_DEPO_Exist;
    protected boolean testActual02IsKYSND_DEPO_Exist;
    protected boolean testActual03IsKYSND_DEPO_Exist;
    protected boolean testActual04IsKYSND_DEPO_Exist;
    
    protected boolean testExpect01CheckInputData_Exist;
    protected boolean testExpect02CheckInputData_Exist;
    protected boolean testExpect03CheckInputData_Exist;
    protected boolean testExpect04CheckInputData_Exist;
    protected boolean testActual01CheckInputData_Exist;
    protected boolean testActual02CheckInputData_Exist;
    protected boolean testActual03CheckInputData_Exist;
    protected boolean testActual04CheckInputData_Exist;
    
    protected boolean testActual01AddListAUTKYSND;
    protected boolean testActual02AddListAUTKYSND;

    
    protected AUTKYSND autKYSND01;
    protected AUTKYSND autKYSND02;
    
    protected String kYSND_SBET01;
    protected String kYSND_DEPO01;
	protected String kYSND_MKCD01;
	protected String kYSND_SSCD01;
	protected String kYSND_SEQ01;
	protected String kYSND_MKKG01;
	protected String kYSND_TYPE01;
	protected String kYSND_FORM01;
	protected String kYSND_BHNO101;
	protected String kYSND_FIL01;
	protected String kYSND_BHNO201;
	protected String kYSND_SYMD01;
	protected String kYSND_CHNO01;
	protected String kYSND_SKCD01;
	protected String kYSND_SZSU01;
	protected String kYSND_BHME01;
	protected String kYSND_SYCD01;
	protected String kYSND_SPBN01;
	
	protected String kYSND_SBET02;
    protected String kYSND_DEPO02;
	protected String kYSND_MKCD02;
	protected String kYSND_SSCD02;
	protected String kYSND_SEQ02;
	protected String kYSND_MKKG02;
	protected String kYSND_TYPE02;
	protected String kYSND_FORM02;
	protected String kYSND_BHNO102;
	protected String kYSND_FIL02;
	protected String kYSND_BHNO202;
	protected String kYSND_SYMD02;
	protected String kYSND_CHNO02;
	protected String kYSND_SKCD02;
	protected String kYSND_SZSU02;
	protected String kYSND_BHME02;
	protected String kYSND_SYCD02;
	protected String kYSND_SPBN02;
	
	protected String kYSND_SBET03;
    protected String kYSND_DEPO03;
	protected String kYSND_MKCD03;
	protected String kYSND_SSCD03;
	protected String kYSND_SEQ03;
	protected String kYSND_MKKG03;
	protected String kYSND_TYPE03;
	protected String kYSND_FORM03;
	protected String kYSND_BHNO103;
	protected String kYSND_FIL03;
	protected String kYSND_BHNO203;
	protected String kYSND_SYMD03;
	protected String kYSND_CHNO03;
	protected String kYSND_SKCD03;
	protected String kYSND_SZSU03;
	protected String kYSND_BHME03;
	protected String kYSND_SYCD03;
	protected String kYSND_SPBN03;

    
    protected boolean resultDeleteActual;
    protected boolean resultUpdateActual;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		autKYSNDDAO = new AUTKYSNDDAO();
		
		testExpect01GetKYSND_SEQ = 0;
		testActual01GetKYSND_SEQ = autKYSNDDAO.getKYSND_SEQ();
		
		testExpect02GetKYSND_SEQ = 1;
		testActual02GetKYSND_SEQ = autKYSNDDAO.getKYSND_SEQ();
		
		testExpect03GetKYSND_SEQ = 2;
		testActual03GetKYSND_SEQ = autKYSNDDAO.getKYSND_SEQ();
		
		/////////////////////////////////////////////////////////////////////////		
		
		// check KYSND_DEPO = 'a1' chua co trong db
		testExpect01IsKYSND_DEPO_Exist = true;
		testActual01IsKYSND_DEPO_Exist = autKYSNDDAO.isKYSND_DEPO_Exist("a1");
		
		// check KYSND_DEPO khac 'a1'
		testExpect02IsKYSND_DEPO_Exist = false;
		testActual02IsKYSND_DEPO_Exist = autKYSNDDAO.isKYSND_DEPO_Exist("a2");
		
		// check KYSND_DEPO= ""
		testExpect03IsKYSND_DEPO_Exist = false;
		testActual03IsKYSND_DEPO_Exist = autKYSNDDAO.isKYSND_DEPO_Exist("");
		
		// check KYSND_DEPO = null
		testExpect04IsKYSND_DEPO_Exist = false;
		testActual04IsKYSND_DEPO_Exist = autKYSNDDAO.isKYSND_DEPO_Exist(null);
		
		/////////////////////////////////////////////////////////////////////////
		
		// check KYSND_DEPO = 'a1', KYSND_MKCD = '01', KYSND_SSCD = '1' chua co trong db
		testExpect01CheckInputData_Exist = false;
		testActual01IsKYSND_DEPO_Exist = autKYSNDDAO.checkInputData_Exist("a1","01","1");
		
		// check KYSND_DEPO = 'a1', KYSND_MKCD = '02', KYSND_SSCD = '2' da co trong db
		testExpect02CheckInputData_Exist = true;
		testActual02CheckInputData_Exist = autKYSNDDAO.checkInputData_Exist("a1","02","2");
		
		// check KYSND_DEPO = '', KYSND_MKCD = '', KYSND_SSCD = ''
		testExpect03CheckInputData_Exist = false;
		testActual03CheckInputData_Exist = autKYSNDDAO.checkInputData_Exist("","","");
		
		// check KYSND_DEPO = null, KYSND_MKCD = null, KYSND_SSCD = null
		testExpect04CheckInputData_Exist = false;
		testActual04CheckInputData_Exist = autKYSNDDAO.checkInputData_Exist(null,null,null);
		
		/////////////////////////////////////////////////////////////////////////////////////

		kYSND_SBET01 = "A";
		kYSND_DEPO01 = "a1";
		kYSND_MKCD01 = "02";
		kYSND_SSCD01 = "2";
		kYSND_SEQ01 = "1";
		kYSND_MKKG01 = "S";
		kYSND_TYPE01 = "1";
		kYSND_FORM01 = "bcnvb";
		kYSND_BHNO101 = "12345678912345";
		kYSND_FIL01 = "6";
		kYSND_BHNO201 = "789123";
		kYSND_SYMD01 = "20170525";
		kYSND_CHNO01 = "情報";
		kYSND_SKCD01 = "12";
		kYSND_SZSU01 = "12548";
		kYSND_BHME01 = "出荷指示 送信情報";
		kYSND_SYCD01 = "1";
		kYSND_SPBN01 = "kk";
		
		kYSND_SBET02 = "A";
		kYSND_DEPO02 = "a2";
		kYSND_MKCD02 = "01";
		kYSND_SSCD02 = "1";
		kYSND_SEQ02 = "1";
		kYSND_MKKG02 = "H";
		kYSND_TYPE02 = "1";
		kYSND_FORM02 = "bcnvb";
		kYSND_BHNO102 = "12345678912345";
		kYSND_FIL02 = "6";
		kYSND_BHNO202 = "789123";
		kYSND_SYMD02 = "20170525";
		kYSND_CHNO02 = "情報";
		kYSND_SKCD02 = "12";
		kYSND_SZSU02 = "12548";
		kYSND_BHME02 = "出荷指示 送信情報";
		kYSND_SYCD02 = "1";
		kYSND_SPBN02 = "kk";
		
		kYSND_SBET03 = "A";
		kYSND_DEPO03 = "a4";
		kYSND_MKCD03 = "02";
		kYSND_SSCD03 = "3";
		kYSND_SEQ03 = "1";
		kYSND_MKKG03 = "H";
		kYSND_TYPE03 = "1";
		kYSND_FORM03 = "bcnvb";
		kYSND_BHNO103 = "12345678912345";
		kYSND_FIL03 = "6";
		kYSND_BHNO203 = "789123";
		kYSND_SYMD03 = "20170525";
		kYSND_CHNO03 = "情報";
		kYSND_SKCD03 = "12";
		kYSND_SZSU03 = "12548";
		kYSND_BHME03 = "出荷指示 送信情報";
		kYSND_SYCD03 = "1";
		kYSND_SPBN03 = "kk";
		
		listAUTKYSNDActual01 = new ArrayList<AUTKYSND>();
		listAUTKYSNDActual01.add(new AUTKYSND(kYSND_SBET01, kYSND_DEPO01, kYSND_MKCD01, kYSND_SSCD01, kYSND_SEQ01, kYSND_MKKG01, kYSND_TYPE01, kYSND_FORM01, kYSND_BHNO101, kYSND_FIL01, kYSND_BHNO201, kYSND_SYMD01, kYSND_CHNO01, kYSND_SKCD01, kYSND_SZSU01, kYSND_BHME01, kYSND_SYCD01, kYSND_SPBN01));
		listAUTKYSNDActual01.add(new AUTKYSND(kYSND_SBET02, kYSND_DEPO02, kYSND_MKCD02, kYSND_SSCD02, kYSND_SEQ02, kYSND_MKKG02, kYSND_TYPE02, kYSND_FORM02, kYSND_BHNO102, kYSND_FIL02, kYSND_BHNO202, kYSND_SYMD02, kYSND_CHNO02, kYSND_SKCD02, kYSND_SZSU02, kYSND_BHME02, kYSND_SYCD02, kYSND_SPBN02));
		testActual01AddListAUTKYSND = autKYSNDDAO.addListAUTKYSND(listAUTKYSNDActual01);
		
		listAUTKYSNDActual02 = new ArrayList<AUTKYSND>();
		listAUTKYSNDActual02.add(new AUTKYSND(kYSND_SBET02, kYSND_DEPO02, kYSND_MKCD02, kYSND_SSCD02, kYSND_SEQ02, kYSND_MKKG02, kYSND_TYPE02, kYSND_FORM02, kYSND_BHNO102, kYSND_FIL02, kYSND_BHNO202, kYSND_SYMD02, kYSND_CHNO02, kYSND_SKCD02, kYSND_SZSU02, kYSND_BHME02, kYSND_SYCD02, kYSND_SPBN02));
		listAUTKYSNDActual02.add(new AUTKYSND(kYSND_SBET03, kYSND_DEPO03, kYSND_MKCD03, kYSND_SSCD03, kYSND_SEQ03, kYSND_MKKG03, kYSND_TYPE03, kYSND_FORM03, kYSND_BHNO103, kYSND_FIL03, kYSND_BHNO203, kYSND_SYMD03, kYSND_CHNO03, kYSND_SKCD03, kYSND_SZSU03, kYSND_BHME03, kYSND_SYCD03, kYSND_SPBN03));
		testActual02AddListAUTKYSND = autKYSNDDAO.addListAUTKYSND(listAUTKYSNDActual02);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
    public void testAddListKYSND(){
        assertEquals(false, testActual01AddListAUTKYSND);
        assertEquals(true, testActual02AddListAUTKYSND);
    }
	
	/**
	* 
	*/
	@Test
	public void testGetKYSND_SEQ() {
		assertEquals(testExpect01GetKYSND_SEQ, testActual01GetKYSND_SEQ);
		assertEquals(testExpect02GetKYSND_SEQ, testActual02GetKYSND_SEQ);
		assertEquals(testExpect03GetKYSND_SEQ, testActual03GetKYSND_SEQ);
	}

	/**
	* 
	*/
	@Test
	public void testCheckInputData_Exist() {
		assertEquals(testExpect01CheckInputData_Exist, testActual01CheckInputData_Exist);
		assertEquals(testExpect02CheckInputData_Exist, testActual02CheckInputData_Exist);
		assertEquals(testExpect03CheckInputData_Exist, testActual03CheckInputData_Exist);
		assertEquals(testExpect04CheckInputData_Exist, testActual04CheckInputData_Exist);
	}
	
	/**
	* 
	*/
	@Test
	public void testIsKYSND_DEPO_Exist() {
		assertEquals(testExpect01IsKYSND_DEPO_Exist, testActual01IsKYSND_DEPO_Exist);
		assertEquals(testExpect02IsKYSND_DEPO_Exist, testActual02IsKYSND_DEPO_Exist);
		assertEquals(testExpect03IsKYSND_DEPO_Exist, testActual03IsKYSND_DEPO_Exist);
		assertEquals(testExpect04IsKYSND_DEPO_Exist, testActual04IsKYSND_DEPO_Exist);
	}

}
