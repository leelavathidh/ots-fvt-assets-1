/************************************************************************
* Licensed Materials - Property of IBM and/or HCL
* (c) Copyright HCL Technologies Ltd. 2021.  All Rights Reserved.
*
* Note to U.S. Government Users Restricted Rights:
* Use, duplication or disclosure restricted by GSA ADP Schedule
* Contract with IBM Corp.
*************************************************************************/

package com.hcl.onetest.example;

/**
 * @author julien.canches
 *
 */
public class LtreeIdUtils {

	static boolean isValidLtreeSegment(String id) {
		if (id.isEmpty()) return false;
		int len = id.length();
		for(int i = 0; i < len; i++) {
			char c = id.charAt(i);
			if (!(c == '_' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks and returns the same segment it is valid. Throws an exception if it not.
	 * @param segment A non validated segment.
	 * @return The segment if it is valid.
	 * @throws InvalidIdException If the segment is not valid.
	 */
	public static String checkLtreeSegment(String segment) {
		if (isValidLtreeSegment(segment)) return segment;
		throw new InvalidIdException();
	}

	static boolean isValidLtreeId(String id) {
		if (id.isEmpty() || id.startsWith(".") || id.endsWith(".")) return false;
		int len = id.length();
		for(int i = 0; i < len; i++) {
			char c = id.charAt(i);
			if (!(c == '.' || c == '_' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Checks and returns the same id it is valid. Throws an exception if it not.
	 * @param id A non validated id.
	 * @return The id if it is valid.
	 * @throws InvalidIdException If the id is not valid.
	 */
	public static String checkLtreeId(String id) {
		if (isValidLtreeId(id)) return id;
		throw new InvalidIdException();
	}
	
}
