/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: A Question Class to have easy access to each of the questions, also store them.
Description: A Class that take either 4 (true or false) or 6 (multiple choice) parameters, store the variable and i can access it later. 
Major Skills: The ability to create a class with constructors 
Extra Features: none
Concerns: Maybe I can add more functionalities
*/


package application;

public class Questions {
	
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String correct;
	
	public Questions(){
		
	}
	public Questions(String question, String answer1, String answer2, String correct){
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.correct = correct;
	}
	
	public Questions(String question, String answer1, String answer2, String answer3, String answer4, String correct){
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.correct = correct;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getAnswer1() {
		return answer1;
	}


	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}


	public String getAnswer2() {
		return answer2;
	}


	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}


	public String getAnswer3() {
		return answer3;
	}


	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}


	public String getAnswer4() {
		return answer4;
	}


	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}


	public String getCorrect() {
		return correct;
	}


	public void setCorrect(String correct) {
		this.correct = correct;
	}
	
	
}
