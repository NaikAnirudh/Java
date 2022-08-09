package com.java.training.filehandling;

import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.zip.GZIPOutputStream;
import java.io.*;
/**
 * Using a existing file to conduct various methods on it.
 */
public class CopyFile {
	public static void main(String[] args) throws IOException {

		File f1 = new File("D:\\files\\g1.txt");
		File f2 = new File("D:\\files\\copy.txt");
		File f3 = new File("D:\\files\\copy1.txt");
        /**
         * Using .copy() to copy one file to another via a specified path.
         */
		Files.copy(f1.toPath(), f2.toPath());

		BufferedReader bufferr1 = new BufferedReader(new FileReader("D:\\files\\copy.txt"));

		String Details = null;
		while ((Details = bufferr1.readLine()) != null) {
			System.out.println(Details);
		}
		bufferr1.close();

		/**
		 * Converts given file path to object.
		 */
		Path source = Paths.get("D:\\files\\copy.txt");
		Path target = Paths.get("D:\\files\\copy.txt.gz");

		/**
		 * Using .notExists() to check the existence of the given file. 
		 */
		if (Files.notExists(source)) {
			System.out.println("Invalid Path provided!!!");
			return;
		}
		/**
		 * Using Custom method(compressGzip(source, target);)  to pass the path of the files.
		 */
		CopyFile.compressGzip(source, target);
		
		/**
		 * Using .delete() to delete the given file.
		 */
		if (f1.delete()) {
			System.out.println(f1.getName() + "    File deleted Successfully!!");

		} else {
			System.out.println("Failed to delete the file!!");
		}
		
		/**
		 * Using SimpleDateFormat class to use .format() to get the value returned by .lastModified() in the specified format.
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Last Modified Date: " + sdf.format(f2.lastModified()));
		
		
		/**
		 * Using .setReadOnly() to restrict the Write operations for the specified file.
		 */
		boolean access= f2.setReadOnly();
		if(access==true) {
			System.out.println("Converted file to ReadOnly Successfully!!!");
		}
		else {
			System.out.println("Failed to convert!!!!");
		}
		
		/**
		 * Using the .isHidden() to check if the file is Hidden or not.
		 */
		if(f3.isHidden()){
    		System.out.println("The specified file is hidden");
    	}else{
    		System.out.println("The specified file is not hidden");
    	}
	}

	/**
	 * Writing the method definition of the custom method(compressGzip)
	 */
	private static void compressGzip(Path source, Path target) throws IOException {

		try (GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream(target.toFile()));
				FileInputStream fis = new FileInputStream(source.toFile())) {
			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) > 0) {
				gos.write(buffer, 0, len);
			}
		}
		System.out.println("File Compressed successfully!!! ");

	}

}

/*
 * OUTPUT:
 * hello
File has been created successfully
g1.txt    File deleted Successfully!!
Last Modified Date: 09/08/2022 12:06:34
Converted file to ReadOnly Successfully!!!
The specified file is hidden
 */
