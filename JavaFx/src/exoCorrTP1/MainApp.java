package exoCorrTP1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		MainPanel root = new MainPanel();
		
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.setTitle("Premiere Application en objet");
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
