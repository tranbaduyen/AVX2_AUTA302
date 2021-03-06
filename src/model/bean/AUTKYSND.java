/**
 * 
 */
package model.bean;

/**
 * AUTKYSND.java
 *
 * Version 1.0
 *
 * Date: 18-05-2017
 *
 * Copyright
 *
 * Modification Logs: 
 * DATE 			AUTHOR		 	DESCRIPTION
 * -----------------------------------------------------------------------
 * 18-05-2017 		DuyenTB 		Create
 */
public class AUTKYSND {
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

	/**
	 * Method constructor no parameter
	 */
	public AUTKYSND() {
		super();
		this.kYSND_SBET = "A";
		this.kYSND_DEPO = "";
		this.kYSND_MKCD = "";
		this.kYSND_SSCD = "";
		this.kYSND_SEQ = "0";
		this.kYSND_MKKG = "";
		this.kYSND_TYPE = "1";
		this.kYSND_FORM = "";
		this.kYSND_BHNO1 = "";
		this.kYSND_FIL = "";
		this.kYSND_BHNO2 = "";
		this.kYSND_SYMD = "0";
		this.kYSND_CHNO = "";
		this.kYSND_SKCD = "";
		this.kYSND_SZSU = "0";
		this.kYSND_BHME = "";
		this.kYSND_SYCD = "";
		this.kYSND_SPBN = "";
	}
	
	/**
	 * Method constructor have parameters
	 * 
	 * @param kYSND_SBET
	 * @param kYSND_DEPO
	 * @param kYSND_MKCD
	 * @param kYSND_SSCD
	 * @param kYSND_SEQ
	 * @param kYSND_MKKG
	 * @param kYSND_TYPE
	 * @param kYSND_FORM
	 * @param kYSND_BHNO1
	 * @param kYSND_FIL
	 * @param kYSND_BHNO2
	 * @param kYSND_SYMD
	 * @param kYSND_CHNO
	 * @param kYSND_SKCD
	 * @param kYSND_SZSU
	 * @param kYSND_BHME
	 * @param kYSND_SYCD
	 * @param kYSND_SPBN
	 */
	public AUTKYSND(String kYSND_SBET, String kYSND_DEPO, String kYSND_MKCD, String kYSND_SSCD, String kYSND_SEQ,
			String kYSND_MKKG, String kYSND_TYPE, String kYSND_FORM, String kYSND_BHNO1, String kYSND_FIL,
			String kYSND_BHNO2, String kYSND_SYMD, String kYSND_CHNO, String kYSND_SKCD, String kYSND_SZSU,
			String kYSND_BHME, String kYSND_SYCD, String kYSND_SPBN) {
		super();
		this.kYSND_SBET = kYSND_SBET;
		this.kYSND_DEPO = kYSND_DEPO;
		this.kYSND_MKCD = kYSND_MKCD;
		this.kYSND_SSCD = kYSND_SSCD;
		this.kYSND_SEQ = kYSND_SEQ;
		this.kYSND_MKKG = kYSND_MKKG;
		this.kYSND_TYPE = kYSND_TYPE;
		this.kYSND_FORM = kYSND_FORM;
		this.kYSND_BHNO1 = kYSND_BHNO1;
		this.kYSND_FIL = kYSND_FIL;
		this.kYSND_BHNO2 = kYSND_BHNO2;
		this.kYSND_SYMD = kYSND_SYMD;
		this.kYSND_CHNO = kYSND_CHNO;
		this.kYSND_SKCD = kYSND_SKCD;
		this.kYSND_SZSU = kYSND_SZSU;
		this.kYSND_BHME = kYSND_BHME;
		this.kYSND_SYCD = kYSND_SYCD;
		this.kYSND_SPBN = kYSND_SPBN;
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
	
	
}
