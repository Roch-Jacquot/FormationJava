package TP3;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculatrice extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane calculatrice = new GridPane();
		GridPane top = new GridPane();
		GridPane bottom = new GridPane();

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
		
		
		
		//ajout dans mes machins
		top.addRow(0, tf, btnC);
		
		bottom.addRow(0, btn1, btn2, btn3, btnPlus);
		bottom.addRow(1, btn4, btn5, btn6, btnMinus);
		bottom.addRow(2, btn7, btn8, btn9, btnDivide);
		bottom.addRow(3, btnNegative, btn0, btnDecimal, btnMultiply);
		bottom.addRow(4, btnLeftParenthesis, btnRightParenthesis, btnEqual);
		
		bottom.setStyle("-fx-font-size: 15pt;");
		
		calculatrice.addColumn(0, top, bottom);
		
		
		
		/*calculatrice.addRow(0, tf, btnC);
		calculatrice.addRow(1, btn1, btn2, btn3, btnPlus);
		calculatrice.addRow(2, btn4, btn5, btn6, btnMinus);
		calculatrice.addRow(3, btn7, btn8, btn9, btnDivide);
		calculatrice.addRow(4, btnNegative, btn0, btnDecimal, btnMultiply);
		calculatrice.addRow(5, btnLeftParenthesis, btnRightParenthesis, btnEqual);*/
		//calculatrice.add(child, columnIndex, rowIndex, colspan, rowspan);
		Scene scene = new Scene(calculatrice);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				tf.setText(tf.getText() + btn1.getText());
				
			}
		});
		btn2.setOnAction((event) -> tf.setText(tf.getText() + btn2.getText()));
		btn3.setOnAction((event) -> tf.setText(tf.getText() + btn3.getText()));
		btn4.setOnAction((event) -> tf.setText(tf.getText() + btn4.getText()));
		btn5.setOnAction((event) -> tf.setText(tf.getText() + btn5.getText()));
		btn6.setOnAction((event) -> tf.setText(tf.getText() + btn6.getText()));
		btn7.setOnAction((event) -> tf.setText(tf.getText() + btn7.getText()));
		btn8.setOnAction((event) -> tf.setText(tf.getText() + btn8.getText()));
		btn9.setOnAction((event) -> tf.setText(tf.getText() + btn9.getText()));
		btn0.setOnAction((event) -> tf.setText(tf.getText() + btn0.getText()));
		btnPlus.setOnAction((event) -> tf.setText(tf.getText() + btnPlus.getText()));
		btnMinus.setOnAction((event) -> tf.setText(tf.getText() + btnMinus.getText()));
		btnDivide.setOnAction((event) -> tf.setText(tf.getText() + btnDivide.getText()));
		btnMultiply.setOnAction((event) -> tf.setText(tf.getText() + btnMultiply.getText()));
		btnC.setOnAction((event) -> tf.setText(""));
		btnDecimal.setOnAction((event) -> tf.setText(tf.getText() + btnDecimal.getText()));
		btnLeftParenthesis.setOnAction((event) -> tf.setText(tf.getText() + btnLeftParenthesis.getText()));
		btnRightParenthesis.setOnAction((event) -> tf.setText(tf.getText() + btnRightParenthesis.getText()));
		
		btnNegative.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				char[] temp = tf.getText().toCharArray();
				if(temp[0] == '-') {
					tf.setText(tf.getText().substring(1));
				} else {
					tf.setText("-" + tf.getText());
				}
				
				
			}
		});
		
		btnEqual.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				ScriptEngineManager manager = new ScriptEngineManager();
				ScriptEngine engine = manager.getEngineByName("js");
				
				try {
					Object result = engine.eval(tf.getText());
					tf.setText(result.toString());
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		
		/*
		Button btnNegative = new Button("+/-");
		Button btnEqual = new Button("=");
		 */
		
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
