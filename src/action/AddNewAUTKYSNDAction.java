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
		System.out.println("xxx");

		//
		AUTMFOPMBO autMFOPMBO = new AUTMFOPMBO();
		ArrayList<AUTMFOPM> listAUTMFOPM = autMFOPMBO.getListAUTMFOPM();
		autKYSNDForm.setListAUTMFOPM(listAUTMFOPM);

		AUTKYSNDBO autKYSNDBO = new AUTKYSNDBO();
		AUTKYSND autKYSND = null;
		boolean isSuccess = true;
		int i = 1;
//		String[] arrKYSND_SBET = autKYSNDForm.getArrKYSND_SBET();
//		String[] arrKYSND_DEPO = autKYSNDForm.getArrKYSND_DEPO();
//		String[] arrKYSND_MKCD = autKYSNDForm.getArrKYSND_MKCD();
//		String[] arrKYSND_SSCD = autKYSNDForm.getArrKYSND_SSCD();
//		String[] arrKYSND_SEQ = autKYSNDForm.getArrKYSND_SEQ();
//		String[] arrKYSND_MKKG = autKYSNDForm.getArrKYSND_MKKG();
//		String[] arrKYSND_TYPE = autKYSNDForm.getArrKYSND_TYPE();
//		String[] arrKYSND_FORM = autKYSNDForm.getArrKYSND_FORM();
//		String[] arrKYSND_BHNO = autKYSNDForm.getArrKYSND_BHNO();
//		String[] arrKYSND_BHNO1 = autKYSNDForm.getArrKYSND_BHNO1();
//		String[] arrKYSND_FIL = autKYSNDForm.getArrKYSND_FIL();
//		String[] arrKYSND_BHNO2 = autKYSNDForm.getArrKYSND_BHNO2();
//		String[] arrKYSND_SYMD = autKYSNDForm.getArrKYSND_SYMD();
//		String[] arrKYSND_CHNO = autKYSNDForm.getArrKYSND_CHNO();
//		String[] arrKYSND_SKCD = autKYSNDForm.getArrKYSND_SKCD();
//		String[] arrKYSND_SZSU = autKYSNDForm.getArrKYSND_SZSU();
//		String[] arrKYSND_BHME = autKYSNDForm.getArrKYSND_BHME();
//		String[] arrKYSND_SYCD = autKYSNDForm.getArrKYSND_SYCD();
//		String[] arrKYSND_SPBN = autKYSNDForm.getArrKYSND_SPBN();
//		String[] arrKYSND_RYAK = autKYSNDForm.getArrKYSND_RYAK();
//		String[] arrKYSND_NAME = autKYSNDForm.getArrKYSND_NAME();
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
//		if("Save".equals(autKYSNDForm.getSubmit())) {
//			ActionErrors actionErrors = new ActionErrors();
//			
//			autKYSNDForm.setErrorFirst(0);
//			int j = 1;
//			while (j < 3 && isSuccess == true) {
//				kYSND_BHNO = autKYSNDForm.getArrKYSND_BHNO(j+1);
//				kYSND_DEPO = autKYSNDForm.getArrKYSND_DEPO(j+1);
//				kYSND_SYCD = autKYSNDForm.getArrKYSND_SYCD(j+1);
//				kYSND_SSCD = autKYSNDForm.getArrKYSND_SSCD(j+1);
//				kYSND_FORM = autKYSNDForm.getArrKYSND_FORM(j+1);
//				kYSND_MKCD = autKYSNDForm.getArrKYSND_MKCD(j+1);
//				kYSND_SYMD = autKYSNDForm.getArrKYSND_SYMD(j+1);
//				kYSND_BHME = autKYSNDForm.getArrKYSND_BHME(j+1);
//				kYSND_SPBN = autKYSNDForm.getArrKYSND_SPBN(j+1);
//				kYSND_SZSU = autKYSNDForm.getArrKYSND_SZSU(j+1);
//				kYSND_CHNO = autKYSNDForm.getArrKYSND_CHNO(j+1);
//				kYSND_SKCD = autKYSNDForm.getArrKYSND_SKCD(j+1);
//			//check RoomName not input
//				System.out.println("ValidateData.isEmpty(kYSND_DEPO):"+ValidateData.isEmpty(kYSND_DEPO));
//				if (ValidateData.isEmpty(kYSND_DEPO)) {
//					actionErrors.add("kYSND_DEPOError", new ActionMessage("error.depo.trong"));
//					autKYSNDForm.setErrorFirst(1+j*10);
//				}
//				saveErrors(request, actionErrors);
//				if (actionErrors.size() > 0) {
//					return mapping.findForward("addError");
//				}
//				j++;
//			}	
//			
//
//			
//		}
		// Execute Add new Room when click 'Save' in Create New Room page
		if ("Save".equals(autKYSNDForm.getSubmit())) {
			while (i < 4 && isSuccess == true) {
				
				autKYSND = new AUTKYSND();
				kYSND_BHNO = autKYSNDForm.getArrKYSND_BHNO(i);
				System.out.println("kYSND_BHNOAction:" + kYSND_BHNO);
				kYSND_BHNO1 = "";
				kYSND_FIL = "";
				kYSND_BHNO2 = "";
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
				System.out.println("kYSND_SPBN" + kYSND_SPBN);
				kYSND_SZSU = autKYSNDForm.getArrKYSND_SZSU(i);
				System.out.println("kYSND_SZSU:" + kYSND_SZSU);
				kYSND_CHNO = autKYSNDForm.getArrKYSND_CHNO(i);
				System.out.println("kYSND_CHNO:" + kYSND_CHNO);
				kYSND_SKCD = autKYSNDForm.getArrKYSND_SKCD(i);
				System.out.println("kYSND_SKCD:" + kYSND_SKCD);
				System.out
						.println(ValidateData.isBlankRecord(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_FORM, kYSND_BHNO2,
								kYSND_SYMD, kYSND_CHNO, kYSND_SKCD, kYSND_SZSU, kYSND_BHME, kYSND_SYCD, kYSND_SPBN));
				if (!ValidateData.isBlankRecord(kYSND_DEPO, kYSND_MKCD, kYSND_SSCD, kYSND_FORM, kYSND_BHNO2, kYSND_SYMD,
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
					if (kYSND_FORM != null)
						autKYSND.setkYSND_FORM(kYSND_FORM);
					else
						autKYSND.setkYSND_FORM("");
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

			// redirect to Create New Room page
			return mapping.findForward("addNew");
		}
	}
}
