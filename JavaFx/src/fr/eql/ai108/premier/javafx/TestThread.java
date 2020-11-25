package fr.eql.ai108.premier.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class TestThread extends Application{

	public static void main(String[] args) {
		//System.out.println("Thread declenche par la methode main " + Thread.currentThread().getName());
		//Launxg args démarre le thread Javafx
		launch(args);
		
		

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("Thread declenche par la methode start " + Thread.currentThread().getName());
		
	}

}
