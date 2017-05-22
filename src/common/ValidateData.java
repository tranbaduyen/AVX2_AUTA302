package common;

import java.util.Calendar;

/**
 * ValidateData.java
 *
 * Version 1.0
 *
 * Date: 04-05-2017
 *
 * Copyright
 *
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 * 04-05-2017 DuyenTB Create
 */

public class ValidateData {

	/**
	 * Ham chuan hoa chuoi string Method format String
	 * 
	 * @param str
	 * @return str
	 */
	public static String chuanHoa(String str) {
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		return str;
	}

	/**
	 * Ham kiem tra truong kieu string co rong hay khong ? Method check string
	 * is empty ?
	 * 
	 * @param str
	 * @return boolean
	 */
	public static boolean isEmpty(String str) {
		str = chuanHoa(str);
		return (str == null || str.length() == 0 || "".equals(str) || "0".equals(str)) ? true : false;
	}

	/**
	 * Ham kiem tra xem xau co bao gom tat ca chu so hay khong Method check
	 * 
	 * @param str
	 * @return boolean
	 */
	public static boolean isAllNumber(String str) {
		str = chuanHoa(str);
		String regex = "[0-9+-]+";
		return (str.matches(regex)) ? true : false;
	}

	/**
	 * Ham kiem tra xau co ki tu dac biet hay khong ? Method check string use
	 * special characters ?
	 * 
	 * @param str
	 * @return boolean
	 */
	public static boolean isSpecialCharacters(String str) {
		str = chuanHoa(str);
		String regex = (".*[\"\\.&,@!?%'$()/\\\\ \\_<>].*");
		return (str.matches(regex)) ? true : false;
	}

	public static void main(String[] args) {
		System.out.println();
	}

	public static boolean isBlankRecord(String kYSND_DEPO, String kYSND_MKCD, String kYSND_SSCD, String kYSND_FORM,
			String kYSND_BHNO, String kYSND_SYMD, String kYSND_CHNO, String kYSND_SKCD, String kYSND_SZSU,
			String kYSND_BHME, String kYSND_SYCD, String kYSND_SPBN) {
		if ((kYSND_DEPO == null || kYSND_DEPO.length() == 0 || "".equals(kYSND_DEPO)) && ("0".equals(kYSND_MKCD))
				&& (kYSND_SSCD == null || kYSND_SSCD.length() == 0 || "".equals(kYSND_SSCD))
				&& (kYSND_FORM == null || kYSND_FORM.length() == 0 || "".equals(kYSND_FORM))
				&& (kYSND_BHNO == null || kYSND_BHNO.length() == 0 || "".equals(kYSND_BHNO))
				&& (kYSND_SYMD == null || kYSND_SYMD.length() == 0 || "".equals(kYSND_SYMD))
				&& (kYSND_CHNO == null || kYSND_CHNO.length() == 0 || "".equals(kYSND_CHNO))
				&& (kYSND_SKCD == null || kYSND_SKCD.length() == 0 || "".equals(kYSND_SKCD))
				&& (kYSND_SZSU == null || kYSND_SZSU.length() == 0 || "".equals(kYSND_SZSU))
				&& (kYSND_BHME == null || kYSND_BHME.length() == 0 || "".equals(kYSND_BHME)) && ("0".equals(kYSND_SYCD))
				&& (kYSND_SPBN == null || kYSND_SPBN.length() == 0 || "".equals(kYSND_SPBN)))
			return true;
		return false;
	}

	public static boolean isInvalidKYSND_BHNO(String kYSND_MKCD, String kYSND_BHNO) {
		String kYSND_FIL = kYSND_BHNO.substring(14, 15);
		return ("01".equals(kYSND_MKCD) && "#".equals(kYSND_FIL)) ? true : false;
	}

	public static boolean isInvalidDateValue(String kYSND_SYMD) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int year = Integer.parseInt(kYSND_SYMD.substring(0, 4));
		int month = Integer.parseInt(kYSND_SYMD.substring(4, 6));
		int day = Integer.parseInt(kYSND_SYMD.substring(6, 8));

		return (year < 1900 || year > currentYear || month < 1 || month > 12 || day < 1 || day > 31) ? true : false;
	}
	public static boolean isInvalidDateFormat(String kYSND_SYMD){
		kYSND_SYMD = chuanHoa(kYSND_SYMD);
		String regex = "[0-9]+";
		return (kYSND_SYMD.matches(regex)&&kYSND_SYMD.length()==8) ? false : true;
	}
}
