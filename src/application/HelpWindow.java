/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: Make a window to display help texts based on the condition of the current window
Description: there are two major help buttons, one at the question type selection screen, one at the window where user do the questions. Different help buttons link to this same class, but display different things.
Major Skills: The ability to create a window, and take parameters
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

public class HelpWindow {
	public static void display(String text, int nextWindow){
		//Stage
		Stage window = new Stage();
		//VBox
		VBox root = new VBox();
		//Label
		Label label = new Label(text);


		Media hoverSound = SoundControl.getHoverSound();
		Media clickedSound = SoundControl.getClickedSound();
		//choice.setOnAction(e -> {new MediaPlayer(clickedSound).play();beginChoice(1, choiceBox, window);});
		//choice.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());

		//Button
		Button cont = new Button("Continue->");
		cont.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		if (nextWindow==1){
			cont.setOnAction(e->{new MediaPlayer(clickedSound).play();HelpWindow.display("There are three different\nlevels of questions:\n\nLevel 1-Easy\nLevel 2-Normal\nLevel 3-Hard",2);window.close();});
		}else if (nextWindow==2){
			cont.setOnAction(e->{new MediaPlayer(clickedSound).play();HelpWindow.display("First choose a level.\nThen click on a question type.\nTo get started\nGood Luck!",3);window.close();});
		}else if (nextWindow==3){
			cont.setOnAction(e->{new MediaPlayer(clickedSound).play();HelpWindow.display("By the way,\nIf you don't want any sound,\nYou can turn them off\nAt the setting.",0);window.close();});
		}else if (nextWindow==4){
			cont.setOnAction(e->{new MediaPlayer(clickedSound).play();HelpWindow.display("For True Or False,\nSelected one best answer,\nOut of the two possible ones.\nGood Luck!",0);window.close();});
		}else if (nextWindow==0){
			cont.setOnAction(e->{new MediaPlayer(clickedSound).play();window.close();});
		}
		//setRoot
		root.getChildren().addAll(label,cont);
		root.setStyle("-fx-background-color: #67BCDB");
		root.setSpacing(30);
		root.setPadding(new Insets(30, 30, 30, 30));
		root.setAlignment(Pos.CENTER);

		//scene
		Scene scene = new Scene(root,800,600);
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
