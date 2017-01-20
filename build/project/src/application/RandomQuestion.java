/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: get the questions and ask them one by one 
Description: based on the level and question type, the program will decide what type of scene should it creates, and then display it on the screen
Major Skills: The ability to create a window and methods
Extra Features: Sound Effect, CSS, Icon, Stage Property, javaFx
Concerns: Maybe I can add more functionalities
*/

package application;

import java.util.ArrayList;
import java.util.Random;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class RandomQuestion {

	private static Stage window;
	private static Scene scene1;
	private static Scene scene2;
	private static Scene scene3;
	private static Scene scene4;
	private static Scene scene5;

	private static int correct =0;
	private static int wrong =0;

	private static Questions question1 = new Questions();
	private static Questions question2 = new Questions();
	private static Questions question3 = new Questions();
	private static Questions question4 = new Questions();
	private static Questions question5 = new Questions();

	public static int getCorrect(){
		return correct;
	}

	public static void setCorrect(int num){
		correct = num;
	}

	public static int getWrong(){
		return wrong;
	}

	public static void setWrong(int num){
		wrong = num;
	}

	public static void display(int level, int questionType){
		switch(questionType){
		case 1:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionM11();
				question2 = StoreTheQuestions.getQuestionM12();
				question3 = StoreTheQuestions.getQuestionM13();
				question4 = StoreTheQuestions.getQuestionM14();
				question5 = StoreTheQuestions.getQuestionM15();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionM21();
				question2 = StoreTheQuestions.getQuestionM22();
				question3 = StoreTheQuestions.getQuestionM23();
				question4 = StoreTheQuestions.getQuestionM24();
				question5 = StoreTheQuestions.getQuestionM25();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionM31();
				question2 = StoreTheQuestions.getQuestionM32();
				question3 = StoreTheQuestions.getQuestionM33();
				question4 = StoreTheQuestions.getQuestionM34();
				question5 = StoreTheQuestions.getQuestionM35();
				break;
			}
			break;
		case 2:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionT11();
				question2 = StoreTheQuestions.getQuestionT12();
				question3 = StoreTheQuestions.getQuestionT13();
				question4 = StoreTheQuestions.getQuestionT14();
				question5 = StoreTheQuestions.getQuestionT15();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionT21();
				question2 = StoreTheQuestions.getQuestionT22();
				question3 = StoreTheQuestions.getQuestionT23();
				question4 = StoreTheQuestions.getQuestionT24();
				question5 = StoreTheQuestions.getQuestionT25();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionT31();
				question2 = StoreTheQuestions.getQuestionT32();
				question3 = StoreTheQuestions.getQuestionT33();
				question4 = StoreTheQuestions.getQuestionT34();
				question5 = StoreTheQuestions.getQuestionT35();
				break;
			}
			break;
		case 3:
			Random r = new Random();
			ArrayList <Integer> numbers = new ArrayList<>();
			while(numbers.size()<5){
				int number = r.nextInt(10);
				if (!numbers.contains(number)){
					numbers.add(number);
				}
			}
			question1 = getRandomQuestion(numbers.get(0),level);
			question2 = getRandomQuestion(numbers.get(1),level);
			question3 = getRandomQuestion(numbers.get(2),level);
			question4 = getRandomQuestion(numbers.get(3),level);
			question5 = getRandomQuestion(numbers.get(4),level);

		}
		//Stage
		window = new Stage();
		//Scene
		scene1 = createScene(question1);
		//window
		window.getIcons().add(new Image("math.png"));
		window.setTitle("Math Is Fun - Made by: Leo Zhu");
		window.setScene(scene1);
		window.show();
	}

	private static Questions getRandomQuestion(int n, int level){
		Questions question1 = new Questions();
		//I decided not to put a switch inside a switch because that would be super confusing
		//since the process is only looking at 2 variables(the randomness, and the difficulty)
		//there won't be a differences in terms of speed
		switch (n){
		case 0:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionM11();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionM21();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionM31();
				break;
			}
			break;
		case 1:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionM12();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionM22();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionM32();
				break;
			}
			break;
		case 2:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionM13();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionM23();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionM33();
				break;
			}
			break;
		case 3:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionM14();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionM24();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionM34();
				break;
			}
			break;
		case 4:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionM15();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionM25();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionM35();
				break;
			}
			break;
		case 5:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionT11();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionT21();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionT31();
				break;
			}
			break;
		case 6:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionT12();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionT22();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionT32();
				break;
			}
			break;
		case 7:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionT13();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionT23();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionT33();
				break;
			}
			break;
		case 8:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionT14();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionT24();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionT34();
				break;
			}
			break;
		case 9:
			switch (level){
			case 1:
				question1 = StoreTheQuestions.getQuestionT15();
				break;
			case 2:
				question1 = StoreTheQuestions.getQuestionT25();
				break;
			case 3:
				question1 = StoreTheQuestions.getQuestionT35();
				break;
			}
			break;
		}
		return question1;
	}




	private static Scene createScene(Questions question1){
		//questions and answers
		VBox root = new VBox();

		HBox middle = new HBox();
		VBox leftMiddle = new VBox();
		VBox rightMiddle = new VBox();
		HBox lastRow = new HBox();
		Label question = new Label(question1.getQuestion());
		question.setPadding(new Insets(0, 0, 30, 0));
		
		Media hoverSound = SoundControl.getHoverSound();
		Media clickedSound = SoundControl.getClickedSound();
		
		//next Button
		Button next = new Button("Next");
		

		//answers
		if (question1.getAnswer3()==null){
			CheckBox box1 = new CheckBox(question1.getAnswer1());
			CheckBox box2 = new CheckBox(question1.getAnswer2());
			box1.setOnAction(e->{new MediaPlayer(clickedSound).play();choiceMade(box2);});
			box2.setOnAction(e->{new MediaPlayer(clickedSound).play();choiceMade(box1);});
			leftMiddle.getChildren().addAll(box1, box2);
			next.setOnAction(e-> {new MediaPlayer(clickedSound).play();checkAnswer(question1.getCorrect(),box1,box2);});
			next.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());

		}else{
			CheckBox box1 = new CheckBox(question1.getAnswer1());
			CheckBox box2 = new CheckBox(question1.getAnswer2());
			CheckBox box3 = new CheckBox(question1.getAnswer3());
			CheckBox box4 = new CheckBox(question1.getAnswer4());
			box1.setOnAction(e->{new MediaPlayer(clickedSound).play();choiceMade(box2,box3,box4);});
			box2.setOnAction(e->{new MediaPlayer(clickedSound).play();choiceMade(box1,box3,box4);});
			box3.setOnAction(e->{new MediaPlayer(clickedSound).play();choiceMade(box1,box2,box4);});
			box4.setOnAction(e->{new MediaPlayer(clickedSound).play();choiceMade(box1,box2,box3);});
			box4.setPadding(new Insets(0, 0, 30, 0));
			leftMiddle.getChildren().addAll(box1, box2, box3, box4);
			next.setOnAction(e-> {new MediaPlayer(clickedSound).play();checkAnswer(question1.getCorrect(),box1,box2,box3,box4);});
			next.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());

		}


		//status
		Label status = new Label();
		status.setText("Correct:" +correct+"\tWrong:"+wrong);
		
		//Go back button
		Button goBack = new Button("Main Menu");
		goBack.setMinWidth(160);
		goBack.setOnAction(e->{new MediaPlayer(clickedSound).play();AreYouSure.display(window);});
		goBack.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		goBack.setId("smaller-button");
		

		//Go back button
		Button helpButton = new Button("Help");
		helpButton.setMinWidth(160);
		helpButton.setOnAction(e->{new MediaPlayer(clickedSound).play();HelpWindow.display("For Multiple Choice,\nSelected one best answer,\nOut of the four possible ones.\nGood Luck!",4);});
		helpButton.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		helpButton.setId("smaller-button");
		
		//middle
		leftMiddle.setSpacing(10);
		leftMiddle.setMinWidth(600);
		rightMiddle.getChildren().addAll(goBack, helpButton);
		rightMiddle.setSpacing(20);
		middle.getChildren().addAll(leftMiddle, rightMiddle);

		//last row
		lastRow.setSpacing(30);
		lastRow.getChildren().addAll(next,status);


		//Next Button clicked


		//put into the VBox
		root.setPadding(new Insets(20, 20, 20, 20));
		root.getChildren().addAll(question, middle, lastRow);
		root.setStyle("-fx-background-color: #67BCDB;");
		root.setSpacing(10);
		//scene
		Scene scene = new Scene(root, 800,600);
		//set style
		scene.getStylesheets().add("application.css");
		return scene;
	}

	private static void choiceMade(CheckBox box1,CheckBox box2,CheckBox box3){
		box1.setSelected(false);
		box2.setSelected(false);
		box3.setSelected(false);
	}

	private static void choiceMade(CheckBox box1){
		box1.setSelected(false);
	}

	private static void checkAnswer(String correctAnswer,CheckBox box1,CheckBox box2){
		String answerSelected = "";
		//random feedback
		Random r = new Random();
		int number = r.nextInt(3);
		//get selection
		if (box1.isSelected())
			answerSelected = box1.getText();
		else if (box2.isSelected())
			answerSelected = box2.getText();
		//check answer
		if (answerSelected.equals(correctAnswer)){
			correct++;
			if (number==0)
				CorrectWindow.display("Very Good!","#FF9009");
			else if (number==1)
				CorrectWindow.display("Good Job!","#FF9009");
			else if (number==2)
				CorrectWindow.display("Correct!","#FF9009");
		}else{
			wrong++;
			if (number==0)
				CorrectWindow.display("Incorrect","#404040");
			else if (number==1)
				CorrectWindow.display("Don't Give Up","#404040");
			else if (number==2)
				CorrectWindow.display("Nope","#404040");

		}

		changeScene();
	}



	private static void checkAnswer(String correctAnswer,CheckBox box1,CheckBox box2,CheckBox box3,CheckBox box4){
		String answerSelected = "";
		//random feedback
		Random r = new Random();
		int number = r.nextInt(3);
		//get selection
		if (box1.isSelected())
			answerSelected = box1.getText();
		else if (box2.isSelected())
			answerSelected = box2.getText();
		else if (box3.isSelected())
			answerSelected = box3.getText();
		else if (box4.isSelected())
			answerSelected = box4.getText();
		//check answer
		if (answerSelected.equals(correctAnswer)){
			correct++;
			if (number==0)
				CorrectWindow.display("Very Good!","#FF9009");
			else if (number==1)
				CorrectWindow.display("Good Job!","#FF9009");
			else if (number==2)
				CorrectWindow.display("Correct!","#FF9009");
		}else{
			wrong++;
			if (number==0)
				CorrectWindow.display("Incorrect","#404040");
			else if (number==1)
				CorrectWindow.display("Don't Give Up","#404040");
			else if (number==2)
				CorrectWindow.display("Nope","#404040");

		}

		changeScene();
	}

	private static void changeScene(){

		Scene currentScene = window.getScene();
		if (currentScene.equals(scene1)){
			scene2 = createScene(question2);
			window.setScene(scene2);
		}else if (currentScene.equals(scene2)){
			scene3 = createScene(question3);
			window.setScene(scene3);
		}else if (currentScene.equals(scene3)){
			scene4 = createScene(question4);
			window.setScene(scene4);
		}else if (currentScene.equals(scene4)){
			scene5 = createScene(question5);
			window.setScene(scene5);
		}else if (currentScene.equals(scene5)){
			Result.display(correct, wrong, true);
			window.close();
		}
	}
}
