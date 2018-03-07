package gov.cbsa.ars.middle.service;

public interface ProcessStatus {
	public enum style {running, ready, pending, failed}
	int getProcessID();
	void putProcessID(int processID);
}
