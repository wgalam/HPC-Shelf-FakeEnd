package br.ufc.storm.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHandler {

	/**
	 * This method is used to receive binary files and save into storm library dir
	 * @param data
	 * @param fileName
	 * @return
	 */
	public static boolean addFile(String path, byte[] data) {
		try {
			Path pathToFile = Paths.get(path);
			Files.createDirectories(pathToFile.getParent());
			Files.createFile(pathToFile);
			Files.write(pathToFile, data, StandardOpenOption.WRITE);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	public static byte[] readFile(String pathname) throws IOException {

		Path path = Paths.get(pathname);
		byte[] data = Files.readAllBytes(path);
		return data;
	}
	
	

}
