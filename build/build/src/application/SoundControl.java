/*
Leo Zhu, November 30th, ICS3U1-02 FERNANDES,N.
Purpose: the control of the sound which is linked to every class and can be changed with the setting class
Description: with a boolean it will decided whether there should be a sound or not, and if so, which sound should it be.
Major Skills: The ability to store the variables in an class
Extra Features: Sound Effect, javaFx
Concerns: Maybe I can add more functionalities
*/

package application;

import java.io.File;

import javafx.scene.media.Media;

public class SoundControl {
	public static boolean haveHoverSound=false;
	public static boolean haveClickedSound=true;
	
	private static Media hoverSound = new Media(new File("ButtonHover.mp3").toURI().toString());
	private static Media clickedSound = new Media(new File("ButtonClicked.mp3").toURI().toString());
	private static Media noSound = new Media(new File("noSound.mp3").toURI().toString());
	
	public static Media getHoverSound() {
		if (haveHoverSound)
			return hoverSound;
		else
			return noSound;
	}
	public static void setHoverSound(Media hoverSound) {
		SoundControl.hoverSound = hoverSound;
	}
	public static Media getClickedSound() {
		if (haveClickedSound)
			return clickedSound;
		else
			return noSound;
	}
	public static void setClickedSound(Media clickedSound) {
		SoundControl.clickedSound = clickedSound;
	}
	
	
}
