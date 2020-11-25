package fr.eql.ai108.transition;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class SecondPan extends HBox {
	private Label lbl = new Label("TRansition reussie");

	public SecondPan() {
		super();
		this.setPrefSize(400, 200);
		this.setAlignment(Pos.CENTER);
		this.setStyle("-fx-background-color: teal");
		lbl.setTextFill(Color.WHITE);
		this.getChildren().add(lbl);
	}

	public Label getLbl() {
		return lbl;
	}

	public void setLbl(Label lbl) {
		this.lbl = lbl;
	}
	


}
