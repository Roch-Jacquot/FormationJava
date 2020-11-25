package fr.eql.ai108.panneau;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DemoHBox extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		
		Button btn1 = new Button("OK");
		
		Button btn2 = new Button("Cancel");
		Button btn3 = new Button("Coucou");
		
		btn1.setTextFill(Color.RED);
		btn1.setStyle("-fx-background-color: teal");
		
		//Donner les boutons à la liste de composants enfants de notre HBox Root
		root.getChildren().addAll(btn1, btn2, btn3);
		
		//Option d'agencement des composants enfants
		root.setAlignment(Pos.CENTER);
		root.setSpacing(30);
		
		Scene scene = new Scene(root, 400, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Premiere HBox");
		primaryStage.sizeToScene();
		primaryStage.show();
		
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
