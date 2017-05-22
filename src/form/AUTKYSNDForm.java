/**
 * 
 */
package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.AUTKYSND;
import model.bean.AUTMFOPM;

/**
 * @author HCD-Fresher204
 *
 */
public class AUTKYSNDForm extends ActionForm {
	private String kYSND_SBET;
	private String kYSND_DEPO;
	private String kYSND_MKCD;
	private String kYSND_SSCD;
	private String kYSND_SEQ;
	private String kYSND_MKKG;
	private String kYSND_TYPE;
	private String kYSND_FORM;
	private String kYSND_BHNO;
	private String kYSND_BHNO1;
	private String kYSND_FIL;
	private String kYSND_BHNO2;
	private String kYSND_SYMD;
	private String kYSND_CHNO;
	private String kYSND_SKCD;
	private String kYSND_SZSU;
	private String kYSND_BHME;
	private String kYSND_SYCD;
	private String kYSND_SPBN;
	private String kYSND_RYAK;
	private String kYSND_NAME;
	private String[] arrKYSND_SBET ={"","","",""};
	private String[] arrKYSND_DEPO ={"","","",""};
	private String[] arrKYSND_MKCD ={"","","",""};
	private String[] arrKYSND_SSCD ={"","","",""};
	private String[] arrKYSND_SEQ ={"","","",""};
	private String[] arrKYSND_MKKG ={"","","",""};
	private String[] arrKYSND_TYPE ={"","","",""};
	private String[] arrKYSND_FORM ={"","","",""};
	private String[] arrKYSND_BHNO ={"","","",""};
	private String[] arrKYSND_BHNO1 ={"","","",""};
	private String[] arrKYSND_FIL ={"","","",""};
	private String[] arrKYSND_BHNO2 ={"","","",""};
	private String[] arrKYSND_SYMD ={"","","",""};
	private String[] arrKYSND_CHNO ={"","","",""};
	private String[] arrKYSND_SKCD ={"","","",""};
	private String[] arrKYSND_SZSU ={"0","0","0","0"};
	private String[] arrKYSND_BHME ={"","","",""};
	private String[] arrKYSND_SYCD ={"","","",""};
	private String[] arrKYSND_SPBN ={"","","",""};
	private String[] arrKYSND_RYAK ={"","","",""};
	private String[] arrKYSND_NAME ={"","","",""};
	private ArrayList<AUTMFOPM> listAUTMFOPM;
	private ArrayList<AUTKYSND> listAUTKYSND;
	private String submit;
	private String action;
	private String notification;
	private Integer[] number = { 1, 2, 3 };
	private int errorFirst;

	/**
	 * @return the errorFirst
	 */
	public int getErrorFirst() {
		return errorFirst;
	}

	/**
	 * @param errorFirst the errorFirst to set
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
	public void setArrKYSND_SBET(int index, String arrKYSND_SBET) {
		this.arrKYSND_SBET[index] = arrKYSND_SBET;
	}

	/**
	 * @return the arrKYSND_DEPO
	 */
	public String[] getArrKYSND_DEPO() {
		return arrKYSND_DEPO;
	}
	
	public String getArrKYSND_DEPO(int index) {
		return arrKYSND_DEPO[index];
	}

	/**
	 * @param arrKYSND_DEPO
	 *            the arrKYSND_DEPO to set
	 */
	public void setArrKYSND_DEPO(int index, String arrKYSND_DEPO) {
//		this.arrKYSND_DEPO[index] = arrKYSND_DEPO;
	}

	/**
	 * @return the arrKYSND_MKCD
	 */
	public String[] getArrKYSND_MKCD() {
		return arrKYSND_MKCD;
	}
	public String getArrKYSND_MKCD(int index) {
		return arrKYSND_MKCD[index];
	}

	/**
	 * @param arrKYSND_MKCD
	 *            the arrKYSND_MKCD to set
	 */
	public void setArrKYSND_MKCD(int index, String arrKYSND_MKCD) {
//		this.arrKYSND_MKCD[index] = arrKYSND_MKCD;
	}

	/**
	 * @return the arrKYSND_SSCD
	 */
	public String[] getArrKYSND_SSCD() {
		return arrKYSND_SSCD;
	}
	public String getArrKYSND_SSCD(int index) {
		return arrKYSND_SSCD[index];
	}
	/**
	 * @param arrKYSND_SSCD
	 *            the arrKYSND_SSCD to set
	 */
	public void setArrKYSND_SSCD(int index, String arrKYSND_SSCD) {
//		this.arrKYSND_SSCD[index] = arrKYSND_SSCD;
	}

	/**
	 * @return the arrKYSND_SEQ
	 */
	public String[] getArrKYSND_SEQ() {
		return arrKYSND_SEQ;
	}
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
	public void setArrKYSND_SEQ(int index, String arrKYSND_SEQ) {
		this.arrKYSND_SEQ[index] = arrKYSND_SEQ;
	}

	/**
	 * @return the arrKYSND_MKKG
	 */
	public String[] getArrKYSND_MKKG() {
		return arrKYSND_MKKG;
	}
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
	public void setArrKYSND_MKKG(int index, String arrKYSND_MKKG) {
		this.arrKYSND_MKKG[index] = arrKYSND_MKKG;
	}

	/**
	 * @return the arrKYSND_TYPE
	 */
	public String[] getArrKYSND_TYPE() {
		return arrKYSND_TYPE;
	}
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
	public void setArrKYSND_TYPE(int index, String arrKYSND_TYPE) {
		this.arrKYSND_TYPE[index] = arrKYSND_TYPE;
	}
	/**
	 * @return the arrKYSND_FORM
	 */
	public String[] getArrKYSND_FORM() {
		return arrKYSND_FORM;
	}
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
	public void setArrKYSND_FORM(int index, String arrKYSND_FORM) {
//		this.arrKYSND_FORM[index] = arrKYSND_FORM;
	}
	/**
	 * @return the arrKYSND_BHNO
	 */
	public String[] getArrKYSND_BHNO() {
		return arrKYSND_BHNO;
	}
	public String getArrKYSND_BHNO(int index) {
		System.out.println("indexBHNOForm:"+index);
		System.out.println("arrKYSND_BHNO[index]Form:"+arrKYSND_BHNO[index]);
		return arrKYSND_BHNO[index];
	}

	/**
	 * @param arrKYSND_BHNO
	 *            the arrKYSND_BHNO to set
	 */
	public void setArrKYSND_BHNO(String[] arrKYSND_BHNO) {
		this.arrKYSND_BHNO = arrKYSND_BHNO;
	}
	public void setArrKYSND_BHNO(int index, String arrKYSND_BHNO) {
//		this.arrKYSND_BHNO[index] = arrKYSND_BHNO;
		this.arrKYSND_BHNO[index] = arrKYSND_BHNO;
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
	public void setArrKYSND_SYMD(int index, String arrKYSND_SYMD) {
//		this.arrKYSND_SYMD[index] = arrKYSND_SYMD;
	}
	/**
	 * @return the arrKYSND_CHNO
	 */
	public String[] getArrKYSND_CHNO() {
		return arrKYSND_CHNO;
	}
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
	public void setArrKYSND_CHNO(int index, String arrKYSND_CHNO) {
//		this.arrKYSND_CHNO[index] = arrKYSND_CHNO;
	}
	/**
	 * @return the arrKYSND_SKCD
	 */
	public String[] getArrKYSND_SKCD() {
		return arrKYSND_SKCD;
	}
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
	public void setArrKYSND_SKCD(int index, String arrKYSND_SKCD) {
//		this.arrKYSND_SKCD[index] = arrKYSND_SKCD;
		System.out.println("arrKYSND_SKCD:"+arrKYSND_SKCD);
	}
	/**
	 * @return the arrKYSND_SZSU
	 */
	public String[] getArrKYSND_SZSU() {
		return arrKYSND_SZSU;
	}
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
	public void setArrKYSND_SZSU(int index, String arrKYSND_SZSU) {
		System.out.println("arrKYSND_SZSUForm:"+arrKYSND_SZSU);
		System.out.println("indexForm:"+index);
		//this.arrKYSND_SZSU[index] = arrKYSND_SZSU;
		//System.out.println("arrKYSND_SZSU[index]Form:"+this.arrKYSND_SZSU[index]);
	}
	/**
	 * @return the arrKYSND_BHME
	 */
	public String[] getArrKYSND_BHME() {
		return arrKYSND_BHME;
	}
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
	public void setArrKYSND_BHME(int index, String arrKYSND_BHME) {
//		this.arrKYSND_BHME[index] = arrKYSND_BHME;
	}
	/**
	 * @return the arrKYSND_SYCD
	 */
	public String[] getArrKYSND_SYCD() {
		return arrKYSND_SYCD;
	}
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
	public void setArrKYSND_SYCD(int index, String arrKYSND_SYCD) {
//		this.arrKYSND_SYCD[index] = arrKYSND_SYCD;
	}

	/**
	 * @return the arrKYSND_SPBN
	 */
	public String[] getArrKYSND_SPBN() {
		return arrKYSND_SPBN;
	}
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
	public void setArrKYSND_SPBN(int index, String arrKYSND_SPBN) {
//		this.arrKYSND_SPBN[index] = arrKYSND_SPBN;
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
	 * @return the kYSND_RYAK
	 */
	public String getkYSND_RYAK() {
		return kYSND_RYAK;
	}

	/**
	 * @param kYSND_RYAK
	 *            the kYSND_RYAK to set
	 */
	public void setkYSND_RYAK(String kYSND_RYAK) {
		this.kYSND_RYAK = kYSND_RYAK;
	}

	/**
	 * @return the kYSND_NAME
	 */
	public String getkYSND_NAME() {
		return kYSND_NAME;
	}

	/**
	 * @param kYSND_NAME
	 *            the kYSND_NAME to set
	 */
	public void setkYSND_NAME(String kYSND_NAME) {
		this.kYSND_NAME = kYSND_NAME;
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
	 * @return the kYSND_SBET
	 */
	public String getkYSND_SBET() {
		return kYSND_SBET;
	}

	/**
	 * @param kYSND_SBET
	 *            the kYSND_SBET to set
	 */
	public void setkYSND_SBET(String kYSND_SBET) {
		this.kYSND_SBET = kYSND_SBET;
	}

	/**
	 * @return the kYSND_DEPO
	 */
	public String getkYSND_DEPO() {
		return kYSND_DEPO;
	}

	/**
	 * @param kYSND_DEPO
	 *            the kYSND_DEPO to set
	 */
	public void setkYSND_DEPO(String kYSND_DEPO) {
		this.kYSND_DEPO = kYSND_DEPO;
	}

	/**
	 * @return the kYSND_MKCD
	 */
	public String getkYSND_MKCD() {
		return kYSND_MKCD;
	}

	/**
	 * @param kYSND_MKCD
	 *            the kYSND_MKCD to set
	 */
	public void setkYSND_MKCD(String kYSND_MKCD) {
		this.kYSND_MKCD = kYSND_MKCD;
	}

	/**
	 * @return the kYSND_SSCD
	 */
	public String getkYSND_SSCD() {
		return kYSND_SSCD;
	}

	/**
	 * @param kYSND_SSCD
	 *            the kYSND_SSCD to set
	 */
	public void setkYSND_SSCD(String kYSND_SSCD) {
		this.kYSND_SSCD = kYSND_SSCD;
	}

	/**
	 * @return the kYSND_SEQ
	 */
	public String getkYSND_SEQ() {
		return kYSND_SEQ;
	}

	/**
	 * @param kYSND_SEQ
	 *            the kYSND_SEQ to set
	 */
	public void setkYSND_SEQ(String kYSND_SEQ) {
		this.kYSND_SEQ = kYSND_SEQ;
	}

	/**
	 * @return the kYSND_MKKG
	 */
	public String getkYSND_MKKG() {
		return kYSND_MKKG;
	}

	/**
	 * @param kYSND_MKKG
	 *            the kYSND_MKKG to set
	 */
	public void setkYSND_MKKG(String kYSND_MKKG) {
		this.kYSND_MKKG = kYSND_MKKG;
	}

	/**
	 * @return the kYSND_TYPE
	 */
	public String getkYSND_TYPE() {
		return kYSND_TYPE;
	}

	/**
	 * @param kYSND_TYPE
	 *            the kYSND_TYPE to set
	 */
	public void setkYSND_TYPE(String kYSND_TYPE) {
		this.kYSND_TYPE = kYSND_TYPE;
	}

	/**
	 * @return the kYSND_FORM
	 */
	public String getkYSND_FORM() {
		return kYSND_FORM;
	}

	/**
	 * @param kYSND_FORM
	 *            the kYSND_FORM to set
	 */
	public void setkYSND_FORM(String kYSND_FORM) {
		this.kYSND_FORM = kYSND_FORM;
	}

	/**
	 * @return the kYSND_BHNO
	 */
	public String getkYSND_BHNO() {
		return kYSND_BHNO;
	}

	/**
	 * @param kYSND_BHNO
	 *            the kYSND_BHNO to set
	 */
	public void setkYSND_BHNO(String kYSND_BHNO) {
		this.kYSND_BHNO = kYSND_BHNO;
	}

	/**
	 * @return the kYSND_BHNO1
	 */
	public String getkYSND_BHNO1() {
		return kYSND_BHNO1;
	}

	/**
	 * @param kYSND_BHNO1
	 *            the kYSND_BHNO1 to set
	 */
	public void setkYSND_BHNO1(String kYSND_BHNO1) {
		this.kYSND_BHNO1 = kYSND_BHNO1;
	}

	/**
	 * @return the kYSND_FIL
	 */
	public String getkYSND_FIL() {
		return kYSND_FIL;
	}

	/**
	 * @param kYSND_FIL
	 *            the kYSND_FIL to set
	 */
	public void setkYSND_FIL(String kYSND_FIL) {
		this.kYSND_FIL = kYSND_FIL;
	}

	/**
	 * @return the kYSND_BHNO2
	 */
	public String getkYSND_BHNO2() {
		return kYSND_BHNO2;
	}

	/**
	 * @param kYSND_BHNO2
	 *            the kYSND_BHNO2 to set
	 */
	public void setkYSND_BHNO2(String kYSND_BHNO2) {
		this.kYSND_BHNO2 = kYSND_BHNO2;
	}

	/**
	 * @return the kYSND_SYMD
	 */
	public String getkYSND_SYMD() {
		return kYSND_SYMD;
	}

	/**
	 * @param kYSND_SYMD
	 *            the kYSND_SYMD to set
	 */
	public void setkYSND_SYMD(String kYSND_SYMD) {
		this.kYSND_SYMD = kYSND_SYMD;
	}

	/**
	 * @return the kYSND_CHNO
	 */
	public String getkYSND_CHNO() {
		return kYSND_CHNO;
	}

	/**
	 * @param kYSND_CHNO
	 *            the kYSND_CHNO to set
	 */
	public void setkYSND_CHNO(String kYSND_CHNO) {
		this.kYSND_CHNO = kYSND_CHNO;
	}

	/**
	 * @return the kYSND_SKCD
	 */
	public String getkYSND_SKCD() {
		return kYSND_SKCD;
	}

	/**
	 * @param kYSND_SKCD
	 *            the kYSND_SKCD to set
	 */
	public void setkYSND_SKCD(String kYSND_SKCD) {
		this.kYSND_SKCD = kYSND_SKCD;
	}

	/**
	 * @return the kYSND_SZSU
	 */
	public String getkYSND_SZSU() {
		return kYSND_SZSU;
	}

	/**
	 * @param kYSND_SZSU
	 *            the kYSND_SZSU to set
	 */
	public void setkYSND_SZSU(String kYSND_SZSU) {
		this.kYSND_SZSU = kYSND_SZSU;
	}

	/**
	 * @return the kYSND_BHME
	 */
	public String getkYSND_BHME() {
		return kYSND_BHME;
	}

	/**
	 * @param kYSND_BHME
	 *            the kYSND_BHME to set
	 */
	public void setkYSND_BHME(String kYSND_BHME) {
		this.kYSND_BHME = kYSND_BHME;
	}

	/**
	 * @return the kYSND_SYCD
	 */
	public String getkYSND_SYCD() {
		return kYSND_SYCD;
	}

	/**
	 * @param kYSND_SYCD
	 *            the kYSND_SYCD to set
	 */
	public void setkYSND_SYCD(String kYSND_SYCD) {
		this.kYSND_SYCD = kYSND_SYCD;
	}

	/**
	 * @return the kYSND_SPBN
	 */
	public String getkYSND_SPBN() {
		return kYSND_SPBN;
	}

	/**
	 * @param kYSND_SPBN
	 *            the kYSND_SPBN to set
	 */
	public void setkYSND_SPBN(String kYSND_SPBN) {
		this.kYSND_SPBN = kYSND_SPBN;
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
		// TODO Auto-generated method stub
		kYSND_SBET = "A";
		kYSND_DEPO = "";
		kYSND_MKCD = "0";
		kYSND_SSCD = "";
		kYSND_SEQ = "";
		kYSND_MKKG = "";
		kYSND_TYPE = "1";
		kYSND_FORM = "";
		kYSND_BHNO = "";
		kYSND_BHNO1 = "";
		kYSND_FIL = "";
		kYSND_BHNO2 = "";
		kYSND_SYMD = "";
		kYSND_CHNO = "";
		kYSND_SKCD = "";
		kYSND_SZSU = "";
		kYSND_BHME = "";
		kYSND_SYCD = "0";
		kYSND_SPBN = "";
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
