package gov.cbsa.ars.middle.test;

import gov.cbsa.ars.middle.service.Comm2R;

public class Test4Comm2R {

	public static void main(String a[]) {
		Comm2R testComm2R = new Comm2R();
		String command = null;

		testComm2R.Comm2RWithoutRsource();

		command = "source('/usr/local/ars-share/Rsource/Myrun1.r')"; // External
																		// R
																		// Linux
																		// version
		//
		// Alex beginning testing of calling Optimize

		// command = "source('/usr/local/ars-share/Myrun2.r')"; // External
		// // R
		// // Linux
		// // version
		//
		testComm2R.Comm2RWithRsource(command);

	}
}