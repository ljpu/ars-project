package gov.cbsa.ars.middle.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import gov.cbsa.ars.middle.service.Folder;

public class CreateDirectoryExample {

	static String homeDir = "/home/leop";

	public static void main(String[] args) {

//		Path path = Paths.get("C:\\Directory2\\Sub2\\Sub-Sub2");
//		Path path = Paths.get("/home/leop/Downloads/Directory2/Sub2/Sub-Sub2");
//
//		// if directory exists?
//		if (!Files.exists(path)) {
//			try {
//				Files.createDirectories(path);
//			} catch (IOException e) {
//				// fail to create directory
//				e.printStackTrace();
//			}
//		}
//
//	}
//	
	String folderName = homeDir + File.separator + "try" + File.separator + "nextLevel9";
	String[] FileLinkList = {"a", "b", "c","d"};
	
	Folder folder = new Folder();
	folder.createFolderOfFileLinks(folderName,  FileLinkList);
}
}
