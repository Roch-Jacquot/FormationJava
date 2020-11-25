package fr.eql.ai108.tpserie.ihm;

/////
/////  NOTE : remplacer testPANEL
/////


import fr.eql.ai108.tpserie.model.Serie;
import fr.eql.ai108.tpserie.model.SerieDao;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class TablePanel extends AnchorPane {
	
	private SerieDao dao = new SerieDao();
	
	private ObservableList<Serie> observableSerie = FXCollections.observableArrayList(dao.getAll());
	
	private TableView<Serie> tableView;

	public TablePanel() {
		super();
		tableView = new TableView<Serie>(observableSerie);
		TableColumn<Serie, String> colTitre = new TableColumn<Serie, String>("Titre");
		colTitre.setCellValueFactory(new PropertyValueFactory<Serie, String>("titre"));
		TableColumn<Serie, Integer> colSaison = new TableColumn<Serie, Integer>("Nombre de Saisons");
		colSaison.setCellValueFactory(new PropertyValueFactory<Serie, Integer>("nbSaison"));
		TableColumn<Serie, Integer> colDiffusion = new TableColumn<Serie, Integer>("Annee de Diffusion");
		colDiffusion.setCellValueFactory(new PropertyValueFactory<Serie, Integer>("anneeDiffusion"));
		TableColumn<Serie, String> colProd = new TableColumn<Serie, String>("Maison de Production");
		colProd.setCellValueFactory(new PropertyValueFactory<Serie, String>("maisonProduction"));
		TableColumn<Serie, String> colEval = new TableColumn<Serie, String>("Evaluation");
		colEval.setCellValueFactory(new PropertyValueFactory<Serie, String>("evaluation"));
		
		
		tableView.getColumns().addAll(colTitre, colSaison, colDiffusion, colProd, colEval);
		tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		this.getChildren().add(tableView);
		this.setPrefSize(700, 200);
		AnchorPane.setTopAnchor(tableView, 5.);
		AnchorPane.setBottomAnchor(tableView, 5.);
		AnchorPane.setRightAnchor(tableView, 5.);
		AnchorPane.setLeftAnchor(tableView, 5.);
		
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Serie>() {

			@Override
			public void changed(ObservableValue<? extends Serie> observable, Serie oldValue, Serie newValue) {
				MainPanel root = (MainPanel) getScene().getRoot();
				LeftPanel leftPanel = root.getLeftPanel();
				leftPanel.getTfTitre().setText(newValue.getTitre());
				leftPanel.getTfNbSaison().setText(String.valueOf(newValue.getNbSaison()));
				leftPanel.getTfAnneeDiffusion().setText(String.valueOf(newValue.getAnneeDiffusion()));/*
				for(String str : leftPanel.getCbMaisonProduction().getItems()) {
					
					if(str.startsWith(newValue.getMaisonProduction())) {
						leftPanel.getCbMaisonProduction().getSelectionModel().select(str);
					}
				}*/
				leftPanel.getCbMaisonProduction().getSelectionModel().select(newValue.getMaisonProduction());
				
				switch (newValue.getEvaluation()) {
				case "Pas Bien":
					leftPanel.rbPasBien.setSelected(true);
					break;
				case "Moyen":
					leftPanel.rbMoyen.setSelected(true);
					break;
				case "Bien":
					leftPanel.rbBien.setSelected(true);
					break;
				case "Excellent":
					leftPanel.rbExcellent.setSelected(true);
					break;
					/*
				default:
					break;*/
				}
				
				
				
			}
		});
		
		
		// TODO Auto-generated constructor stub
	}

	public SerieDao getDao() {
		return dao;
	}

	public void setDao(SerieDao dao) {
		this.dao = dao;
	}

	public ObservableList<Serie> getObservableSerie() {
		return observableSerie;
	}

	public void setObservableSerie(ObservableList<Serie> observableSerie) {
		this.observableSerie = observableSerie;
	}

	public TableView<Serie> getTableView() {
		return tableView;
	}

	public void setTableView(TableView<Serie> tableView) {
		this.tableView = tableView;
	}
	
	
	

}
