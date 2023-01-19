package ch.bbw.Deadzork.Logic;

import ch.bbw.Deadzork.Helper.ScannerHelper;
import ch.bbw.Deadzork.Models.Player;

public class Game {
    private ScannerHelper scanner = new ScannerHelper();

    private Player createNewPlayer() {
        String username = scanner.getUserInput("Wie ist dein Name?");
        return new Player(username);
    }

    private void announceTheGame() {
        // Here should The Game be announced
    }

    private void startGame() {
        Player player = createNewPlayer();
        announceTheGame();
    }
}
