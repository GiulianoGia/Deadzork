package ch.bbw.Deadzork;

<<<<<<< Updated upstream
import ch.bbw.Deadzork.Logic.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
=======
import ch.bbw.Deadzork.Models.Room;
import ch.bbw.Deadzork.Models.Subject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
>>>>>>> Stashed changes

@SpringBootApplication
public class DeadzorkApplication {

<<<<<<< Updated upstream
	public static void main(String[] args) throws FileNotFoundException {
=======
	public static void main(String[] args) {
		Subject example = new Subject("example", 2, 1);
		Subject example1 = new Subject("example1", 3, 1);
		ArrayList<Subject> itemsCrashsite = new ArrayList<>();
		itemsCrashsite.add(example);
		itemsCrashsite.add(example1);

		Room crashsite = new Room("crashsite", itemsCrashsite, );

>>>>>>> Stashed changes
		SpringApplication.run(DeadzorkApplication.class, args);
		Game game = new Game();
		game.startGame();
	}
}
