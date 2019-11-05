package Räknare;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Räknare extends Application implements EventHandler<ActionEvent> {	
	ArrayList<Button> numpad;

	Stage stage;
	VBox Layout;
	Scene scene;
	GridPane gridPane;
	TextField textfield;
		
	Button slider;
	int rowIndex;
	int columnIndex;
	String e;
	
	String a;

	double nummer1;
	double nummer2;
	double sum;
	
	String num2;
	String num;
	String mid;
	int jeff;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		numpad = new ArrayList<Button>();
				
		MakeButton();

		gridPane = new GridPane();
		gridPane.setPadding(new Insets(0));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		
		TextField textfield = new TextField();
		textfield.setEditable(false);
		textfield.setStyle("-fx-background-color: white;"
						+"-fx-border-width: 1px;"
						+ "-fx-border-color: black;");
		textfield.setAlignment(Pos.CENTER_RIGHT);
		
		ShowButton();
		
		Layout = new VBox();
		Layout.getChildren().add(textfield);
		Layout.getChildren().add(gridPane);

		scene = new Scene(Layout, 250, 220);
	    stage.setResizable(false);
		stage.setScene(scene);	
		stage.show();
	}	

	public void math() {
		if(jeff == 0){
			if (num == null){
				num = a;

			}
			else 
			{
				num += a;
			}
			nummer1 = Integer.valueOf(num);
			System.out.println(nummer1);

		}
			else if(jeff != 0)
			{
				if (num2 == null){
					num2 = a;
				}
				else 
				{
					num2 += a;
			}
			nummer2 = Integer.valueOf(num2);
			System.out.println(nummer2);
			}
	}	
	
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()==numpad.get(8)){
			a = "1";
			math();
		}
		else if(event.getSource()==numpad.get(9)){
			a = "2";
			math();
		}
		else if(event.getSource()==numpad.get(10)){
			a = "3";
			math();
		}
		else if(event.getSource()==numpad.get(4)){
			a = "4";
			math();
		}
		else if(event.getSource()==numpad.get(5)){
			a = "5";
			math();
		}
		else if(event.getSource()==numpad.get(6)){
			a = "6";
			math();
		}
		else if(event.getSource()==numpad.get(0)){
			a = "7";
			math();
		}
		else if(event.getSource()==numpad.get(1)){
			a = "8";
			math();
		}
		else if(event.getSource()==numpad.get(2)){
			a ="9";
			math();
		}
		else if(event.getSource()==numpad.get(13)){
			a = "0";
			math();
			}
		
		else if (event.getSource() == numpad.get(11)){
			jeff = 1;
			if (num != null) {
				mid = "+";
			}
		}
		else if (event.getSource() == numpad.get(7)){
			jeff = 2;
			if (num != null) {
				mid = "-";
			}
		}
		else if (event.getSource() == numpad.get(3)){
			jeff = 3;
			if (num != null) {
				mid = "*";			
			}
		}
		else if (event.getSource() == numpad.get(14)){
			jeff = 4;
			if (num != null) {
				mid = "/";
			}
		}
		
		else if (event.getSource() == numpad.get(15)){
			if(jeff == 1) {
				add Addition = new add();
				sum = Addition.tal(nummer1, nummer2);
			}
			else if(jeff == 2)
			{
				sub Subtraction = new sub();
				sum = Subtraction.tal(nummer1, nummer2);
			}
			else if(jeff == 3)
			{
				mult Multiplication = new mult();
				sum = Multiplication.tal(nummer1, nummer2);
			}
			else if(jeff == 4)
			{
				div Division = new div();
				sum = Division.tal(nummer1, nummer2);
			}
			System.out.println(sum);
			jeff = 0;
			num = "";
			num2 = "";
		}
	}
	
	private void ShowButton() {
		int buttonIndex = 0;
		for(int rowIndex = 0; rowIndex < 4; rowIndex++){
			for(int columnIndex = 0; columnIndex < 4; columnIndex++) {
				gridPane.add(numpad.get(buttonIndex), columnIndex, rowIndex);
				buttonIndex++;
				if (buttonIndex == numpad.size()) {
					break;
			}
		}
	}
}	
	
	private void MakeButton() {
		char[] greg = {'7','8','9','*',
				       '4','5','6','-',
				       '1','2','3','+',
				       'C','0','/','='};
		
		for(char craig : greg) {
			String blegg = craig + "";
			Button slider = new Button(blegg);
			slider.setId(blegg);
			slider.setOnAction(this);
			slider.setStyle(
				  "-fx-background-color: white;"
				  + "-fx-text-fill: black;"
				  + "-fx-font-size: 20px;");
			slider.setPrefHeight(45);
			slider.setPrefWidth(55);
			numpad.add(slider);
		}
	}
	 
	public static void main(String[] args) {
		launch();
	}
}