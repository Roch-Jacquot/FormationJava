package tp2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Resultat extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		MainPanel root = new MainPanel();
		
		Scene scene = new Scene(root, 300, 500);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.setTitle("Mon test");
		primaryStage.show();
		
		
		root.getPanelButton().getRouge().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				root.getPanelcolour().setStyle("-fx-background-color: red");
				
			}
		});
		root.getPanelButton().getBleu().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				root.getPanelcolour().setStyle("-fx-background-color: blue");
				
			}
		});
		root.getPanelButton().getVert().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				root.getPanelcolour().setStyle("-fx-background-color: green");
				
			}
		});
		root.getPanelButton().getOrange().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				root.getPanelcolour().setStyle("-fx-background-color: orange");
				
			}
		});
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
