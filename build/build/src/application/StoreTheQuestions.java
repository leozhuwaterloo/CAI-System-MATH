/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: to store all the questions here
Description: use the Question class created before, all the information of a question is stored here.
Major Skills: The ability to store the variables in an class
Extra Features: none
Concerns: Maybe I can add more functionalities
*/


package application;

public class StoreTheQuestions {
	private static Questions questionM11 = new Questions("What is halfway between\n103 and 301?",
			"199", "200", "201", "202", "202");
	private static Questions questionM12 = new Questions("What is the smallest 7 digit\nnumber that can be obtained\nby using the following\ndigits: 0,1,2,4,6,7,8?",
			"1246780", "1024678", "1024687", "2467810", "1024678");
	private static Questions questionM13 = new Questions("What is the 15% of $80?",
			"$8", "$9", "$10", "$12", "$12");
	private static Questions questionM14 = new Questions("A box of chocolate bars costs\n$16, and there are 32 bars in\none box. What is the price for\none chocolate bar?",
			"$2", "$1", "$0.50", "$0.25", "$0.50");
	private static Questions questionM15 = new Questions("A snail crawls 15 meters in\n30 minutes. How many\nmeters can it crawl in\n2 hours?",
			"30m", "40m", "50m", "60m", "60m");
	
	
	private static Questions questionM21= new Questions("The mean of four numbers is\n11. If two numbers go 3 up,\nand two goes 3 down, what\nis the new mean?",
			"5", "11", "14", "17", "11");
	private static Questions questionM22 = new Questions("Weight of two children and\none man equals five children.\nIf each child weighs 25kg,\nwhat's the man's weight?",
			"50kg", "75kg", "100kg", "125kg", "75kg");
	private static Questions questionM23 = new Questions("A man says: \"If I live to be\n120, then my age is two times\nof the time I have left.\"\nHow old is the man?",
			"40", "60", "80", "100", "80");
	private static Questions questionM24 = new Questions("Three years ago, Jane's age\nwas half of the age she will\nbe in 3 years. How old is she\nnow?",
			"3", "6", "9", "12", "9");
	private static Questions questionM25 = new Questions("There are 4 people. If each\nperson shake hands with each\nof the other once, how many\nhandshakes are exchanged?",
			"4", "6", "12", "16", "6");
	
	
	private static Questions questionM31 = new Questions("15cm radius pizza is enough\nfor 2 children. For how many\nchildren will pizza be enough,\nif pizza's diameter is 60 cm?",
			"4", "6", "8", "10", "8");
	private static Questions questionM32 = new Questions("A man buys 5 socks for $5\nand sells 4 socks for $5. How\nmany socks must he sell in\norder to make $20?",
			"20", "80", "100", "120", "80");
	private static Questions questionM33 = new Questions("A man spent 1/4 of his money\nand then lost half of what's\nleft. He was left with $24.\nHow much did he start with?",
			"32", "48", "64", "72", "64");
	private static Questions questionM34 = new Questions("The last Saturday of a month\nis on the 27th day of the\nmonth. What day of the week\nis the first day of the month?",
			"Sunday", "Monday", "Tuesday", "Thursday", "Monday");
	private static Questions questionM35 = new Questions("Baby Tom was born on\nThursday, 24th of May, 2007.\nWhen will be his birthday on\nThursday again?",
			"in 2012", "in 2013", "in 2014", "in 2015", "in 2012");
	
	
	
	private static Questions questionT11 = new Questions("\"x is at most equal to 9\" is\nwritten mathematically as\nx < 9.",
			"True", "False", "False");
	private static Questions questionT12 = new Questions("1000/0 = 0.",
			"True", "False", "False");
	private static Questions questionT13 = new Questions("0/1000 = 0.",
			"True", "False", "True");
	private static Questions questionT14 = new Questions("x = 7 DOES NOT satisfy the\ninequality x - 7 < 0",
			"True", "False", "True");
	private static Questions questionT15 = new Questions("The reciprocal of 0 is\nequal to 0.",
			"True", "False", "False");
	
	
	private static Questions questionT21 = new Questions("The product of two positive\nnumbers is NOT positive.",
			"True", "False", "False");
	private static Questions questionT22 = new Questions("x + 2 = 7 is called an\ninequality.",
			"True", "False", "False");
	private static Questions questionT23 = new Questions("The associative property is\nused to write\n4x + 8y = 4(x + 2y).",
			"True", "False", "False");
	private static Questions questionT24 = new Questions("The absolute value of a real\nnegative number is negative.",
			"True", "False", "False");
	private static Questions questionT25 = new Questions("30% of x is equal to 0.03x.",
			"True", "False", "False");
	
	
	
	private static Questions questionT31 = new Questions("The slope of a vertical line is\nundefined.",
			"True", "False", "True");
	private static Questions questionT32 = new Questions("Two lines with positive slopes\ncan be perpendicular.",
			"True", "False", "False");
	private static Questions questionT33 = new Questions("5 > 10 or 5 < 7.",
			"True", "False", "True");
	private static Questions questionT34 = new Questions("The set of ordered pairs\n{(6,4),(2,-5),(-2,4),(6,-4)}\nis a function.",
			"True", "False", "False");
	private static Questions questionT35 = new Questions("The additive inverse of -10\nis 10.",
			"True", "False", "True");
	
	///auto generated getters and setters
	public static Questions getQuestionT11() {
		return questionT11;
	}
	public static void setQuestionT11(Questions questionT11) {
		StoreTheQuestions.questionT11 = questionT11;
	}
	public static Questions getQuestionT12() {
		return questionT12;
	}
	public static void setQuestionT12(Questions questionT12) {
		StoreTheQuestions.questionT12 = questionT12;
	}
	public static Questions getQuestionT13() {
		return questionT13;
	}
	public static void setQuestionT13(Questions questionT13) {
		StoreTheQuestions.questionT13 = questionT13;
	}
	public static Questions getQuestionT14() {
		return questionT14;
	}
	public static void setQuestionT14(Questions questionT14) {
		StoreTheQuestions.questionT14 = questionT14;
	}
	public static Questions getQuestionT15() {
		return questionT15;
	}
	public static void setQuestionT15(Questions questionT15) {
		StoreTheQuestions.questionT15 = questionT15;
	}
	public static Questions getQuestionT21() {
		return questionT21;
	}
	public static void setQuestionT21(Questions questionT21) {
		StoreTheQuestions.questionT21 = questionT21;
	}
	public static Questions getQuestionT22() {
		return questionT22;
	}
	public static void setQuestionT22(Questions questionT22) {
		StoreTheQuestions.questionT22 = questionT22;
	}
	public static Questions getQuestionT23() {
		return questionT23;
	}
	public static void setQuestionT23(Questions questionT23) {
		StoreTheQuestions.questionT23 = questionT23;
	}
	public static Questions getQuestionT24() {
		return questionT24;
	}
	public static void setQuestionT24(Questions questionT24) {
		StoreTheQuestions.questionT24 = questionT24;
	}
	public static Questions getQuestionT25() {
		return questionT25;
	}
	public static void setQuestionT25(Questions questionT25) {
		StoreTheQuestions.questionT25 = questionT25;
	}
	public static Questions getQuestionT31() {
		return questionT31;
	}
	public static void setQuestionT31(Questions questionT31) {
		StoreTheQuestions.questionT31 = questionT31;
	}
	public static Questions getQuestionT32() {
		return questionT32;
	}
	public static void setQuestionT32(Questions questionT32) {
		StoreTheQuestions.questionT32 = questionT32;
	}
	public static Questions getQuestionT33() {
		return questionT33;
	}
	public static void setQuestionT33(Questions questionT33) {
		StoreTheQuestions.questionT33 = questionT33;
	}
	public static Questions getQuestionT34() {
		return questionT34;
	}
	public static void setQuestionT34(Questions questionT34) {
		StoreTheQuestions.questionT34 = questionT34;
	}
	public static Questions getQuestionT35() {
		return questionT35;
	}
	public static void setQuestionT35(Questions questionT35) {
		StoreTheQuestions.questionT35 = questionT35;
	}
	
	public static Questions getQuestionM11() {
		return questionM11;
	}
	public static void setQuestionM11(Questions questionM11) {
		StoreTheQuestions.questionM11 = questionM11;
	}
	public static Questions getQuestionM12() {
		return questionM12;
	}
	public static void setQuestionM12(Questions questionM12) {
		StoreTheQuestions.questionM12 = questionM12;
	}
	public static Questions getQuestionM13() {
		return questionM13;
	}
	public static void setQuestionM13(Questions questionM13) {
		StoreTheQuestions.questionM13 = questionM13;
	}
	public static Questions getQuestionM14() {
		return questionM14;
	}
	public static void setQuestionM14(Questions questionM14) {
		StoreTheQuestions.questionM14 = questionM14;
	}
	public static Questions getQuestionM15() {
		return questionM15;
	}
	public static void setQuestionM15(Questions questionM15) {
		StoreTheQuestions.questionM15 = questionM15;
	}
	public static Questions getQuestionM21() {
		return questionM21;
	}
	public static void setQuestionM21(Questions questionM21) {
		StoreTheQuestions.questionM21 = questionM21;
	}
	public static Questions getQuestionM22() {
		return questionM22;
	}
	public static void setQuestionM22(Questions questionM22) {
		StoreTheQuestions.questionM22 = questionM22;
	}
	public static Questions getQuestionM23() {
		return questionM23;
	}
	public static void setQuestionM23(Questions questionM23) {
		StoreTheQuestions.questionM23 = questionM23;
	}
	public static Questions getQuestionM24() {
		return questionM24;
	}
	public static void setQuestionM24(Questions questionM24) {
		StoreTheQuestions.questionM24 = questionM24;
	}
	public static Questions getQuestionM25() {
		return questionM25;
	}
	public static void setQuestionM25(Questions questionM25) {
		StoreTheQuestions.questionM25 = questionM25;
	}
	public static Questions getQuestionM31() {
		return questionM31;
	}
	public static void setQuestionM31(Questions questionM31) {
		StoreTheQuestions.questionM31 = questionM31;
	}
	public static Questions getQuestionM32() {
		return questionM32;
	}
	public static void setQuestionM32(Questions questionM32) {
		StoreTheQuestions.questionM32 = questionM32;
	}
	public static Questions getQuestionM33() {
		return questionM33;
	}
	public static void setQuestionM33(Questions questionM33) {
		StoreTheQuestions.questionM33 = questionM33;
	}
	public static Questions getQuestionM34() {
		return questionM34;
	}
	public static void setQuestionM34(Questions questionM34) {
		StoreTheQuestions.questionM34 = questionM34;
	}
	public static Questions getQuestionM35() {
		return questionM35;
	}
	public static void setQuestionM35(Questions questionM35) {
		StoreTheQuestions.questionM35 = questionM35;
	}
	
}
