package fr.eql.ai108.tpserie.ihm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class testPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane root = new BorderPane();
		TablePanel monTest = new TablePanel();
		LeftPanel monLeftPanel = new LeftPanel();
		root.setRight(monTest);
		root.setLeft(monLeftPanel);
		
		
		Scene scene = new Scene(root, 1400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.setTitle("Premier TableView");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
