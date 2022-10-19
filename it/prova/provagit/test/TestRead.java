package it.prova.provagit.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//test lettura
		File file = new File("C:\\Users\\balra\\Desktop\\ciao.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String string;
		
		while((string = br.readLine()) != null)
			

			System.out.println(string);
		
		//test scrittura ha sovrascritto il testo di prima
		try {
		      FileWriter myWriter = new FileWriter("C:\\Users\\balra\\Desktop\\ciao.txt");
		      myWriter.write("bella a tutti che dite");
		      myWriter.close();
		      System.out.println("Scrittura andata bene");
		    } catch (IOException e) {
		      System.out.println("Test fallito");
		      e.printStackTrace();
		
		    }
	}

}
