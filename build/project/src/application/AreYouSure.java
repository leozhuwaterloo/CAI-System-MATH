/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: Make a wind ow to ask whether the user really want to quit
Description: When the user clicked main menu button while playing, ask them if they really want to quit
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

public class AreYouSure {
	public static void display(Stage previousWindow){
		//Stage
		Stage window = new Stage();
		//VBox
		VBox root = new VBox();
		//Label
		Label label = new Label("Quit?");
		//Sound
		Media hoverSound = SoundControl.getHoverSound();
		Media clickedSound = SoundControl.getClickedSound();

		//Button
		Button yes = new Button("Yes");
		yes.setOnAction(e->{new MediaPlayer(clickedSound).play();previousWindow.close();SaveOrNot.display();window.close();});
		yes.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		Button no = new Button("No");
		no.setOnAction(e->{new MediaPlayer(clickedSound).play();window.close(); window.close();});
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
