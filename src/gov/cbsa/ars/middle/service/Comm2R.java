package gov.cbsa.ars.middle.service;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Comm2R {

	public void Comm2RWithoutRsource() {
		RConnection connection = null;

		try {
			/*
			 * Create a connection to Rserve instance running on default port
			 * 6311
			 */
			// connection = new RConnection();
			connection = new RConnection("127.0.0.1", 6311);

			String vector = "c(1,2,3,4)";
			connection.eval("meanVal=mean(" + vector + ")");
			double mean = connection.eval("meanVal").asDouble();
			System.out.println("The mean of given vector is=" + mean);
		} catch (RserveException e) {
			e.printStackTrace();
		} catch (REXPMismatchException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

	public void Comm2RWithRsource(String command) {
		RConnection connection = null;

		try {
			/*
			 * Create a connection to Rserve instance running on default port
			 * 6311
			 */
			// connection = new RConnection();

			// connection = new RConnection("192.168.15.1",6312);
			connection = new RConnection("127.0.0.1", 6313);

			/* Note four slashes (\\\\) is \ in the path */
			// connection.eval("source('E:\\\\CBSA\\\\Myrun1.r')");
			// command = "'E:\\\\CBSA\\\\Myrun1.r'";

			connection.eval(command);

//			connection.eval("source('E:\\\\CBSA\\\\Scheduling Files\\\\170801 PeaceBridge.R')");

//			 connection.eval("source('E:\\\\CBSA\\\\SchedulingFiles\\\\170801PeaceBridge.R')");

			// connection.eval("source('E:\\\\Myrun1.r')");
			 int num1 = 10;
			 int num2 = 80;
			 int sum = connection.eval("myAdd(" + num1 + "," + num2 +
			 ")").asInteger();
			 System.out.println("The sum is=" + sum);

		} catch (RserveException e) {
			e.printStackTrace();
		} 
		catch (REXPMismatchException e) {
			e.printStackTrace();
		} 
		finally {
			connection.close();
		}

	}
}