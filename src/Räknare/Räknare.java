package Räknare;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Räknare extends Application implements EventHandler<ActionEvent> {

	public static void main(String[] args) {
		launch();
		int nummer1 = 0;
		int nummer2 = 0;
		String num = "";
		String num2 = "";
		String mid ="";
		int jeff = 0;
		int sum = 0;
	}
	
	ArrayList<Button> numpad;

	
	Stage stage;
	HBox Layout;
	Scene scene;
	GridPane gridPane;
		
	Button slider;
	int rowIndex;
	int columnIndex;
	
	String a;
	Button ResultB;
	Button MultB;
	Button DivB;
	Button PlusB;
	Button MinusB;
	Button CB;
	
	int nummer1;
	int nummer2;
	int sum;
	
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
			
		ShowButton();

		
		Layout = new HBox();
		Layout.getChildren().add(gridPane);

		scene = new Scene(Layout, 500, 200);
		
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

			}
			else if(jeff == 1)
			{
				if (num2 == null){
					num2 = a;
				}
				else 
				{
					num2 += a;
			}
			nummer2 = Integer.valueOf(num2);
			}
		System.out.println(num);

	}
	
	@Override
	public void handle(ActionEvent event) {		
	 if (event.getSource() == PlusB)
		{
			jeff = 1;
			if (num != null) {
				mid = "+";
			}
		}
		else if (event.getSource() == MinusB)
		{
			jeff = 1;
			if (num != null) {
				mid = "-";
			}
		}
		else if (event.getSource() == MultB)
		{
			jeff = 1;
			if (num != null) {
				mid = "*";			
			}
		}
		else if (event.getSource() == DivB)
		{
			jeff = 1;
			if (num != null) {
				mid = "/";
			}
		}
		else if (event.getSource() == ResultB)
		{
			if(mid == "+") {
				sum = nummer1 + nummer2;
			}
			else if(mid == "-")
			{
				sum = nummer1 - nummer2;
			}
			else if(mid == "/")
			{
				sum = nummer1 / nummer2;
			}
			else if(mid == "*")
			{
				sum = nummer1 * nummer2;
			}
			System.out.println(sum);
			jeff = 0;
			num = "";
			num2 = "";
		}
	}
	
	private void ShowButton() {
		int buttonIndex = 0;
		for(int rowIndex = 0; rowIndex < 3; rowIndex++){
			for(int columnIndex = 0; columnIndex < 3; columnIndex++) {
				gridPane.add(numpad.get(buttonIndex), columnIndex, rowIndex);
				buttonIndex++;
				if (buttonIndex == numpad.size()) {
					break;
			}
		}
	}
}
	
	private void MakeButton() {
		char[] greg = {'1','2','3','4','5','6','7','8','9'};
		for(char craig : greg) {
			String blegg = craig + "";
			Button slider = new Button(blegg);
			slider.setId(blegg);
			slider.setOnAction(this);
		}
		numpad.add(slider);
	}
}