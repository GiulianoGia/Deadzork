package ch.bbw.Deadzork;

import ch.bbw.Deadzork.Logic.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@SpringBootApplication
public class DeadzorkApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(DeadzorkApplication.class, args);
		Game game = new Game();
		game.startGame();
	}
}
