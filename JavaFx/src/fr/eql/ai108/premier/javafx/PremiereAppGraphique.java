package fr.eql.ai108.premier.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PremiereAppGraphique extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		
		//Ob instancie un premier panneau
		Pane root = new Pane();
		//On donne une couleur cyan à notre panneau
		root.setStyle("-fx-background-color:cyan");
		
		//On instancie une scene a laquelle on transmet notre panneau root et des dimensions;
		Scene scene = new Scene(root, 500, 500);

		//On donne notre scene à notre stage
		primaryStage.setScene(scene);
		
		//On souhaite ajouter des elements au panneau root de notre scene
		
		//On instancie un cercle
		Circle cercle = new Circle(75);
		//On donne une couleur à notre cercle
		cercle.setFill(Color.YELLOW);
		//On peut aussi lui donner une couleur de bordure
		cercle.setStroke(Color.ORANGE);
		
		cercle.relocate(50, 50);
		
		
		//on instancie un rectangle
		
		Rectangle rectangle = new Rectangle(500, 150, Color.GREEN);
		rectangle.setStroke(Color.DARKGREEN);
		rectangle.relocate(0, 350);
		
		//On ajoute du texte
		
		Label label = new Label("Dessin de Thibaud");
		label.setTextFill(Color.HOTPINK);
		label.setFont(Font.font("Brush Script MT", 35));
		label.relocate(282, 450);
		
		//On donne notre cercle a la liste de composants enfants de notre panneau root
		root.getChildren().add(cercle);
		root.getChildren().add(rectangle);
		root.getChildren().add(label);
		//Definir la largeur
		//primaryStage.setWidth(1000);
		primaryStage.setMaximized(true);
		
		//le stage s'adapte à la taille de la scene
		primaryStage.sizeToScene();
		
		//interdire à l'user de resize la fenetre
		primaryStage.setResizable(false);
		
		//set titre de fenetre
		primaryStage.setTitle("Ma premiece scene graphique");
		
		
		
		
		
		//On affiche notre stage
		primaryStage.show();
	
	}
	
	
	
	

	public static void main(String[] args) {

		launch(args);

	}



}
