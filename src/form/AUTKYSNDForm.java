/**
 * 
 */
package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import common.ValidateData;
import model.bean.AUTKYSND;
import model.bean.AUTMFOPM;

/**
 * AUTKYSNDForm.java
 *
 * Version 1.2
 *
 * Date: 18-05-2017
 *
 * Copyright
 *
 * Modification Logs: 
 * DATE 			AUTHOR		 	DESCRIPTION
 * -----------------------------------------------------------------------
 * 23-05-2017 		DuyenTB 		Create
 */
public class AUTKYSNDForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	private String[] arrKYSND_SBET = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_DEPO = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_MKCD = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_SSCD = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_SEQ = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_MKKG = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_TYPE = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_FORM = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_BHNO = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_BHNO1 = { "", "", "", "", "", "", "", "", "", "", "'" };
	private String[] arrKYSND_FIL = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_BHNO2 = { "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_SYMD = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_CHNO = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_SKCD = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_SZSU = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_BHME = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_SYCD = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_SPBN = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_RYAK = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrKYSND_NAME = { "", "", "", "", "", "", "", "", "", "", "" };
	private ArrayList<AUTMFOPM> listAUTMFOPM;
	private ArrayList<AUTKYSND> listAUTKYSND;
	private String submit;
	private String action;
	private String notification;
	private Integer[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private int errorFirst;

	/**
	 * @return the errorFirst
	 */
	public int getErrorFirst() {
		return errorFirst;
	}

	/**
	 * @param errorFirst
	 *            the errorFirst to set
	 */
	public void setErrorFirst(int errorFirst) {
		this.errorFirst = errorFirst;
	}

	/**
	 * @return the arrKYSND_SBET
	 */
	public String[] getArrKYSND_SBET() {
		return arrKYSND_SBET;
	}

	/**
	 * @param index
	 * @return arrKYSND_SBET[index];
	 */
	public String getArrKYSND_SBET(int index) {
		return arrKYSND_SBET[index];
	}

	/**
	 * @param arrKYSND_SBET
	 *            the arrKYSND_SBET to set
	 */
	public void setArrKYSND_SBET(String[] arrKYSND_SBET) {
		this.arrKYSND_SBET = arrKYSND_SBET;
	}

	/**
	 * @param index
	 * @param arrKYSND_SBET
	 */
	public void setArrKYSND_SBET(int index, String arrKYSND_SBET) {
		this.arrKYSND_SBET[index] = arrKYSND_SBET;
	}

	/**
	 * @return the arrKYSND_DEPO
	 */
	public String[] getArrKYSND_DEPO() {
		return arrKYSND_DEPO;
	}

	/**
	 * @param index
	 * @return arrKYSND_DEPO[index]
	 */
	public String getArrKYSND_DEPO(int index) {
		return arrKYSND_DEPO[index];
	}

	/**
	 * @param arrKYSND_DEPO
	 *            the arrKYSND_DEPO to set
	 */
	public void setArrKYSND_DEPO(int index, String arrKYSND_DEPO) {
		this.arrKYSND_DEPO[index] = arrKYSND_DEPO;
	}

	/**
	 * @return the arrKYSND_MKCD
	 */
	public String[] getArrKYSND_MKCD() {
		return arrKYSND_MKCD;
	}

	/**
	 * @param index
	 * @return arrKYSND_MKCD[index]
	 */
	public String getArrKYSND_MKCD(int index) {
		return arrKYSND_MKCD[index];
	}

	/**
	 * @param arrKYSND_MKCD
	 *            the arrKYSND_MKCD to set
	 */
	public void setArrKYSND_MKCD(int index, String arrKYSND_MKCD) {
		this.arrKYSND_MKCD[index] = arrKYSND_MKCD;
	}

	/**
	 * @return the arrKYSND_SSCD
	 */
	public String[] getArrKYSND_SSCD() {
		return arrKYSND_SSCD;
	}

	/**
	 * @param index
	 * @return arrKYSND_SSCD[index]
	 */
	public String getArrKYSND_SSCD(int index) {
		return arrKYSND_SSCD[index];
	}

	/**
	 * @param arrKYSND_SSCD
	 *            the arrKYSND_SSCD to set
	 */
	public void setArrKYSND_SSCD(int index, String arrKYSND_SSCD) {
		this.arrKYSND_SSCD[index] = arrKYSND_SSCD;
	}

	/**
	 * @return the arrKYSND_SEQ
	 */
	public String[] getArrKYSND_SEQ() {
		return arrKYSND_SEQ;
	}

	/**
	 * @param index
	 * @return arrKYSND_SEQ[index]
	 */
	public String getArrKYSND_SEQ(int index) {
		return arrKYSND_SEQ[index];
	}

	/**
	 * @param arrKYSND_SEQ
	 *            the arrKYSND_SEQ to set
	 */
	public void setArrKYSND_SEQ(String[] arrKYSND_SEQ) {
		this.arrKYSND_SEQ = arrKYSND_SEQ;
	}

	/**
	 * @param index
	 * @param arrKYSND_SEQ
	 */
	public void setArrKYSND_SEQ(int index, String arrKYSND_SEQ) {
		this.arrKYSND_SEQ[index] = arrKYSND_SEQ;
	}

	/**
	 * @return the arrKYSND_MKKG
	 */
	public String[] getArrKYSND_MKKG() {
		return arrKYSND_MKKG;
	}

	/**
	 * @param index
	 * @return arrKYSND_MKKG[index]
	 */
	public String getArrKYSND_MKKG(int index) {
		return arrKYSND_MKKG[index];
	}

	/**
	 * @param arrKYSND_MKKG
	 *            the arrKYSND_MKKG to set
	 */
	public void setArrKYSND_MKKG(String[] arrKYSND_MKKG) {
		this.arrKYSND_MKKG = arrKYSND_MKKG;
	}

	/**
	 * @param index
	 * @param arrKYSND_MKKG
	 */
	public void setArrKYSND_MKKG(int index, String arrKYSND_MKKG) {
		this.arrKYSND_MKKG[index] = arrKYSND_MKKG;
	}

	/**
	 * @return the arrKYSND_TYPE
	 */
	public String[] getArrKYSND_TYPE() {
		return arrKYSND_TYPE;
	}

	/**
	 * @param index
	 * @return arrKYSND_TYPE[index]
	 */
	public String getArrKYSND_TYPE(int index) {
		return arrKYSND_TYPE[index];
	}

	/**
	 * @param arrKYSND_TYPE
	 *            the arrKYSND_TYPE to set
	 */
	public void setArrKYSND_TYPE(String[] arrKYSND_TYPE) {
		this.arrKYSND_TYPE = arrKYSND_TYPE;
	}

	/**
	 * @param index
	 * @param arrKYSND_TYPE
	 */
	public void setArrKYSND_TYPE(int index, String arrKYSND_TYPE) {
		this.arrKYSND_TYPE[index] = arrKYSND_TYPE;
	}

	/**
	 * @return the arrKYSND_FORM
	 */
	public String[] getArrKYSND_FORM() {
		return arrKYSND_FORM;
	}

	/**
	 * @param index
	 * @return arrKYSND_FORM[index]
	 */
	public String getArrKYSND_FORM(int index) {
		return arrKYSND_FORM[index];
	}

	/**
	 * @param arrKYSND_FORM
	 *            the arrKYSND_FORM to set
	 */
	public void setArrKYSND_FORM(String[] arrKYSND_FORM) {
		this.arrKYSND_FORM = arrKYSND_FORM;
	}

	/**
	 * @param index
	 * @param arrKYSND_FORM
	 */
	public void setArrKYSND_FORM(int index, String arrKYSND_FORM) {
		this.arrKYSND_FORM[index] = ValidateData.chuanHoa(arrKYSND_FORM);
	}

	/**
	 * @return the arrKYSND_BHNO
	 */
	public String[] getArrKYSND_BHNO() {
		return arrKYSND_BHNO;
	}

	/**
	 * @param index
	 * @return arrKYSND_BHNO[index]
	 */
	public String getArrKYSND_BHNO(int index) {
		return arrKYSND_BHNO[index];
	}

	/**
	 * @param arrKYSND_BHNO
	 *            the arrKYSND_BHNO to set
	 */
	public void setArrKYSND_BHNO(String[] arrKYSND_BHNO) {
		this.arrKYSND_BHNO = arrKYSND_BHNO;
	}

	/**
	 * @param index
	 * @param arrKYSND_BHNO
	 */
	public void setArrKYSND_BHNO(int index, String arrKYSND_BHNO) {
		this.arrKYSND_BHNO[index] = ValidateData.chuanHoa(arrKYSND_BHNO);
	}

	/**
	 * @return the arrKYSND_BHNO1
	 */
	public String[] getArrKYSND_BHNO1() {
		return arrKYSND_BHNO1;
	}

	/**
	 * @param arrKYSND_BHNO1
	 *            the arrKYSND_BHNO1 to set
	 */
	public void setArrKYSND_BHNO1(String[] arrKYSND_BHNO1) {
		this.arrKYSND_BHNO1 = arrKYSND_BHNO1;
	}

	/**
	 * @return the arrKYSND_FIL
	 */
	public String[] getArrKYSND_FIL() {
		return arrKYSND_FIL;
	}

	/**
	 * @param arrKYSND_FIL
	 *            the arrKYSND_FIL to set
	 */
	public void setArrKYSND_FIL(String[] arrKYSND_FIL) {
		this.arrKYSND_FIL = arrKYSND_FIL;
	}

	/**
	 * @return the arrKYSND_BHNO2
	 */
	public String[] getArrKYSND_BHNO2() {
		return arrKYSND_BHNO2;
	}

	/**
	 * @param arrKYSND_BHNO2
	 *            the arrKYSND_BHNO2 to set
	 */
	public void setArrKYSND_BHNO2(String[] arrKYSND_BHNO2) {
		this.arrKYSND_BHNO2 = arrKYSND_BHNO2;
	}

	/**
	 * @return the arrKYSND_SYMD
	 */
	public String[] getArrKYSND_SYMD() {
		return arrKYSND_SYMD;
	}

	/**
	 * @param index
	 * @return arrKYSND_SYMD[index]
	 */
	public String getArrKYSND_SYMD(int index) {
		return arrKYSND_SYMD[index];
	}

	/**
	 * @param arrKYSND_SYMD
	 *            the arrKYSND_SYMD to set
	 */
	public void setArrKYSND_SYMD(String[] arrKYSND_SYMD) {
		this.arrKYSND_SYMD = arrKYSND_SYMD;
	}

	/**
	 * @param index
	 * @param arrKYSND_SYMD
	 */
	public void setArrKYSND_SYMD(int index, String arrKYSND_SYMD) {
		this.arrKYSND_SYMD[index] = ValidateData.chuanHoa(arrKYSND_SYMD);
	}

	/**
	 * @return the arrKYSND_CHNO
	 */
	public String[] getArrKYSND_CHNO() {
		return arrKYSND_CHNO;
	}

	/**
	 * @param index
	 * @return arrKYSND_CHNO[index]
	 */
	public String getArrKYSND_CHNO(int index) {
		return arrKYSND_CHNO[index];
	}

	/**
	 * @param arrKYSND_CHNO
	 *            the arrKYSND_CHNO to set
	 */
	public void setArrKYSND_CHNO(String[] arrKYSND_CHNO) {
		this.arrKYSND_CHNO = arrKYSND_CHNO;
	}

	/**
	 * @param index
	 * @param arrKYSND_CHNO
	 */
	public void setArrKYSND_CHNO(int index, String arrKYSND_CHNO) {
		this.arrKYSND_CHNO[index] = ValidateData.chuanHoa(arrKYSND_CHNO);
	}

	/**
	 * @return the arrKYSND_SKCD
	 */
	public String[] getArrKYSND_SKCD() {
		return arrKYSND_SKCD;
	}

	/**
	 * @param index
	 * @return arrKYSND_SKCD[index]
	 */
	public String getArrKYSND_SKCD(int index) {
		return arrKYSND_SKCD[index];
	}

	/**
	 * @param arrKYSND_SKCD
	 *            the arrKYSND_SKCD to set
	 */
	public void setArrKYSND_SKCD(String[] arrKYSND_SKCD) {
		this.arrKYSND_SKCD = arrKYSND_SKCD;
	}

	/**
	 * @param index
	 * @param arrKYSND_SKCD
	 */
	public void setArrKYSND_SKCD(int index, String arrKYSND_SKCD) {
		this.arrKYSND_SKCD[index] = ValidateData.chuanHoa(arrKYSND_SKCD);
	}

	/**
	 * @return the arrKYSND_SZSU
	 */
	public String[] getArrKYSND_SZSU() {
		return arrKYSND_SZSU;
	}

	/**
	 * @param index
	 * @return arrKYSND_SZSU[index]
	 */
	public String getArrKYSND_SZSU(int index) {
		return arrKYSND_SZSU[index];
	}

	/**
	 * @param arrKYSND_SZSU
	 *            the arrKYSND_SZSU to set
	 */
	public void setArrKYSND_SZSU(String[] arrKYSND_SZSU) {
		this.arrKYSND_SZSU = arrKYSND_SZSU;
	}

	/**
	 * @param index
	 * @param arrKYSND_SZSU
	 */
	public void setArrKYSND_SZSU(int index, String arrKYSND_SZSU) {
		this.arrKYSND_SZSU[index] = ValidateData.chuanHoa(arrKYSND_SZSU);
	}

	/**
	 * @return the arrKYSND_BHME
	 */
	public String[] getArrKYSND_BHME() {
		return arrKYSND_BHME;
	}

	/**
	 * @param index
	 * @return
	 */
	public String getArrKYSND_BHME(int index) {
		return arrKYSND_BHME[index];
	}

	/**
	 * @param arrKYSND_BHME
	 *            the arrKYSND_BHME to set
	 */
	public void setArrKYSND_BHME(String[] arrKYSND_BHME) {
		this.arrKYSND_BHME = arrKYSND_BHME;
	}

	/**
	 * @param index
	 * @param arrKYSND_BHME
	 */
	public void setArrKYSND_BHME(int index, String arrKYSND_BHME) {
		this.arrKYSND_BHME[index] = ValidateData.chuanHoa(arrKYSND_BHME);
	}

	/**
	 * @return the arrKYSND_SYCD
	 */
	public String[] getArrKYSND_SYCD() {
		return arrKYSND_SYCD;
	}

	/**
	 * @param index
	 * @return
	 */
	public String getArrKYSND_SYCD(int index) {
		return arrKYSND_SYCD[index];
	}

	/**
	 * @param arrKYSND_SYCD
	 *            the arrKYSND_SYCD to set
	 */
	public void setArrKYSND_SYCD(String[] arrKYSND_SYCD) {
		this.arrKYSND_SYCD = arrKYSND_SYCD;
	}

	/**
	 * @param index
	 * @param arrKYSND_SYCD
	 */
	public void setArrKYSND_SYCD(int index, String arrKYSND_SYCD) {
		this.arrKYSND_SYCD[index] = arrKYSND_SYCD;
	}

	/**
	 * @return the arrKYSND_SPBN
	 */
	public String[] getArrKYSND_SPBN() {
		return arrKYSND_SPBN;
	}

	/**
	 * @param index
	 * @return arrKYSND_SPBN[index]
	 */
	public String getArrKYSND_SPBN(int index) {
		return arrKYSND_SPBN[index];
	}

	/**
	 * @param arrKYSND_SPBN
	 *            the arrKYSND_SPBN to set
	 */
	public void setArrKYSND_SPBN(String[] arrKYSND_SPBN) {
		this.arrKYSND_SPBN = arrKYSND_SPBN;
	}

	/**
	 * @param index
	 * @param arrKYSND_SPBN
	 */
	public void setArrKYSND_SPBN(int index, String arrKYSND_SPBN) {
		this.arrKYSND_SPBN[index] = ValidateData.chuanHoa(arrKYSND_SPBN);
	}

	/**
	 * @return the arrKYSND_RYAK
	 */
	public String[] getArrKYSND_RYAK() {
		return arrKYSND_RYAK;
	}

	/**
	 * @param arrKYSND_RYAK
	 *            the arrKYSND_RYAK to set
	 */
	public void setArrKYSND_RYAK(String[] arrKYSND_RYAK) {
		this.arrKYSND_RYAK = arrKYSND_RYAK;
	}

	/**
	 * @return the arrKYSND_NAME
	 */
	public String[] getArrKYSND_NAME() {
		return arrKYSND_NAME;
	}

	/**
	 * @param arrKYSND_NAME
	 *            the arrKYSND_NAME to set
	 */
	public void setArrKYSND_NAME(String[] arrKYSND_NAME) {
		this.arrKYSND_NAME = arrKYSND_NAME;
	}

	/**
	 * @return the number
	 */
	public Integer[] getNumber() {
		return number;
	}

	/**
	 * @param index
	 * @return number[index]
	 */
	public Integer getNumber(int index) {
		return number[index];
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int index, Integer number) {
		this.number[index] = number;
	}

	/**
	 * @return the listMFOPM
	 */
	public ArrayList<AUTMFOPM> getListAUTMFOPM() {
		return listAUTMFOPM;
	}

	/**
	 * @param listMFOPM
	 *            the listMFOPM to set
	 */
	public void setListAUTMFOPM(ArrayList<AUTMFOPM> listAUTMFOPM) {
		this.listAUTMFOPM = listAUTMFOPM;
	}

	/**
	 * @return the listAUTKYSND
	 */
	public ArrayList<AUTKYSND> getListAUTKYSND() {
		return listAUTKYSND;
	}

	/**
	 * @param listAUTKYSND
	 *            the listAUTKYSND to set
	 */
	public void setListAUTKYSND(ArrayList<AUTKYSND> listAUTKYSND) {
		this.listAUTKYSND = listAUTKYSND;
	}

	/**
	 * @return the submit
	 */
	public String getSubmit() {
		return submit;
	}

	/**
	 * @param submit
	 *            the submit to set
	 */
	public void setSubmit(String submit) {
		this.submit = submit;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the notification
	 */
	public String getNotification() {
		return notification;
	}

	/**
	 * @param notification
	 *            the notification to set
	 */
	public void setNotification(String notification) {
		this.notification = notification;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			;
		}
	}
}
