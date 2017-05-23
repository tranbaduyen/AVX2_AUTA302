/**
 * 
 */
package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.ValidateData;
import form.AUTKYSNDForm;
import model.bean.AUTKYSND;
import model.bean.AUTMFOPM;
import model.bo.AUTKYSNDBO;
import model.bo.AUTMFOPMBO;

/**
 * AddAUTKYSNDAction.java
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
public class AddAUTKYSNDAction extends Action {
	
	/**
	 * Ham chuan hoa chuoi string Method format String
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward addNew || addNewSuccess || addError || error
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		AUTKYSNDForm autKYSNDForm = (AUTKYSNDForm) form;
		
		//get list ArrayList<AUTMFOPM> listAUTMFOPM for select option 
		AUTMFOPMBO autMFOPMBO = new AUTMFOPMBO();
		ArrayList<AUTMFOPM> listAUTMFOPM = autMFOPMBO.getListAUTMFOPM();
		autKYSNDForm.setListAUTMFOPM(listAUTMFOPM);

		AUTKYSNDBO autKYSNDBO = new AUTKYSNDBO();
		
		//Init object AUTKYSND autKYSND
		AUTKYSND autKYSND = null;
		
		ArrayList<AUTKYSND> listAUTKYSND = new ArrayList<AUTKYSND>();
		
		boolean isSuccess = true;
		int i = 1;
		
		//Init attributes of object AUTKYSND autKYSND
		String kYSND_BHNO;
		String kYSND_BHNO1;
		String kYSND_FIL = "";
		String kYSND_BHNO2 = "";
		String kYSND_TYPE = "1";
		String kYSND_DEPO;
		String kYSND_SYCD;
		String kYSND_SSCD;
		String kYSND_SBET = "A";
		String kYSND_FORM;
		String kYSND_MKKG = "";
		String kYSND_MKCD;
		String kYSND_SYMD;
		String kYSND_BHME;
		String kYSND_SPBN;
		String kYSND_SZSU;
		String kYSND_CHNO;
		String kYSND_SKCD;
		System.out.println(autKYSNDForm.getSubmit());
		
		//Method check validate data from Form before insert into database
		if ("登録(Ｎ)".equals(autKYSNDForm.getSubmit())) {
			ActionErrors actionErrors = new ActionErrors();

			autKYSNDForm.setErrorFirst(0);
			int j = 1;
			
			//loop to check validate each record in form (1->10 records)
			while (j < 11) {
				
				//get value from Form
				kYSND_BHNO = autKYSNDForm.getArrKYSND_BHNO(j);
				kYSND_DEPO = autKYSNDForm.getArrKYSND_DEPO(j);
				kYSND_SYCD = autKYSNDForm.getArrKYSND_SYCD(j);
				kYSND_SSCD = autKYSNDForm.getArrKYSND_SSCD(j);
				kYSND_FORM = autKYSNDForm.getArrKYSND_FORM(j);
				kYSND_MKCD = autKYSNDForm.getArrKYSND_MKCD(j);
				kYSND_SYMD = autKYSNDForm.getArrKYSND_SYMD(j);
				kYSND_BHME = autKYSNDForm.getArrKYSND_BHME(j);
				kYSND_SPBN = autKYSNDForm.getArrKYSND_SPBN(j);
				kYSND_SZSU = autKYSNDForm.getArrKYSND_SZSU(j);
				kYSND_CHNO = autKYSNDForm.getArrKYSND_CHNO(j);
				kYSND_SKCD = autKYSNDForm.getArrKYSND_SKCD(j);
				
				//Only check validate when record is not blank
				if (!ValidateData.isBlankRecord(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_FORM, kYSND_BHNO2, kYSND_SYMD,
						kYSND_CHNO, kYSND_SKCD, kYSND_SZSU, kYSND_BHME, kYSND_SYCD, kYSND_SPBN)) {

					// check kYSND_DEPO not input
					if (ValidateData.isEmpty(kYSND_DEPO)) {
						actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo.trong"));
						autKYSNDForm.setErrorFirst(1 + j * 10);
					}
					
					// check kYSND_DEPO use special characters
					if (ValidateData.isSpecialCharacters(kYSND_DEPO)) {
						actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo.kituDB"));
						autKYSNDForm.setErrorFirst(1 + j * 10);
					}

					// check kYSND_DEPO is exist in database
					if (autKYSNDBO.isKYSND_DEPO_Exist(kYSND_DEPO)
							&& !autKYSNDBO.checkInputData_Exist(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD)) {
						actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo.trung"));
						autKYSNDForm.setErrorFirst(1 + j * 10);
					}

					// check (kYSND_DEPO,kYSND_SSCD,kYSND_SSCD) is exist in
					// database
					if (autKYSNDBO.checkInputData_Exist(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD)) {
						actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo_mkcd_sscd.trung"));
						autKYSNDForm.setErrorFirst(1 + j * 10);
					}

					// check kYSND_MKCD not choose
					if (ValidateData.isEmpty(kYSND_MKCD)) {
						actionErrors.add("kYSND_MKCDError", new ActionMessage("error.mkcd.trong"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(2 + j * 10);
						}
					}
					
					// check kYSND_BHNO use special characters
					if (ValidateData.isSpecialCharacters(kYSND_BHNO)) {
						actionErrors.add("kYSND_BHNOError", new ActionMessage("error.bhno.kituDB"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(3 + j * 10);
						}
					}

					// check 15th character kYSND_BHNO use '#' character and kYSND_MKCD = '01'
					if (kYSND_BHNO.length() >= 15 && ValidateData.isInvalidKYSND_BHNO(kYSND_MKCD, kYSND_BHNO)) {
						actionErrors.add("kYSND_BHNOError", new ActionMessage("error.bhno.S3M0033E"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(3 + j * 10);
						}
					}

					// check kYSND_BHME use special characters
					if (ValidateData.isSpecialCharacters(kYSND_BHME)) {
						actionErrors.add("kYSND_BHMEError", new ActionMessage("error.bhme.kituDB"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(4 + j * 10);
						}
					}

					// check kYSND_SSCD not input
					if (ValidateData.isEmpty(kYSND_SSCD)) {
						actionErrors.add("kYSND_SSCDError", new ActionMessage("error.sscd.trong"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(5 + j * 10);
						}
					}

					// check kYSND_SSCD use special characters
					if (ValidateData.isSpecialCharacters(kYSND_SSCD)) {
						actionErrors.add("kYSND_SSCDError", new ActionMessage("error.sscd.kituDB"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(5 + j * 10);
						}
					}

					// check kYSND_FORM use special characters
					if (ValidateData.isSpecialCharacters(kYSND_FORM)) {
						actionErrors.add("kYSND_FORMError", new ActionMessage("error.form.kituDB"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(6 + j * 10);
						}
					}

					// check kYSND_CHNO use special characters
					if (ValidateData.isSpecialCharacters(kYSND_CHNO)) {
						actionErrors.add("kYSND_CHNOError", new ActionMessage("error.chno.kituDB"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(7 + j * 10);
						}
					}

					// check kYSND_SYMD invalid date format (8 numeric characters: yyyyMMdd )
					if (!"".equals(kYSND_SYMD) && ValidateData.isInvalidDateFormat(kYSND_SYMD)) {
						actionErrors.add("kYSND_SYMDError", new ActionMessage("error.symd.dateFormat"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(8 + j * 10);
						}
					}

					// check kYSND_SYMD invalid date value (1900 <= yyyy <= currentYear + 100 ,
					// 1 <= MM <= 12 , 1 <= dd <= 31)
					if (kYSND_SYMD.length() == 8 && ValidateData.isInvalidDateValue(kYSND_SYMD)) {
						actionErrors.add("kYSND_SYMDError", new ActionMessage("error.symd.dateValue"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(8 + j * 10);
						}
					}
					
					// check kYSND_SZSU invalid number format (only [0-9-+])
					if (!"".equals(kYSND_SZSU) && !ValidateData.isAllNumber(kYSND_SZSU)) {
						actionErrors.add("kYSND_SZSUError", new ActionMessage("error.szsu.so"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(9 + j * 10);
						}
					}
					// check kYSND_SZSU max value (-999999 <= kYSND_SZSU <= 999999)
					if(ValidateData.isAllNumber(kYSND_SZSU)) {
						if (Integer.parseInt(kYSND_SZSU) > 999999) {
							actionErrors.add("kYSND_SZSUError", new ActionMessage("error.szsu.maxValue"));
							if (autKYSNDForm.getErrorFirst() == 0) {
								autKYSNDForm.setErrorFirst(9 + j * 10);
							}
						}
					}

					// check kYSND_SKCD use special characters
					if (ValidateData.isSpecialCharacters(kYSND_SKCD)) {
						actionErrors.add("kYSND_SKCDError", new ActionMessage("error.skcd.kituDB"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(10 + j * 10);
						}
					}

					// check kYSND_SPBN use special characters
					if (ValidateData.isSpecialCharacters(kYSND_SPBN)) {
						actionErrors.add("kYSND_SPBNError", new ActionMessage("error.spbn.kituDB"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(13 + j * 100);
						}
					}

					saveErrors(request, actionErrors);
					if (actionErrors.size() > 0) {
						return mapping.findForward("addError");
					}
				}
				j++;
			}
		}
		
		// Execute Add New when click '登録(Ｎ)' in Add New AUTA302 page
		if ("登録(Ｎ)".equals(autKYSNDForm.getSubmit())) {
			while (i < 11 && isSuccess == true) {

				autKYSND = new AUTKYSND();
				kYSND_BHNO = autKYSNDForm.getArrKYSND_BHNO(i);
				kYSND_TYPE = "1";
				kYSND_DEPO = autKYSNDForm.getArrKYSND_DEPO(i);
				kYSND_SYCD = autKYSNDForm.getArrKYSND_SYCD(i);
				kYSND_SSCD = autKYSNDForm.getArrKYSND_SSCD(i);
				kYSND_SBET = "A";
				kYSND_FORM = autKYSNDForm.getArrKYSND_FORM(i);
				kYSND_MKKG = "";
				kYSND_MKCD = autKYSNDForm.getArrKYSND_MKCD(i);
				kYSND_SYMD = autKYSNDForm.getArrKYSND_SYMD(i);
				kYSND_BHME = autKYSNDForm.getArrKYSND_BHME(i);
				kYSND_SPBN = autKYSNDForm.getArrKYSND_SPBN(i);
				kYSND_SZSU = autKYSNDForm.getArrKYSND_SZSU(i);
				kYSND_CHNO = autKYSNDForm.getArrKYSND_CHNO(i);
				kYSND_SKCD = autKYSNDForm.getArrKYSND_SKCD(i);
				
				//Only inserted when record is not blank
				if (!ValidateData.isBlankRecord(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_FORM, kYSND_BHNO, kYSND_SYMD,
						kYSND_CHNO, kYSND_SKCD, kYSND_SZSU, kYSND_BHME, kYSND_SYCD, kYSND_SPBN)) {
					autKYSND.setkYSND_SBET(kYSND_SBET);
					autKYSND.setkYSND_DEPO(kYSND_DEPO);
					autKYSND.setkYSND_SEQ(autKYSNDBO.getKYSND_SEQ() + "");
					
					if (!"0".equals(kYSND_MKCD)) {
						autKYSND.setkYSND_MKCD(kYSND_MKCD);
						switch (kYSND_MKCD) {
						case "01":
							kYSND_MKKG = "H";
							break;
						case "02":
							kYSND_MKKG = "S";
							break;
						case "03":
							kYSND_MKKG = "Y";
							break;
						}
						autKYSND.setkYSND_MKKG(kYSND_MKKG);
					} else {
						autKYSND.setkYSND_MKCD("");
						autKYSND.setkYSND_MKKG("");
					}
					
					autKYSND.setkYSND_TYPE(kYSND_TYPE);
					autKYSND.setkYSND_SYCD(kYSND_SYCD);
					autKYSND.setkYSND_SSCD(kYSND_SSCD);
					autKYSND.setkYSND_FORM(kYSND_FORM);
					autKYSND.setkYSND_BHME(kYSND_BHME);
					autKYSND.setkYSND_CHNO(kYSND_CHNO);
					
					if (kYSND_SYMD != null || !"".equals(kYSND_SYMD)) {
						autKYSND.setkYSND_SYMD(kYSND_SYMD);
					} else {
						autKYSND.setkYSND_SYMD("0");
					}
					autKYSND.setkYSND_SKCD(kYSND_SKCD);

					autKYSND.setkYSND_SPBN(kYSND_SPBN);

					if (kYSND_SZSU == null || "".equals(kYSND_SZSU)) {
						autKYSND.setkYSND_SZSU("0");
					} else {
						autKYSND.setkYSND_SZSU(kYSND_SZSU);
					}
					
					if (kYSND_BHNO != null) {
						if (kYSND_BHNO.length() <= 14) {
							kYSND_BHNO1 = kYSND_BHNO;
							kYSND_FIL = "";
							kYSND_BHNO2 = "";
						} else if (kYSND_BHNO.length() == 15) {
							kYSND_BHNO1 = kYSND_BHNO.substring(0, 14);
							kYSND_FIL = kYSND_BHNO.substring(14, 15);
							kYSND_BHNO2 = "";
						} else {
							kYSND_BHNO1 = kYSND_BHNO.substring(0, 14);
							kYSND_FIL = kYSND_BHNO.substring(14, 15);
							kYSND_BHNO2 = kYSND_BHNO.substring(15, kYSND_BHNO.length());
						}
						autKYSND.setkYSND_BHNO1(kYSND_BHNO1);
						autKYSND.setkYSND_FIL(kYSND_FIL);
						autKYSND.setkYSND_BHNO2(kYSND_BHNO2);
					} else {
						kYSND_BHNO1 = "";
						kYSND_FIL = "";
						kYSND_BHNO2 = "";
						autKYSND.setkYSND_BHNO1(kYSND_BHNO1);
						autKYSND.setkYSND_FIL(kYSND_FIL);
						autKYSND.setkYSND_BHNO2(kYSND_BHNO2);
					}
//					
//					ActionErrors actionErrors = new ActionErrors();
//					try {
//
//						// check (kYSND_DEPO,kYSND_SSCD,kYSND_SSCD) is exist in database
//						if (autKYSNDBO.checkInputData_Exist(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD)) {
//							actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo_mkcd_sscd.trung"));
//							autKYSNDForm.setErrorFirst(1 + i * 10);
//							autKYSNDBO.deleteAUTKYSND(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD);
//						}
//						
//						saveErrors(request, actionErrors);
//						if (actionErrors.size() > 0) {
//							return mapping.findForward("addError");
//						}
//
//						// Validate OK -> execute addAUTKYSND() method
//						if (autKYSNDBO.addAUTKYSND(autKYSND)) {
//							isSuccess = true;
//						} else {
//							isSuccess = false;
//						}
//
//					} catch (Exception e) {
//						e.printStackTrace();
//						
//						// Exeption throw -> redirect to Error page
//						return mapping.findForward("error");
//					}
					listAUTKYSND.add(autKYSND);
				}
				i++;
			}
			try {
				// Validate OK -> execute addAUTKYSND() method
				if (autKYSNDBO.addListAUTKYSND(listAUTKYSND)) {

					// Forward list screen when add success
					return mapping.findForward("addNewSuccess");
				} else {
					ActionErrors actionErrors = new ActionErrors();
					actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo_mkcd_sscd.trung"));
					autKYSNDForm.setErrorFirst(11);
					saveErrors(request, actionErrors);
					return mapping.findForward("addError");
				}

			} catch (Exception e) {
				return mapping.findForward("error");
			}
			
			
		} else {
			autKYSNDForm.setErrorFirst(0);

			// redirect to Add New page
			return mapping.findForward("addNew");
		}
	}
}
