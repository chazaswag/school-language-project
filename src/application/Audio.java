package application;
import java.nio.file.Paths;

import javafx.scene.media.AudioClip;
public class Audio {
	AudioClip burger_snd;
	AudioClip water_snd;
	AudioClip coffee_snd;
	AudioClip readaloud1;
	AudioClip readaloud2;
	AudioClip readaloud3;

public Audio() {
	burger_snd = new AudioClip(Paths.get("src/snd/test/burger.wav").toUri().toString());
	water_snd = new AudioClip(Paths.get("src/snd/test/noodles.wav").toUri().toString());
	coffee_snd = new AudioClip(Paths.get("src/snd/test/coffee.wav").toUri().toString());
	readaloud1 = new AudioClip(Paths.get("src/snd/accessibility/testreadaloud1.mp3").toUri().toString());
	readaloud2 = new AudioClip(Paths.get("src/snd/accessibility/testreadaloud2.mp3").toUri().toString());
	readaloud3 = new AudioClip(Paths.get("src/snd/accessibility/testreadaloud3.mp3").toUri().toString());
}
}