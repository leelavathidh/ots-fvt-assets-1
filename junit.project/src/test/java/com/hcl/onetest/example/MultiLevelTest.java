/************************************************************************
* Licensed Materials - Property of IBM and/or HCL
* (c) Copyright HCL Technologies Ltd. 2021.  All Rights Reserved.
*
* Note to U.S. Government Users Restricted Rights:
* Use, duplication or disclosure restricted by GSA ADP Schedule
* Contract with IBM Corp.
*************************************************************************/

package com.hcl.onetest.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author julien.canches
 *
 */
class MultiLevelTest {

	@ParameterizedTest
	@ValueSource(strings = {
			"0",
			"9",
			"A",
			"Z",
			"a",
			"z",
			"_",
			"0.0_",
			"a.f",
			"12dhYZ.3D_e5z.51ABe.7yB.z2"
	})
	void validId(String id) {
		assertThat(LtreeIdUtils.isValidLtreeId(id), is(true));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {
			"",
			".3a",
			"dz.",
			"a3,d",
			"25#a2",
			"zx!e",
			"0&0",
			"a~f",
			"12=hYZ.3De5z.51ABe.7yB.z2"
	})
	void invalidId(String id) {
		assertThat(LtreeIdUtils.isValidLtreeId(id), is(false));
	}
	
	@Test
	void checkId() {
		assertThrows(InvalidIdException.class, () -> LtreeIdUtils.checkLtreeId("~"));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {
			"0",
			"9",
			"A",
			"Z",
			"a",
			"z",
			"_",
			"12dhYZ"
	})
	void validSegment(String segment) {
		assertThat(LtreeIdUtils.isValidLtreeSegment(segment), is(true));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {
			"a.b",
			".3a",
			"dz.",
			"a3,d",
			"25#a2",
			"zx!e",
			"0&0",
			"a~f",
			"_._",
			"12=hYZ.3De5z.51ABe.7yB.z2"
	})
	void invalidSegment(String segment) {
		assertThat(LtreeIdUtils.isValidLtreeSegment(segment), is(false));
	}
	
	@Test
	void checkSegment() {
		assertThrows(InvalidIdException.class, () -> LtreeIdUtils.checkLtreeSegment("~"));
	}
	
}
