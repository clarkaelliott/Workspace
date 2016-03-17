package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.*;
import java.util.Scanner;

public class IOExample {
	
	public static void main(String[] args) throws IOException {
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		FileWriter saveOut = null;
		
		//if (Paths.get("res/save.txt") == null);
		
		Path saveFile = Paths.get("res/save.txt");
		try {
		    // Create the empty file with default permissions, etc.
		    Files.createFile(saveFile);
		} catch (FileAlreadyExistsException x) {
		    System.err.format("file named %s" +
		        " already exists%n", saveFile);
		} catch (IOException x) {
		    // Some other sort of failure, such as permissions.
		    System.err.format("createFile error: %s%n", x);
		}
			
		
		
		try {
			inputStream = new FileReader("res/save.txt");
			saveOut = new FileWriter("res/save.txt");
			outputStream = new FileWriter("test_output.txt");
			
			int c;
			while ( (c = inputStream.read() ) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				//inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
		
		File saveGame = new File("res/save.txt");
		Scanner sc = new Scanner(saveGame);
		
		saveOut.write("Clark 3 69 1337");
		saveOut.close();

		char[] cbuf = new char[11];
		inputStream.read(cbuf);
		for (int i = 0; i < cbuf.length; i++)
			System.out.print(cbuf[i]);
		System.out.println("\nFinished Reading");
		inputStream.close();
		
		String myString = sc.nextLine();
		String[] saveInfo = myString.split(" ");
		
		System.out.println(myString);
		for (int i = 0; i < saveInfo.length; i++)
			System.out.println(saveInfo[i]);
		
		Player player = new Player(saveInfo);
		//System.out.println(sc.nextLine());
		player.printStats();
		
		
		
		
	}

}
