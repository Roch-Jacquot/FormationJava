package fr.eql.ai108.mvvm;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class DemoComboBox extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox root = new HBox(10);
		
		Button btn = new Button("Valider");
		Label lbl = new Label();
		
		//Pour accéder à notre source de données, on a besoin d'une instance de notre DAO
		PersonnageDAO dao = new PersonnageDAO();
		
		//On instancie une liste observable qui va être bindée à une méthode de notre DAO
		ObservableList<Personnage> observablePersonnages = FXCollections.observableArrayList(dao.getAll());
		
		//On instancie une ComboBox qui va charger notre liste observable
		
		ComboBox<Personnage> cb = new ComboBox<Personnage>(observablePersonnages);
		
		//On formate l.affichage de l'objet dans la combobox
		cb.setConverter(new StringConverter<Personnage>() {
			
			@Override
			public String toString(Personnage pers) {
				
				return String.format("%s %s", pers.getPrenom(), pers.getNom());
			}
			
			@Override
			public Personnage fromString(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		//Texte pas défaut
		cb.setPromptText("Personnages");
		//affichage du numbre max de noms affichés
		cb.setVisibleRowCount(2);
		
		
		root.getChildren().addAll(cb, btn, lbl);
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: teal");
		
		Scene scene = new Scene(root, 700, 100);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.setTitle("Premiere ComboBox");
		primaryStage.show();
		
		
		
		btn.setOnAction(e -> {
			
			Personnage selectedPersonnage = cb.getSelectionModel().getSelectedItem();
			lbl.setText(selectedPersonnage.toString());
			
		});
		
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
