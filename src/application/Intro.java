/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: Display a welcome screen with cool animations and sounds. Also, the type of the program is well indicated by the icons.
Description: A beautiful "Math" picture as the logo, a "gif" math related picture in the buttom, with instructions which tells the user how to continue
Major Skills: The ability to create a window and animation
Extra Features: Sound Effect, CSS, Icon, Stage Property, javaFx, FadeTransition
Concerns: Maybe I can add more functionalities
*/

package application;

import java.io.File;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


public class Intro{

	public static void display() {
		//overall
		Stage window = new Stage();
		BorderPane root = new BorderPane();
		//sound
		Media sound = new Media(new File("start.mp3").toURI().toString());
		Media enter = new Media(new File("intro.mp3").toURI().toString());
		new MediaPlayer(sound).play();
		//Math image
		Image mathImage = new Image("math.png");
		ImageView math = new ImageView(mathImage);
		math.setFitHeight(mathImage.getHeight()/2.8);
		math.setFitWidth(mathImage.getWidth()/2.8);
		//Gif image
		Image image = new Image("login.gif");
		ImageView view = new ImageView(image);
		view.setFitHeight(image.getHeight()/3);
		view.setFitWidth(image.getWidth()/3);

		//Label
		Label label = new Label("Made by: Leo Zhu\t\t\tClick anywhere to continue");
		label.setFont(Font.font ("Times New Roman", 12));
		label.setStyle("-fx-background-color: transparent;");
		label.setStyle("-fx-font-weight: bold;");
		label.setTextFill(Color.web("#B8B8B8"));


		//set BorderPane
		BorderPane.setAlignment(math,Pos.CENTER);
		BorderPane.setAlignment(view,Pos.CENTER);
		BorderPane.setAlignment(label,Pos.CENTER);
		BorderPane.setMargin(math, new Insets(10,10,0,10));
		BorderPane.setMargin(view, new Insets(0,0,0,35));
		BorderPane.setMargin(label, new Insets(0,0,20,0));
		root.setTop(math);
		root.setCenter(view);
		root.setBottom(label);
		root.setStyle("-fx-background-color: #000000;");

		//effects of the image fading in
		FadeTransition fadein = new FadeTransition(Duration.millis(5000),root);
		fadein.setFromValue(0.0);
		fadein.setToValue(1.0);
		fadein.play();

		//effect of text
		continueFade(label);		
		//handle user event
		root.setOnMouseClicked(e->{new MediaPlayer(enter).play();goToMenu(root, window);});
		//scene
		Scene scene = new Scene(root, 800,600,Color.BLACK);
		window.setScene(scene);
		window.initStyle(StageStyle.TRANSPARENT);
		window.getIcons().add(new Image("math.png"));
		window.setTitle("Math Is Fun - Made by: Leo Zhu");
		window.show();



	}

	private static void goToMenu(BorderPane root, Stage window){
		FadeTransition fadeout = new FadeTransition(Duration.millis(500),root);
		fadeout.setFromValue(1.0);
		fadeout.setToValue(0.0);
		fadeout.play();

		PauseTransition delay = new PauseTransition(Duration.millis(550));
		delay.setOnFinished(e -> changeWindow(window));
		delay.play();
	}


	private static void continueFade(Label label){
		FadeTransition continueFade = new FadeTransition(Duration.millis(1000),label);
		continueFade.setFromValue(0.3);
		continueFade.setToValue(1.0);
		continueFade.setAutoReverse(true);
		continueFade.setCycleCount((int) Double.POSITIVE_INFINITY);
		continueFade.play();
	}

	private static void changeWindow(Stage window){
		if (window.isShowing()){
			window.close();
			QuestionTypes.display();
		}
	}
}
