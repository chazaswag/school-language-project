package application;
import java.nio.file.Paths;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
public class Video {
	
	Media timervideo;
	MediaPlayer timerplayer;
	MediaView timer;
	
	
	
	public Video() {
		timervideo = new Media(Paths.get("src/mov/20timer.mp4").toUri().toString());
		timerplayer = new MediaPlayer(timervideo);
		timer = new MediaView(timerplayer);
		
	}
}