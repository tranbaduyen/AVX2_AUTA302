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
 * @author HCD-Fresher204
 *
 */
public class AddNewAUTKYSNDAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		AUTKYSNDForm autKYSNDForm = (AUTKYSNDForm) form;	
		//
		AUTMFOPMBO autMFOPMBO = new AUTMFOPMBO();
		ArrayList<AUTMFOPM> listAUTMFOPM = autMFOPMBO.getListAUTMFOPM();
		autKYSNDForm.setListAUTMFOPM(listAUTMFOPM);

		AUTKYSNDBO autKYSNDBO = new AUTKYSNDBO();
		AUTKYSND autKYSND = null;
		boolean isSuccess = true;
		int i = 1;
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
		if("Save".equals(autKYSNDForm.getSubmit())) {
			ActionErrors actionErrors = new ActionErrors();
			
			autKYSNDForm.setErrorFirst(0);
			int j = 1;
			while (j < 11 ) {
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
				if(!ValidateData.isBlankRecord(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_FORM, kYSND_BHNO2, kYSND_SYMD, kYSND_CHNO, kYSND_SKCD, kYSND_SZSU, kYSND_BHME, kYSND_SYCD, kYSND_SPBN)) {
					
					//check kYSND_DEPO not input
					if (ValidateData.isEmpty(kYSND_DEPO)) {
						actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo.trong"));
						autKYSNDForm.setErrorFirst(1+j*10);
					}
					
					//check kYSND_DEPO is exist in database
					if (autKYSNDBO.isKYSND_DEPO_Exist(kYSND_DEPO) && !autKYSNDBO.checkInputData_Exist(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD)) {
						actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo.trung"));
						autKYSNDForm.setErrorFirst(1+j*10);
					}
					
					//check (kYSND_DEPO,kYSND_SSCD,kYSND_SSCD) is exist in database
					if (autKYSNDBO.checkInputData_Exist(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD)) {
						actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo_mkcd_sscd.trung"));
						autKYSNDForm.setErrorFirst(1+j*10);
					}
					
					//check kYSND_DEPO use special characters 
					if (ValidateData.isSpecialCharacters(kYSND_DEPO)) {
						actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo.kituDB"));
						autKYSNDForm.setErrorFirst(1+j*10);
					}
					
					//check kYSND_MKCD not choose
					if (ValidateData.isEmpty(kYSND_MKCD)) {
						actionErrors.add("kYSND_MKCDError", new ActionMessage("error.mkcd.trong"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(2+j*10);
						}
					}
					
					//check kYSND_SSCD not input
					if (ValidateData.isEmpty(kYSND_SSCD)) {
						actionErrors.add("kYSND_SSCDError", new ActionMessage("error.sscd.trong"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(3+j*10);
						}
					}
					
					//check kYSND_SSCD use special characters 
					if (ValidateData.isSpecialCharacters(kYSND_SSCD)) {
						actionErrors.add("kYSND_SSCDError", new ActionMessage("error.sscd.kituDB"));
						if (autKYSNDForm.getErrorFirst() == 0) {
							autKYSNDForm.setErrorFirst(3+j*10);
						}
					}
					
					saveErrors(request, actionErrors);
					if (actionErrors.size() > 0) {
						return mapping.findForward("addError");
					}
					j++;
				}
				
			}	
		}
		// Execute Add new Room when click 'Save' in Create New Room page
		if ("Save".equals(autKYSNDForm.getSubmit())) {
			while (i < 11 && isSuccess == true) {
				
				autKYSND = new AUTKYSND();
				kYSND_BHNO = autKYSNDForm.getArrKYSND_BHNO(i);
				System.out.println("kYSND_BHNOAction:" + kYSND_BHNO);
				
				kYSND_TYPE = "1";
				kYSND_DEPO = autKYSNDForm.getArrKYSND_DEPO(i);
				System.out.println("kYSND_DEPO:" + kYSND_DEPO);
				kYSND_SYCD = autKYSNDForm.getArrKYSND_SYCD(i);
				System.out.println("kYSND_SYCD:" + kYSND_SYCD);
				kYSND_SSCD = autKYSNDForm.getArrKYSND_SSCD(i);
				System.out.println("kYSND_SSCD:" + kYSND_SSCD);
				kYSND_SBET = "A";
				kYSND_FORM = autKYSNDForm.getArrKYSND_FORM(i);
				System.out.println("kYSND_FORM:" + kYSND_FORM);
				kYSND_MKKG = "";
				kYSND_MKCD = autKYSNDForm.getArrKYSND_MKCD(i);
				System.out.println("kYSND_MKCD:" + kYSND_MKCD);
				kYSND_SYMD = autKYSNDForm.getArrKYSND_SYMD(i);
				System.out.println("kYSND_SYMD:" + kYSND_SYMD);
				kYSND_BHME = autKYSNDForm.getArrKYSND_BHME(i);
				System.out.println("kYSND_BHME:" + kYSND_BHME);
				kYSND_SPBN = autKYSNDForm.getArrKYSND_SPBN(i);
				System.out.println("kYSND_SPBN:" + kYSND_SPBN);
				kYSND_SZSU = autKYSNDForm.getArrKYSND_SZSU(i);
				System.out.println("kYSND_SZSU:" + kYSND_SZSU);
				kYSND_CHNO = autKYSNDForm.getArrKYSND_CHNO(i);
				System.out.println("kYSND_CHNO:" + kYSND_CHNO);
				kYSND_SKCD = autKYSNDForm.getArrKYSND_SKCD(i);
				System.out.println("kYSND_SKCD:" + kYSND_SKCD);
				System.out
						.println(ValidateData.isBlankRecord(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_FORM, kYSND_BHNO,
								kYSND_SYMD, kYSND_CHNO, kYSND_SKCD, kYSND_SZSU, kYSND_BHME, kYSND_SYCD, kYSND_SPBN));
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
					if (kYSND_SYMD != null) {
						autKYSND.setkYSND_SYMD(kYSND_SYMD);
					} else
						autKYSND.setkYSND_SYMD("0");
					autKYSND.setkYSND_SKCD(kYSND_SKCD);

					autKYSND.setkYSND_SPBN(kYSND_SPBN);
					if (kYSND_SZSU != null || "".equals(kYSND_SZSU) == false) {
						autKYSND.setkYSND_SZSU(kYSND_SZSU);
					} else
						autKYSND.setkYSND_SZSU("0");
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
					
					try {

						// Validate OK -> execute addRoom() method
						if (autKYSNDBO.addAUTKYSND(autKYSND))
							isSuccess = true;
						else
							isSuccess = false;
						
					} catch (Exception e) {
						e.printStackTrace();
						// Exeption throw -> redirect to Error page
						return mapping.findForward("error");
					}
					
				}
				i++;
				// if(isSuccess)
				
				// else
				// return mapping.findForward("error");
			}
			return mapping.findForward("addNewSuccess");
		} else {
			autKYSNDForm.setErrorFirst(0);
			
			// redirect to Create New Room page
			return mapping.findForward("addNew");
		}
	}
}
