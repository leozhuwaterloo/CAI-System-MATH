/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: Make a window to display the result whether the user did each questions correct or not
Description: When the user selected an answer and clicked the next question button, display the result for current question
Major Skills: The ability to create a window
Extra Features: Sound Effect, CSS, Icon, Stage Property, javaFx
Concerns: Maybe I can add more functionalities
*/

package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CorrectWindow {
	public static void display(String text, String color){
		//Stage
		Stage window = new Stage();
		//VBox
		VBox root = new VBox();
		//Label
		Label label = new Label(text);
		//sound
		Media hoverSound = SoundControl.getHoverSound();
		Media clickedSound = SoundControl.getClickedSound();
		//Button
		Button cont = new Button("Continue->");
		cont.setOnAction(e->{new MediaPlayer(clickedSound).play();window.close();});
		cont.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		
		//setRoot
		root.getChildren().addAll(label,cont);
		root.setStyle("-fx-background-color: " + color);
		root.setSpacing(30);
		root.setAlignment(Pos.CENTER);
		
		//scene
		Scene scene = new Scene(root,400,300);
		scene.getStylesheets().add("application.css");
		//window
		window.getIcons().add(new Image("math.png"));
		window.setScene(scene);
		window.setTitle("Math Is Fun - Made by: Leo Zhu");
		window.initModality(Modality.APPLICATION_MODAL);
		window.initStyle(StageStyle.TRANSPARENT);
		window.showAndWait(); 
	}
}
