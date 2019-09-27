package Räknare;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
	
	Stage stage;
	HBox Layout;
	Scene scene;
	
	
	Button Nill;
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	
	String a;
	
	
	Button ResultB;
	Button MultB;
	Button DivB;
	Button PlusB;
	Button MinusB;

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

		MakeButton();
		GridPane container = grid();

		Layout = new HBox();
		Layout.getChildren().add(container);

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
	public GridPane grid() {
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10)); 
		gridPane.setVgap(5); 
	    gridPane.setHgap(5);
	    gridPane.setAlignment(Pos.CENTER); 
	    
	    gridPane.add(one, 0, 0); 
	    gridPane.add(two, 1, 0);       
	    gridPane.add(three, 2, 0); 
	    gridPane.add(four, 0, 1); 
	    gridPane.add(five, 1, 1); 
	    gridPane.add(six, 2, 1); 
	    gridPane.add(eight, 0, 2); 
	    gridPane.add(nine, 1, 2); 
	    gridPane.add(Nill, 2, 2); 
	    
	    gridPane.add(PlusB, 3, 0);
	    gridPane.add(MinusB, 3, 1);
	    gridPane.add(MultB, 3, 2);
	    gridPane.add(DivB, 0, 4);
	    gridPane.add(ResultB, 3, 4);
	    
		return gridPane; 
	}

	@Override
	public void handle(ActionEvent event) {


		
		if (event.getSource() == Nill) {
			a = "0";
			math();	
		}
		else if(event.getSource()==one) {
			a = "1";
			math();
		}
		else if(event.getSource()==two) {
			a = "2";
			math();
		}
		else if(event.getSource()==three) {
			a = "3";
			math();
		}
		else if(event.getSource()==four) {
			a = "4";
			math();
		}
		else if(event.getSource()==five) {
			a = "5";
			math();
		}
		else if(event.getSource()==six) {
			a = "6";
			math();
		}
		else if(event.getSource()==seven) {
			a = "7";
			math();
		}
		else if(event.getSource()==eight) {
			a = "8";
			math();
		}
		else if(event.getSource()==nine) {
			a = "9";
			math();
		}
		else if (event.getSource() == PlusB)
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
	private void MakeButton() {
		Nill = new Button("0");
		Nill.setOnAction(this);
		Nill.setStyle("-fx-background-color: black; -fx-text-fill: white");
		Nill.setPrefWidth(25);
		Nill.setPrefHeight(25);
		
		one = new Button("1");
		one.setOnAction(this);
		one.setStyle("-fx-background-color: black; -fx-text-fill: white");
		one.setPrefWidth(25);
		one.setPrefHeight(25);

		two = new Button("2");
		two.setOnAction(this);
		two.setStyle("-fx-background-color: black; -fx-text-fill: white");
		two.setPrefWidth(25);
		two.setPrefHeight(25);

		three = new Button("3");
		three.setOnAction(this);
		three.setStyle("-fx-background-color: black; -fx-text-fill: white");
		three.setPrefWidth(25);
		three.setPrefHeight(25);

		four = new Button("4");
		four.setOnAction(this);
		four.setStyle("-fx-background-color: black; -fx-text-fill: white");
		four.setPrefWidth(25);
		four.setPrefHeight(25);

		five = new Button("5");
		five.setOnAction(this);
		five.setStyle("-fx-background-color: black; -fx-text-fill: white");
		five.setPrefWidth(25);
		five.setPrefHeight(25);

		six = new Button("6");
		six.setOnAction(this);
		six.setStyle("-fx-background-color: black; -fx-text-fill: white");
		six.setPrefWidth(25);
		six.setPrefHeight(25);

		seven = new Button("7");
		seven.setOnAction(this);
		seven.setStyle("-fx-background-color: black; -fx-text-fill: white");
		seven.setPrefWidth(25);
		seven.setPrefHeight(25);

		eight = new Button("8");
		eight.setOnAction(this);
		eight.setStyle("-fx-background-color: black; -fx-text-fill: white");
		eight.setPrefWidth(25);
		eight.setPrefHeight(25);

		nine = new Button("9");
		nine.setOnAction(this);
		nine.setStyle("-fx-background-color: black; -fx-text-fill: white");
		nine.setPrefWidth(25);
		nine.setPrefHeight(25);

		PlusB = new Button("+");
		PlusB.setOnAction(this);
		PlusB.setStyle("-fx-background-color: black; -fx-text-fill: white");
		PlusB.setPrefWidth(25);
		PlusB.setPrefHeight(25);

		
		MinusB = new Button("-");
		MinusB.setOnAction(this);
		MinusB.setStyle("-fx-background-color: black; -fx-text-fill: white");
		MinusB.setPrefWidth(25);
		MinusB.setPrefHeight(25);


		
		MultB = new Button("*");
		MultB.setOnAction(this);
		MultB.setStyle("-fx-background-color: black; -fx-text-fill: white");
		MultB.setPrefWidth(25);
		MultB.setPrefHeight(25);
		
		DivB = new Button("/");
		DivB.setOnAction(this);
		DivB.setStyle("-fx-background-color: black; -fx-text-fill: white");
		DivB.setPrefWidth(25);
		DivB.setPrefHeight(25);

		ResultB = new Button("=");
		ResultB.setOnAction(this);
		ResultB.setStyle("-fx-background-color: black; -fx-text-fill: white");
		ResultB.setPrefWidth(25);
		ResultB.setPrefHeight(25);
	
	}
}