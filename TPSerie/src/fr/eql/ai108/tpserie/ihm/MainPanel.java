package fr.eql.ai108.tpserie.ihm;

import javafx.scene.layout.BorderPane;


public class MainPanel extends BorderPane {
	
	private TablePanel tablePanel = new TablePanel();
	private LeftPanel leftPanel = new LeftPanel();
	
	public MainPanel() {
		this.setRight(tablePanel);
		this.setLeft(leftPanel);
		
		//this.setStyle("-fx-background-color: teal");
	}

	public TablePanel getTablePanel() {
		return tablePanel;
	}

	public void setTablePanel(TablePanel tablePanel) {
		this.tablePanel = tablePanel;
	}

	public LeftPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(LeftPanel leftPanel) {
		this.leftPanel = leftPanel;
	}
	
	

}
