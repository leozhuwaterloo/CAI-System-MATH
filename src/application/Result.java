/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: display the result of the quiz with percentages and pie chart
Description: after the user is down all the questions for one set display the recommendation and the result.(calls up the recommendation if the user just finished one set of questions, does not call up the recommendation if the user wants to see their status at the main menu)
Major Skills: The ability to create a window, and make conditions
Extra Features: Sound Effect, CSS, Icon, Stage Property, javaFx, PieChart
Concerns: Maybe I can add more functionalities
*/

package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Result {
	public static void display(int correct, int wrong, boolean displayRecommendation){
		//Stage
		Stage window = new Stage();
		//VBox
		VBox root = new VBox();
		//Label
		Label status = new Label();
		status.setText("Correct:" +correct+"\tWrong:"+wrong);
		
		Label noData = new Label();
		noData.setText("No Data Available");
		//Pie Chart
		ObservableList<PieChart.Data> pieChartData =
				FXCollections.observableArrayList(
						new PieChart.Data("Correct", correct),
						new PieChart.Data("Wrong", wrong));
		PieChart chart = new PieChart(pieChartData);
		
		//Percentage Label
		Label percent = new Label();
		double correctPercent = Math.round((double)correct/(correct+wrong)*100);
		double wrongPercent =  Math.round((double)wrong/(correct+wrong)*100);
		percent.setText(correctPercent+"%\t" +wrongPercent+"%");
		//Based on the percentage give recommendations
		
		Button goBack = new Button("Main Menu");
		
		Media hoverSound = SoundControl.getHoverSound();
		Media clickedSound = SoundControl.getClickedSound();
		
		goBack.setOnMouseEntered(e->new MediaPlayer(hoverSound).play());
		
		
		if (displayRecommendation){
			if(correctPercent>=90)
				Recommendation.display("Excellent!\nYou have proven\nyourself with the great work!","#FF9009");
			else if(correctPercent>=80)
				Recommendation.display("Good Job!\nOnly a few little mistakes.\nKeep up the good work!","#FF9009");
			else if(correctPercent>=60)
				Recommendation.display("You Passed!\nBut still need some practise!\nDon't give up. Keep Going.","#FF9009");
			else
				Recommendation.display("Unluckily, You Failed.\nDon't give up.\nTry once more\nand see where you did wrong.","#404040");
			goBack.setOnAction(e->{new MediaPlayer(clickedSound).play();window.close();SaveOrNot.display();});
		}else{
			goBack.setOnAction(e->{new MediaPlayer(clickedSound).play();window.close();QuestionTypes.display();});
		}
		//Go back button
		
		if (correct!=0 || wrong!=0){
			root.getChildren().addAll(status,chart, percent, goBack);
		}else{
			root.getChildren().addAll(status,noData, percent, goBack);
		}
		//set VBox
		
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: #67BCDB;");
		root.setSpacing(10);
		root.setPadding(new Insets(30, 0, 30, 0));
		//Scene
		Scene scene = new Scene(root,800,600);
		scene.getStylesheets().add("application.css");
		//window
		window.getIcons().add(new Image("math.png"));
		window.setScene(scene);
		window.setTitle("Math Is Fun - Made by: Leo Zhu");
		window.show(); 
	}
}
