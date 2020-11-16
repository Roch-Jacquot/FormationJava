package fr.eql.ai108.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("c:/DossierAI108/testFW.txt", true);
			fw.write("Hello AI108 \r \n");
			fw.write(42);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileWriter out = null;
		
		BufferedWriter bw = null;
		
		try {
			//De façon général, le BufferedWriter fait la même chose que le FileWriter, mais est plus performant et possède plus de méthodes utilitaires
			out = new FileWriter("c:/DossierAI108/testBufferWriter.txt", true);
			bw = new BufferedWriter(out);
			bw.write("Hello AI108");
			bw.newLine();
			bw.write(42);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
