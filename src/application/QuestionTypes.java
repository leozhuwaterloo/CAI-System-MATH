/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: Display the window that you can select the question types (it is also like the main menu)
Description: After the welcome screen this screen will show up will a lot of choices, you can select question types, difficulty and a lot of other things
Extra Features: Sound Effect, CSS, Icon, Stage Property, javaFx
Concerns: Maybe I can add more functionalities
 */


package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class QuestionTypes {

	private static String defaultChoice= "Level 1-Easy";
	private static boolean choosed = false;

	public static void display() {
		//overall
		Stage window = new Stage();
		HBox row1 = new HBox();
		HBox row2 = new HBox();
		HBox row3 = new HBox();
		HBox row4 = new HBox();
		VBox root = new VBox();
		//Button sound
		Media hoverSound = SoundControl.getHoverSound();
		Media clickedSound = SoundControl.getClickedSound();
		//choice.setOnAction(e -> {new MediaPlayer(clickedSound).play();beginChoice(1, choiceBox, window);});
		//choice.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());


		//Label
		Label titleView = new Label("Let's Practise");
		titleView.setId("larger-label");
		titleView.getStyleClass().add("outline");
		//first row for the window
		row1.getChildren().addAll(titleView);
		row1.setAlignment(Pos.TOP_CENTER);
		//Buttons
		int height = 200;
		int width = 250;
		Button choice = new Button("Multiple\nChoices");
		choice.setPrefHeight(height);
		choice.setPrefWidth(width);
		choice.setAlignment(Pos.CENTER);
		Button fillIn = new Button("True Or\nFalse");
		fillIn.setPrefHeight(height);
		fillIn.setPrefWidth(width);
		fillIn.setAlignment(Pos.CENTER);
		Button mixed = new Button("Random");
		mixed.setPrefHeight(height);
		mixed.setPrefWidth(width);
		mixed.setAlignment(Pos.CENTER);

		//second row for the window
		row2.getChildren().addAll(choice,fillIn, mixed);
		row2.setAlignment(Pos.CENTER);
		row2.setPadding(new Insets(20, 10, 20, 10));
		row2.setSpacing(20);

		//Label
		Label label = new Label("Difficulty:");
		//ChoiceBox
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().add("Level 1-Easy");
		choiceBox.getItems().add("Level 2-Normal");
		choiceBox.getItems().add("Level 3-Hard");
		choiceBox.setValue(defaultChoice);
		choiceBox.setMinWidth(450);
		//ChoiceBox listen for changes (change color)
		choiceBox.getSelectionModel().selectedItemProperty().addListener((v,oldValue, newValue)-> {new MediaPlayer(clickedSound).play();choiceBoxSelected(newValue, choiceBox);});

		//third row for the window
		row3.getChildren().addAll(label,choiceBox);
		row3.setAlignment(Pos.CENTER);
		row3.setSpacing(20);
		row3.setPadding(new Insets(20, 10, 20, 10));

		//Extra Buttons
		Button seeStatus = new Button("See Status");
		seeStatus.setAlignment(Pos.CENTER);

		Button help = new Button("Help");
		help.setAlignment(Pos.CENTER);

		Button setting = new Button("Setting");
		setting.setAlignment(Pos.CENTER);


		//fourth row for the window
		row4.getChildren().addAll(seeStatus,help,setting);
		row4.setAlignment(Pos.CENTER);
		row4.setSpacing(20);
		//set color
		if (choosed){
			choiceBox.setId("choice-box");
		}

		//Button commands
		choice.setOnAction(e -> {new MediaPlayer(clickedSound).play();beginChoice(1, choiceBox, window);});
		fillIn.setOnAction(e -> {new MediaPlayer(clickedSound).play();beginChoice(2, choiceBox, window);});
		mixed.setOnAction(e -> {new MediaPlayer(clickedSound).play();beginChoice(3, choiceBox, window);});
		seeStatus.setOnAction(e->{new MediaPlayer(clickedSound).play();Result.display(RandomQuestion.getCorrect(), RandomQuestion.getWrong(),false);window.close();});
		help.setOnAction(e->{new MediaPlayer(clickedSound).play();HelpWindow.display("There are three different\ntype of questions:\n\nMultiple Choice\nTrue or False\nRandom",1);});
		setting.setOnAction(e->{new MediaPlayer(clickedSound).play();window.close();Setting.display();});

		choice.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		fillIn.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		mixed.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		seeStatus.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		help.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		setting.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());

		//set the general layout
		root.setPadding(new Insets(40, 0, 40, 0));
		root.getChildren().addAll(row1, row2, row3,row4);
		root.setStyle("-fx-background-color: #67BCDB;");
		//scene
		Scene scene = new Scene(root, 800,600);
		//set style
		scene.getStylesheets().add("application.css");
		//window
		window.getIcons().add(new Image("math.png"));
		window.setTitle("Math Is Fun - Made by: Leo Zhu");
		window.setScene(scene);
		window.show();

	}


	private static void choiceBoxSelected(String newValue, ChoiceBox<String> choiceBox){
		choiceBox.setId("choice-box");
		defaultChoice= newValue;
		choosed = true;
	}

	private static void beginChoice(int type, ChoiceBox<String> choiceBox, Stage window){
		int level = Integer.parseInt(choiceBox.getValue().charAt(6)+"");
		switch (type){
		case 1:
			RandomQuestion.display(level,1);
			window.close();
			break;
		case 2:
			RandomQuestion.display(level,2);
			window.close();
			break;
		case 3:
			RandomQuestion.display(level,3);
			window.close();
			break;
		}
	}
}
