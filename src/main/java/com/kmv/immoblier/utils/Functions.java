package com.kmv.immoblier.utils;
import java.util.Collection;

/**
 * @category : Functions util
 * @author : KOURMOU Omar
 * @see : <kourmou.omar@gmqil.com>
 * @creation : 13/11/21
 * @version : 1.0
 */
public class Functions {
	
	/**
	 * Default Constructor
	 */
	private Functions() {
	}
	
	/**
	 * validate size of String
	 *
	 * @param pStr
	 * @param pSize
	 * @return
	 */
	public static boolean calcSizeString(String pStr, int pMaxSize) {
		boolean vSizeOk = false;
		if (pStr != null && (pStr.length() > Constants.STR_LENGTH_0 && pStr.length() <= pMaxSize)) {
			vSizeOk = true;
		}
		return vSizeOk;
	}
	
	/**
	 * Null-safe check if the specified collection is empty.
	 * <p>
	 * Null returns true.
	 *
	 * @param coll the collection to check, may be null
	 * @return true if empty or null
	 */
	public static boolean isEmpty(Collection<?> coll) {
		return (coll == null || coll.isEmpty());
	}
	
	/**
	 * Null-safe check if the specified collection is not empty.
	 * <p>
	 * Null returns false.
	 *
	 * @param coll the collection to check, may be null
	 * @return true if not empty and null
	 */
	public static boolean isNotEmpty(Collection<?> coll) {
		return !isEmpty(coll);
	}
}
