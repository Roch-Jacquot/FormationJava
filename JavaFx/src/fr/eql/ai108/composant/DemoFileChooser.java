package fr.eql.ai108.composant;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class DemoFileChooser extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox(5);
		Button btn = new Button("Browse");
		Label lbl = new Label();
		
		root.getChildren().addAll(lbl, btn);
		
		root.setStyle("-fx-background-color: teal");
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 400, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Premier FileChooser");
		primaryStage.sizeToScene();
		primaryStage.show();
		
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				FileChooser filechooser = new FileChooser();
				
				//si je souhaite que l'explorateur de finier s'ouvre à un emplacement précis
				File initDir = new File("C:/Users/formation/Desktop");
				filechooser.setInitialDirectory(initDir);
				//J'ouvre une popup qui permet à l'utilisateur de choisir un fichier
				File f = filechooser.showOpenDialog(primaryStage.getOwner());
				
				//J'affiche dans le label le chemin absolu du fichier selectionné
				if(f != null) {
					lbl.setText(f.getAbsolutePath());
				}
			}
		});

	}

	public static void main(String[] args) {
		launch(args);

	}

}
