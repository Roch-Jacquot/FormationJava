package fr.eql.ai108.tpserie.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerieDao {
	
	private File file = new File("serie.csv");
	
	private Serie stringToSerie(String ligne) {
		String[] infos = ligne.split(";");
		Serie serie = new Serie(infos[0], Integer.parseInt(infos[1]), Integer.parseInt(infos[2]), infos[3], infos[4]);
		
		return serie;
	}
	
	public List<Serie> getAll(){
		
		//instancier une liste de series
		List<Serie> series = new ArrayList<Serie>();
		
		//Lire chacune des lignes du fichier CSV
		
		FileReader in = null;
		BufferedReader br = null;
		
		try {
			in = new FileReader(file);
			br = new BufferedReader(in);
			
			String ligne = "";
			//Pour chacune de ces lignes on va instancier un objet
			while((ligne = br.readLine()) != null) {
				//TRansformer chaque ligne en objet Serie
				Serie serie = stringToSerie(ligne);
				//on ajoute l.objet à la liste
				series.add(serie);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Pour chacune de ces lignes, on instancie un objet Serie
		
		//ON ajoute l'object Serie à la liste
		
		//Puis on retourne à la liste
		
		return series;
	}
	
	public void addSerie(String titre, int nbSaison, int anneeDiffusion, String maisonProduction, String evaluation) {
		
		FileWriter out = null;
		BufferedWriter bw = null;
		
		try {
			out = new FileWriter(file, true);
			bw = new BufferedWriter(out);
			bw.newLine();
			bw.write(titre + ";" + nbSaison + ";" + anneeDiffusion + ";" + maisonProduction + ";" + evaluation);
			
			
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
	
	/*
	public void removeSerie() {
		FileWriter out = null;
		BufferedWriter bw = null;
		
		try {
			out = new FileWriter(file, true);
			bw = new BufferedWriter(out);
			bw.newLine();
			bw.write(titre + ";" + nbSaison + ";" + anneeDiffusion + ";" + maisonProduction + ";" + evaluation);
			
			
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
		
	}*/

}
