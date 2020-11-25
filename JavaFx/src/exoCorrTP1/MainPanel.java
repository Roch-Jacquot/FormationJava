package exoCorrTP1;

import javafx.scene.layout.BorderPane;

public class MainPanel extends BorderPane {
	
	private ButtonPanel buttonPanel = new ButtonPanel();
	private LabelPanel labelPanel = new LabelPanel();
	
	public MainPanel() {
		this.setTop(buttonPanel);
		this.setLeft(labelPanel);
		
		this.setStyle("-fx-background-color: teal");
	}
	
	
	public ButtonPanel getButtonPanel() {
		return buttonPanel;
	}
	public void setButtonPanel(ButtonPanel buttonPanel) {
		this.buttonPanel = buttonPanel;
	}
	public LabelPanel getLabelPanel() {
		return labelPanel;
	}
	public void setLabelPanel(LabelPanel labelPanel) {
		this.labelPanel = labelPanel;
	}

}
