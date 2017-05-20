/**
 * 
 */
package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.AUTKYSNDForm;
import model.bean.AUTKYSND;
import model.bean.AUTMFOPM;
import model.bo.AUTKYSNDBO;
import model.bo.AUTMFOPMBO;

/**
 * @author HCD-Fresher204
 *
 */
public class AddNewAUTKYSNDAction extends Action{
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

		AUTKYSNDBO autKYSNDBO;
		autKYSNDBO = new AUTKYSNDBO();
		AUTKYSND autKYSND = null;
		boolean isSuccess = true;
		int i = 0;
		String[] arrKYSND_SBET = autKYSNDForm.getArrKYSND_SBET();
		String[] arrKYSND_DEPO = autKYSNDForm.getArrKYSND_DEPO();
		String[] arrKYSND_MKCD = autKYSNDForm.getArrKYSND_MKCD() ;
		String[] arrKYSND_SSCD = autKYSNDForm.getArrKYSND_SSCD() ;
		String[] arrKYSND_SEQ = autKYSNDForm.getArrKYSND_SEQ() ;
		String[] arrKYSND_MKKG = autKYSNDForm.getArrKYSND_MKKG() ;
		String[] arrKYSND_TYPE = autKYSNDForm.getArrKYSND_TYPE() ;
		String[] arrKYSND_FORM = autKYSNDForm.getArrKYSND_FORM() ;
		String[] arrKYSND_BHNO = autKYSNDForm.getArrKYSND_BHNO() ;
		String[] arrKYSND_BHNO1 = autKYSNDForm.getArrKYSND_BHNO1() ;
		String[] arrKYSND_FIL = autKYSNDForm.getArrKYSND_FIL() ;
		String[] arrKYSND_BHNO2 = autKYSNDForm.getArrKYSND_BHNO2() ;
		String[] arrKYSND_SYMD = autKYSNDForm.getArrKYSND_SYMD() ;
		String[] arrKYSND_CHNO = autKYSNDForm.getArrKYSND_CHNO() ;
		String[] arrKYSND_SKCD = autKYSNDForm.getArrKYSND_SKCD() ;
		String[] arrKYSND_SZSU = autKYSNDForm.getArrKYSND_SZSU() ;
		String[] arrKYSND_BHME = autKYSNDForm.getArrKYSND_BHME() ;
		String[] arrKYSND_SYCD = autKYSNDForm.getArrKYSND_SYCD() ;
		String[] arrKYSND_SPBN = autKYSNDForm.getArrKYSND_SPBN() ;
		String[] arrKYSND_RYAK = autKYSNDForm.getArrKYSND_RYAK() ;
		String[] arrKYSND_NAME = autKYSNDForm.getArrKYSND_NAME() ;
		System.out.println(autKYSNDForm.getSubmit());
		// Execute Add new Room when click 'Save' in Create New Room page
		if ("Save".equals(autKYSNDForm.getSubmit())) {
			while(i<3&&isSuccess==true){

				autKYSND = new AUTKYSND();
				String kYSND_BHNO = arrKYSND_BHNO[i];
				String kYSND_BHNO1 = "";
				String kYSND_FIL = "";
				String kYSND_BHNO2 = "";
				String kYSND_TYPE = "1";
				String kYSND_DEPO = arrKYSND_DEPO[i];
				String kYSND_SYCD = arrKYSND_SYCD[i];
				String kYSND_SSCD = arrKYSND_SSCD[i];
				String kYSND_SBET = "A";
				String kYSND_FORM = arrKYSND_FORM[i];
				String kYSND_MKKG = "";
				String kYSND_MKCD = arrKYSND_MKCD[i];
				String kYSND_SYMD = arrKYSND_SYMD[i];
				String kYSND_BHME = arrKYSND_BHME[i];
				String kYSND_SPBN = arrKYSND_SPBN[i];
				String kYSND_SZSU = arrKYSND_SZSU[i];
				String kYSND_CHNO = arrKYSND_CHNO[i];
				String kYSND_SKCD = arrKYSND_SKCD[i];
				autKYSND.setkYSND_SBET(kYSND_SBET);
				autKYSND.setkYSND_DEPO(kYSND_DEPO);
				autKYSND.setkYSND_SEQ(autKYSNDBO.getKYSND_SEQ() + "");

				autKYSND.setkYSND_TYPE(kYSND_TYPE);
				autKYSND.setkYSND_SYCD(kYSND_SYCD);
				autKYSND.setkYSND_SSCD(kYSND_SSCD);
				if (kYSND_FORM != null)
					autKYSND.setkYSND_FORM(kYSND_FORM);
				else
					autKYSND.setkYSND_FORM("");
				autKYSND.setkYSND_BHME(kYSND_BHME);
				autKYSND.setkYSND_CHNO(kYSND_CHNO);
				if(kYSND_SYMD!=null){
					autKYSND.setkYSND_SYMD(kYSND_SYMD);
				}
				else
					autKYSND.setkYSND_SYMD("0");
				autKYSND.setkYSND_SKCD(kYSND_SKCD);
				
				autKYSND.setkYSND_SPBN(kYSND_SPBN);
				if(kYSND_SZSU != null){
					autKYSND.setkYSND_SZSU(kYSND_SZSU);
				}
				else
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
				if (kYSND_MKCD != null) {
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
				try {

					// Validate OK -> execute addRoom() method
					if (autKYSNDBO.addAUTKYSND(autKYSND))
						isSuccess=true;
					else
						isSuccess = false;
					i++;
				} catch (Exception e) {
					e.printStackTrace();
					// Exeption throw -> redirect to Error page
					return mapping.findForward("error");
				}
			}
//			if(isSuccess)
				return mapping.findForward("addNewSuccess");
//			else
//				return mapping.findForward("error");

		} else {

			// redirect to Create New Room page
			return mapping.findForward("addNew");
		}

	}
}
