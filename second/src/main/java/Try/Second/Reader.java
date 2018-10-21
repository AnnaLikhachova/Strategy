package Try.Second;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Reader {

	Reader() {

	}

	public String read(String string) throws IOException {
		Locale.setDefault(new Locale("ru"));
		String line = null;
		BufferedReader reader = null;
		reader = new BufferedReader(new InputStreamReader(new FileInputStream(string), StandardCharsets.UTF_8));
		String result = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			result += line + "\n";
		}
		reader.close();
		return result;
	}

	public String readStory(String string) throws IOException {
		URL url = this.getClass().getClassLoader().getResource(string);
		FileInputStream fstream = new FileInputStream(url.toString());
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;
		String result = "";
		while ((strLine = br.readLine()) != null) {
			result += strLine;
		}
		br.close();
		return result;
	}

	public String readFile(String string) throws IOException {
		StringBuilder stringBuffer = new StringBuilder();
		InputStream inputStream = getClass().getResourceAsStream(string);
		System.out.print(string);
		BufferedReader bufferedReader = null;
		if (inputStream == null) {
			System.out.println("B is null");
		} else {
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String text;
			while ((text = bufferedReader.readLine()) != null) {
				stringBuffer.append(text);
			}
		}
		bufferedReader.close();
		return stringBuffer.toString();
	}
	
	public MediaView playVideo(String string) {
		 File f = new File(string);
		 Media m = new Media(f.toURI().toString());
		 MediaPlayer mp = new MediaPlayer(m);
		 mp.setAutoPlay(true);
		 MediaView mv = new MediaView(mp);
		 return mv;
	}
		
}
