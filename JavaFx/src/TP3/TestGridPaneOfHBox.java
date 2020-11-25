package TP3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestGridPaneOfHBox extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane calculatrice = new GridPane();
		
		HBox h0 = new HBox();
		HBox h1 = new HBox();
		HBox h2 = new HBox();
		HBox h3 = new HBox();
		HBox h4 = new HBox();
		HBox h5 = new HBox();

		TextField tf = new TextField();
		Button btnC = new Button("C");
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");
		Button btn0 = new Button("0");
		
		Button btnPlus = new Button("+");
		Button btnMinus = new Button("-");
		Button btnDivide = new Button("/");
		Button btnMultiply = new Button("*");
		Button btnDecimal = new Button(".");
		Button btnNegative = new Button("+/-");
		Button btnLeftParenthesis = new Button("(");
		Button btnRightParenthesis = new Button(")");
		Button btnEqual = new Button("=");

		
		h0.getChildren().addAll(tf, btnC);
		
		h1.getChildren().addAll(btn1, btn2, btn3, btnPlus);
		h1.setStyle("-fx-font-size: 15pt;");
		h2.getChildren().addAll(btn4, btn5, btn6, btnMinus);
		h2.setStyle("-fx-font-size: 15pt;");
		h3.getChildren().addAll(btn7, btn8, btn9, btnDivide);
		h3.setStyle("-fx-font-size: 15pt;");
		h4.getChildren().addAll(btnNegative, btn0, btnDecimal, btnMultiply);
		h4.setStyle("-fx-font-size: 15pt;");
		h5.getChildren().addAll(btnLeftParenthesis, btnRightParenthesis, btnEqual);
		h5.setStyle("-fx-font-size: 15pt;");
		
		calculatrice.addColumn(0, h0, h1, h2, h3, h4, h5);
		
		Scene scene = new Scene(calculatrice);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		launch(args);

	}

}
