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
public class InvalidIdException extends RuntimeException {

	private static final long serialVersionUID = -6048995549818141116L;

	public InvalidIdException() {
		super("Invalid ID");
	}
	
}
