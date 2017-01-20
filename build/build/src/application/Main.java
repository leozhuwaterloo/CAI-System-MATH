/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: Display the welcome screen, and everything else is linked together afterwards
Description: start the program
Major Skills: The ability to call up a class.
Extra Features: javaFX
Concerns: Maybe I can add more functionalities
*/

package application;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Intro.display();
			//QuestionTypes.display();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
