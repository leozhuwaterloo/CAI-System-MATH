/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: display a window to let the user decide whether they want to save their scores or not 
Description: Whenever the user goes from doing the questions to the main menu, this window will show up ans ask
Major Skills: The ability to create a window
Extra Features: Sound Effect, CSS, Icon, Stage Property, javaFx
Concerns: Maybe I can add more functionalities
*/


package application;

import javafx.geometry.Insets;
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

public class SaveOrNot {
	public static void display(){
		//Stage
		Stage window = new Stage();
		//VBox
		VBox root = new VBox();
		//Label
		Label label = new Label("Reset Score?");
		//Sound
		Media hoverSound = SoundControl.getHoverSound();
		Media clickedSound = SoundControl.getClickedSound();

		//Button
		Button yes = new Button("Yes");
		yes.setOnAction(e->{new MediaPlayer(clickedSound).play();RandomQuestion.setCorrect(0);RandomQuestion.setWrong(0);window.close();QuestionTypes.display();});
		yes.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		Button no = new Button("No");
		no.setOnAction(e->{new MediaPlayer(clickedSound).play();window.close(); QuestionTypes.display();});
		no.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		//setRoot
		root.getChildren().addAll(label,yes,no);
		root.setStyle("-fx-background-color: #67BCDB");
		root.setSpacing(30);
		root.setPadding(new Insets(30, 0, 30, 0));
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
