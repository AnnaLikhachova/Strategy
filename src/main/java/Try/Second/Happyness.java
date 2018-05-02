package Try.Second;

import java.io.File;

import javafx.scene.image.Image;

public class Happyness {
	Play scr;

	Happyness(Play scr) {
		this.scr = scr;
	}

	public int motionHappy(int a, int b, int c, int d) {
		int h = ((a + b + c + d) / 10);
		return h;
	}
	
	public int raiseHappy(int happy) {
		
		if(happy<30) {
			scr.setGoldK(scr.getGoldK() - 10);
		}
		return scr.getGoldK();
	}
	

	public Image statusHappy(int happy) {
		Image i = new Image(getClass().getResourceAsStream("/Resources/veryhappy.png"));
		if (happy < 70) {
			i = new Image(getClass().getResourceAsStream("/Resources/nothappy.png"));
		} else if (happy < 40) {
			i = new Image(getClass().getResourceAsStream("/Resources/angryhappy.png"));
		}
		return i;
	}
}
