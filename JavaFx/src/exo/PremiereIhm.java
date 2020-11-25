package exo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PremiereIhm extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {


		BorderPane root = new BorderPane();
		
		HBox topPanel = new HBox();
		VBox leftPanel = new VBox();
//		Pane panelVide = new Pane();
		
		root.setStyle("-fx-background-color: teal");
		
		//Specifications du topPanel
		topPanel.setPrefSize(700, 100);
		topPanel.setStyle("-fx-background-color: red");
		Button btn1 = new Button("Bouton 1");
		Button btn2 = new Button("Bouton 2");
		Button btn3 = new Button("Bouton 3");
		Button btn4 = new Button("Bouton 4");
		topPanel.getChildren().addAll(btn1, btn2, btn3, btn4);
		topPanel.setAlignment(Pos.CENTER);
		topPanel.setSpacing(50);
		
		
		//Spec left Panel
		
		leftPanel.setPrefSize(100, 400);
		leftPanel.setStyle("-fx-background-color: darkgreen");
		
		Label lab1 = new Label("label 1");
		Label lab2 = new Label("label 2");
		Label lab3 = new Label("label 3");
		Label lab4 = new Label("label 4");
		leftPanel.getChildren().addAll(lab1, lab2, lab3, lab4);
		leftPanel.setAlignment(Pos.CENTER);
		leftPanel.setSpacing(50);
		
		//x 700
		//y 400
		
		//y 325
		//x 650
		//Spec Panelvide
//		panelVide.setPrefSize(650, 325);
//		panelVide.setStyle("-fx-backgrounf-color: teal");
//		panelVide.relocate(150, 75);
		
		root.setTop(topPanel);
		root.setLeft(leftPanel);
		
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Premier TP");
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
