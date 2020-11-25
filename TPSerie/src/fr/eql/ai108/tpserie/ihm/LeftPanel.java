package fr.eql.ai108.tpserie.ihm;

import fr.eql.ai108.tpserie.model.Serie;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LeftPanel extends VBox {
	
	//private SerieDao dao = new SerieDao();
	
	private HBox box1 = new HBox(10);
	private Label lblTitre = new Label("Titre");
	private TextField tfTitre = new TextField();
	private Label lblNbSaison = new Label("Nombre de saisons");
	private TextField tfNbSaison = new TextField();
	
	private HBox box2 = new HBox(10);
	private Label lblAnneeDiffusion = new Label("Année de Diffusion");
	private TextField tfAnneeDiffusion = new TextField();
	private Label lblMaisonProduction = new Label("Maison de Production");
	//private TextField tfMaisonProduction = new TextField();
	private ChoiceBox<String> cbMaisonProduction = new ChoiceBox<String>();
	
	
	
	private HBox box3 = new HBox(10);
	private Label lblEvaluation = new Label("Evaluation");
	//private TextField tfEvaluation = new TextField();
	RadioButton rbPasBien = new RadioButton("Pas Bien");
	RadioButton rbMoyen = new RadioButton("Moyen");
	RadioButton rbBien = new RadioButton("Bien");
	RadioButton rbExcellent = new RadioButton("Excellent");
	
	private ToggleGroup grp = new ToggleGroup();
	
	//PasBien, Moyen, Bien; Excellent
	
	
	
	private HBox box4 = new HBox(10);
	private Button btnSave = new Button("Enregistrer et noter une série télévisée");
	private Button btnUpdate = new Button("Mettre à jour une série télévisée");
	private Button btnRemove = new Button("Effacer une série télévisée");
	
	
	
	
	private int tailleTotaleEspace = 700;
	
	
	
	public LeftPanel() {
		lblTitre.setPrefWidth(tailleTotaleEspace/2);
		tfTitre.setPrefWidth(tailleTotaleEspace/2);
		lblNbSaison.setPrefWidth(tailleTotaleEspace/2);
		tfNbSaison.setPrefWidth(tailleTotaleEspace/2);
		lblAnneeDiffusion.setPrefWidth(tailleTotaleEspace/2);
		tfAnneeDiffusion.setPrefWidth(tailleTotaleEspace/2);
		lblMaisonProduction.setPrefWidth(tailleTotaleEspace/2);
		cbMaisonProduction.setPrefWidth(tailleTotaleEspace/2);
		lblEvaluation.setPrefWidth(tailleTotaleEspace/2);
		
		box1.getChildren().addAll(lblTitre, tfTitre, lblNbSaison, tfNbSaison);
		box1.setPadding(new Insets(20, 10, 10, 10));
		box1.setPrefWidth(tailleTotaleEspace);
		box1.setAlignment(Pos.CENTER);
		
		
		//Prepa maison production
		cbMaisonProduction.getItems().addAll("Choisir", "HBO", "Netflix", "Amazon", "BBC", "TF1", "M6");
		cbMaisonProduction.getSelectionModel().select("Choisir");
		
		box2.getChildren().addAll(lblAnneeDiffusion, tfAnneeDiffusion, lblMaisonProduction, cbMaisonProduction);
		box2.setPadding(new Insets(20, 10, 10, 10));
		box2.setPrefWidth(tailleTotaleEspace);
		box2.setAlignment(Pos.CENTER);
		
		
		
		grp.getToggles().addAll(rbPasBien, rbMoyen, rbBien, rbExcellent);
		box3.getChildren().addAll(lblEvaluation, rbPasBien, rbMoyen, rbBien, rbExcellent);
		box3.setPadding(new Insets(20, 10, 10, 10));
		box3.setPrefWidth(tailleTotaleEspace);
		box3.setAlignment(Pos.BASELINE_LEFT);

		
		box4.getChildren().addAll(btnSave, btnUpdate, btnRemove);
		box4.setPadding(new Insets(20, 10, 10, 10));
		box4.setPrefWidth(tailleTotaleEspace);
		box4.setAlignment(Pos.CENTER);
		
		
		
		
		this.getChildren().addAll(box1, box2, box3, box4);
		//this.setAlignment(Pos.CENTER);
		this.setStyle("-fx-background-color: teal"); //temporaire/Test
		this.setWidth(700);
		
		
		btnSave.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {

				
				String titre = tfTitre.getText();
				int nbSaison = Integer.parseInt(tfNbSaison.getText());
				int anneDiff = Integer.parseInt(tfAnneeDiffusion.getText());
				String maisonProduction = cbMaisonProduction.getSelectionModel().getSelectedItem();
				String eval = "";
				if(rbPasBien.isSelected()) {
					eval = rbPasBien.getText();
				} else if(rbMoyen.isSelected()) {
					eval = rbPasBien.getText();
				} else if(rbPasBien.isSelected()) {
					eval = rbPasBien.getText();
				} else if(rbExcellent.isSelected()) {
					eval = rbExcellent.getText();
				}
				
				MainPanel root = (MainPanel) getScene().getRoot();
				TablePanel tablePanel = root.getTablePanel();
				
				Serie serie = new Serie(titre, nbSaison, anneDiff, maisonProduction, eval);
				
				tablePanel.getObservableSerie().add(serie);
				tablePanel.getDao().addSerie(titre, nbSaison, anneDiff, maisonProduction, eval);

				
			}
		});
		
		
	}



	public HBox getBox1() {
		return box1;
	}



	public void setBox1(HBox box1) {
		this.box1 = box1;
	}



	public Label getLblTitre() {
		return lblTitre;
	}



	public void setLblTitre(Label lblTitre) {
		this.lblTitre = lblTitre;
	}



	public TextField getTfTitre() {
		return tfTitre;
	}



	public void setTfTitre(TextField tfTitre) {
		this.tfTitre = tfTitre;
	}



	public Label getLblNbSaison() {
		return lblNbSaison;
	}



	public void setLblNbSaison(Label lblNbSaison) {
		this.lblNbSaison = lblNbSaison;
	}



	public TextField getTfNbSaison() {
		return tfNbSaison;
	}



	public void setTfNbSaison(TextField tfNbSaison) {
		this.tfNbSaison = tfNbSaison;
	}



	public HBox getBox2() {
		return box2;
	}



	public void setBox2(HBox box2) {
		this.box2 = box2;
	}



	public Label getLblAnneeDiffusion() {
		return lblAnneeDiffusion;
	}



	public void setLblAnneeDiffusion(Label lblAnneeDiffusion) {
		this.lblAnneeDiffusion = lblAnneeDiffusion;
	}



	public TextField getTfAnneeDiffusion() {
		return tfAnneeDiffusion;
	}



	public void setTfAnneeDiffusion(TextField tfAnneeDiffusion) {
		this.tfAnneeDiffusion = tfAnneeDiffusion;
	}



	public Label getLblMaisonProduction() {
		return lblMaisonProduction;
	}



	public void setLblMaisonProduction(Label lblMaisonProduction) {
		this.lblMaisonProduction = lblMaisonProduction;
	}






	public ChoiceBox<String> getCbMaisonProduction() {
		return cbMaisonProduction;
	}



	public void setCbMaisonProduction(ChoiceBox<String> cbMaisonProduction) {
		this.cbMaisonProduction = cbMaisonProduction;
	}



	public HBox getBox3() {
		return box3;
	}



	public void setBox3(HBox box3) {
		this.box3 = box3;
	}



	public Label getLblEvaluation() {
		return lblEvaluation;
	}

	public void setLblEvaluation(Label lblEvaluation) {
		this.lblEvaluation = lblEvaluation;
	}


	public RadioButton getRbPasBien() {
		return rbPasBien;
	}



	public void setRbPasBien(RadioButton rbPasBien) {
		this.rbPasBien = rbPasBien;
	}



	public RadioButton getRbMoyen() {
		return rbMoyen;
	}



	public void setRbMoyen(RadioButton rbMoyen) {
		this.rbMoyen = rbMoyen;
	}



	public RadioButton getRbBien() {
		return rbBien;
	}



	public void setRbBien(RadioButton rbBien) {
		this.rbBien = rbBien;
	}



	public RadioButton getRbExcellent() {
		return rbExcellent;
	}



	public void setRbExcellent(RadioButton rbExcellent) {
		this.rbExcellent = rbExcellent;
	}



	public HBox getBox4() {
		return box4;
	}



	public void setBox4(HBox box4) {
		this.box4 = box4;
	}



	public Button getBtnSave() {
		return btnSave;
	}



	public void setBtnSave(Button btnSave) {
		this.btnSave = btnSave;
	}



	public Button getBtnUpdate() {
		return btnUpdate;
	}



	public void setBtnUpdate(Button btnUpdate) {
		this.btnUpdate = btnUpdate;
	}



	public Button getBtnRemove() {
		return btnRemove;
	}



	public void setBtnRemove(Button btnRemove) {
		this.btnRemove = btnRemove;
	}



	public int getTailleTotaleEspace() {
		return tailleTotaleEspace;
	}



	public void setTailleTotaleEspace(int tailleTotaleEspace) {
		this.tailleTotaleEspace = tailleTotaleEspace;
	}
	
	

	
	
	

}
