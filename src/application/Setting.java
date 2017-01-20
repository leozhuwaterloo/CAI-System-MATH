/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: display the setting that the user can decided to turn on or off the different types of sound.
Description: When the window clicked the "Setting" button from the main screen, this window let them change the setting
Major Skills: The ability to create a window
Extra Features: Sound Effect, CSS, Icon, Stage Property, javaFx
Concerns: Maybe I can add more functionalities
*/

package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Setting {
	public static void display(){
		//Stage
		Stage window = new Stage();
		//VBox
		VBox root = new VBox();
		//rows
		HBox row1 = new HBox();
		HBox row2 = new HBox();
		//sound
		Media hoverSound = SoundControl.getHoverSound();
		Media clickedSound = SoundControl.getClickedSound();
		//choice.setOnAction(e -> {new MediaPlayer(clickedSound).play();beginChoice(1, choiceBox, window);});
		//choice.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		//Label
		Label label = new Label("Sound:");
		//Label
		Label hoverLabel = new Label("Button Hover:");
		hoverLabel.setMinWidth(400);
		//CheckBox
		CheckBox onHover = new CheckBox("On");
		CheckBox offHover = new CheckBox("Off");
		onHover.setOnAction(e->{new MediaPlayer(clickedSound).play();hoverSoundSetting(true,offHover,onHover);});
		offHover.setOnAction(e->{new MediaPlayer(clickedSound).play();hoverSoundSetting(false,onHover,offHover);});
		//row1
		row1.getChildren().addAll(hoverLabel,onHover,offHover);
		row1.setSpacing(20);

		//Label
		Label clickedLabel = new Label("Button Click:");
		clickedLabel.setMinWidth(400);
		//CheckBox
		CheckBox onClicked = new CheckBox("On");
		CheckBox offClicked = new CheckBox("Off");
		onClicked.setOnAction(e->{new MediaPlayer(clickedSound).play();clickedSoundSetting(true,offClicked,onClicked);});
		offClicked.setOnAction(e->{new MediaPlayer(clickedSound).play();clickedSoundSetting(false,onClicked,offClicked);});
		//row2
		row2.getChildren().addAll(clickedLabel,onClicked,offClicked);
		row2.setSpacing(20);
		//get current sound state
		if (SoundControl.haveHoverSound)
			onHover.setSelected(true);
		else
			offHover.setSelected(true);

		if (SoundControl.haveClickedSound)
			onClicked.setSelected(true);
		else
			offClicked.setSelected(true);



		//Save
		Button cont = new Button("Save");
		cont.setOnAction(e->{new MediaPlayer(clickedSound).play();window.close();QuestionTypes.display();});
		cont.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());


		//setRoot
		root.getChildren().addAll(label,row1,row2,cont);
		root.setStyle("-fx-background-color: #67BCDB" );
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

	private static void hoverSoundSetting(boolean status,CheckBox checkBox1,CheckBox checkBox2){
		if(checkBox1.isSelected()){
			checkBox1.setSelected(false);
			if (status){
				SoundControl.haveHoverSound=true;
			}else{
				SoundControl.haveHoverSound=false;
			}
		}else if(!checkBox2.isSelected()){
			checkBox2.setSelected(true);
		}
	}

	private static void clickedSoundSetting(boolean status,CheckBox checkBox1,CheckBox checkBox2){
		if(checkBox1.isSelected()){
			checkBox1.setSelected(false);
			if (status){
				SoundControl.haveClickedSound=true;
			}else{
				SoundControl.haveClickedSound=false;
			}
		}else if(!checkBox2.isSelected()){
			checkBox2.setSelected(true);
		}

	}
}
