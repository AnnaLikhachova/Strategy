package Try.Second;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Sounder {

	public void playMainSound() throws MalformedURLException, InterruptedException {
		Media m = new Media(getClass().getResource("/Resources/ancient.mp3").toString());
		while(true) {
			new MediaPlayer(m).play();
			TimeUnit.SECONDS.sleep(400);
		}
		
		}

	public void playVideo() throws MalformedURLException {
		Media m = new Media(getClass().getResource("/Resources/fight.mp4").toString());
		new MediaPlayer(m).play();
	}

}
