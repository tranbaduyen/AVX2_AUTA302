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
public class AddAUTKYSNDAction extends Action {
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
		// Execute Add new Room when click 'Save' in Create New Room page
		if ("Save".equals(autKYSNDForm.getSubmit())) {
			while(i<10&&isSuccess==true){

				autKYSND = new AUTKYSND();
				String kYSND_BHNO = autKYSNDForm.getkYSND_BHNO();
				String kYSND_BHNO1 = "";
				String kYSND_FIL = "";
				String kYSND_BHNO2 = "";
				String kYSND_TYPE = "1";
				String kYSND_DEPO = autKYSNDForm.getkYSND_DEPO();
				String kYSND_SYCD = autKYSNDForm.getkYSND_SYCD();
				String kYSND_SSCD = autKYSNDForm.getkYSND_SSCD();
				String kYSND_SBET = "A";
				String kYSND_FORM = autKYSNDForm.getkYSND_FORM();
				String kYSND_MKKG = "";
				String kYSND_MKCD = autKYSNDForm.getkYSND_MKCD();
				String kYSND_SYMD = autKYSNDForm.getkYSND_SYMD();
				String kYSND_BHME = autKYSNDForm.getkYSND_BHME();
				String kYSND_SPBN = autKYSNDForm.getkYSND_SPBN();
				String kYSND_SZSU = autKYSNDForm.getkYSND_SZSU();
				String kYSND_CHNO = autKYSNDForm.getkYSND_CHNO();
				String kYSND_SKCD = autKYSNDForm.getkYSND_SKCD();
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
				autKYSND.setkYSND_SYMD(kYSND_SYMD);
				autKYSND.setkYSND_SKCD(kYSND_SKCD);
				autKYSND.setkYSND_SPBN(kYSND_SPBN);
				autKYSND.setkYSND_SZSU(kYSND_SZSU);
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
			if(isSuccess)
				return mapping.findForward("addSuccess");
			else
				return mapping.findForward("error");

		} else {

			// redirect to Create New Room page
			return mapping.findForward("add");
		}

	}
}
