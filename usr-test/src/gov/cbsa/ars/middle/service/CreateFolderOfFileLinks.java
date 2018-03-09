package gov.cbsa.ars.middle.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils;

@Deprecated 
public class CreateFolderOfFileLinks {
	private String batchId;
	private String scheduleId;
	private String summaryId;

	public void getBatchId(String batchId) {

	}

	public void createFolderOfFileLinks(String folderName, String[] fileNames) {

		Path folder = Paths.get(folderName);

		// if directory does exists, same batchId situation
		if (Files.exists(folder))
			try {
				FileUtils.deleteDirectory(folder.toFile());
			} catch (IOException e) {
				// fails while try to delete everything under this directory
				e.printStackTrace();

			}

		try {
			Files.createDirectories(folder);
		} catch (IOException e) {
			// fail to create directory
			e.printStackTrace();
		}

		for (String fileName : fileNames) {
			Path linkedFile = Paths.get(folderName + File.separator + fileName);
			// The file that is the origin
			Path currentFile = Paths.get(fileName);

			try {
				// create SymbolicLink
				Files.createSymbolicLink(linkedFile, currentFile);
			} catch (IOException ioe) {
				System.out.println(ioe);
			} catch (UnsupportedOperationException uoe) {
				System.out.println(uoe);
			}
		}
	}

}
