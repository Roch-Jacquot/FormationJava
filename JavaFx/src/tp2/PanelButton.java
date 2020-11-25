package tp2;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class PanelButton extends HBox {
	
	private Button rouge = new Button("Rouge");
	private Button bleu = new Button("Bleu");
	private Button vert = new Button("Vert");
	private Button orange = new Button("Orange");
	
	
	
	
	public PanelButton() {
		super();
		this.getChildren().addAll(rouge, bleu, vert, orange);
		this.setSpacing(5);
		this.setStyle("-fx-background-color: lightgrey");
		this.setAlignment(Pos.CENTER);
		this.setPrefSize(300, 25);
		
	}
	
	
	public Button getRouge() {
		return rouge;
	}
	public void setRouge(Button rouge) {
		this.rouge = rouge;
	}
	public Button getBleu() {
		return bleu;
	}
	public void setBleu(Button bleu) {
		this.bleu = bleu;
	}
	public Button getVert() {
		return vert;
	}
	public void setVert(Button vert) {
		this.vert = vert;
	}
	public Button getOrange() {
		return orange;
	}
	public void setOrange(Button orange) {
		this.orange = orange;
	}
	
	

}
