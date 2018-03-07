package gov.cbsa.ars.middle.service;

public class Test {

	public static void main(String a[]) {
		Comm2R testComm2R = new Comm2R();
		String command = null;

        testComm2R.Comm2RWithoutRsource();

		command = "source('E:\\\\CBSA\\\\Myrun1.r')";
//		command = "source('C:\\Users\\\\ljpu_2\\Documents\\\\Scheduling Files\\\\170801  PeaceBridge.R')";
		
		testComm2R.Comm2RWithRsource(command);
		testComm2R.Comm2RWithRsource(command);

		// /* Old code */
		// command = "source('E:\\\\CBSA\\\\Myrun1-new.r')";
		// command = "source('E:\\\\CBSA\\\\Scheduling Files\\\\170801
		// PeaceBridge.R')";
		// command = "source('C:\\\\CBSA\\\\Scheduling Files\\\\170801
		// PeaceBridge.R')";
		// Comm2R testComm2R11 = new Comm2R(command);
	}
}