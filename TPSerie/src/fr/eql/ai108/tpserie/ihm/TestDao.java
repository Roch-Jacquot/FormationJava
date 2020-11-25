package fr.eql.ai108.tpserie.ihm;

import java.util.List;

import fr.eql.ai108.tpserie.model.Serie;
import fr.eql.ai108.tpserie.model.SerieDao;

public class TestDao {

	public static void main(String[] args) {
		SerieDao dao = new SerieDao();
		
		List<Serie> series = dao.getAll();
		
		System.out.println(series);
		
		
		dao.addSerie("toto", 15, 1555, "Zoro Inc", "Bien");
		dao.addSerie("titi", 15, 1555, "Zoro Inc", "Bien");
		series = dao.getAll();
		System.out.println(series);
		

	}

}
