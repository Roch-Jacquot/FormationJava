package tp2;

import javafx.scene.layout.BorderPane;

public class MainPanel extends BorderPane {

	private PanelColour panelcolour = new PanelColour();
	private PanelButton panelButton = new PanelButton();
	
	public MainPanel() {
		this.setTop(panelButton);
		this.setLeft(panelcolour);
		
		//this.setStyle("-fx-background-color: teal");
	}
	
	

	public PanelColour getPanelcolour() {
		return panelcolour;
	}

	public void setPanelcolour(PanelColour panelcolour) {
		this.panelcolour = panelcolour;
	}

	public PanelButton getPanelButton() {
		return panelButton;
	}

	public void setPanelButton(PanelButton panelButton) {
		this.panelButton = panelButton;
	}
	
	
	
	
	
	
}
