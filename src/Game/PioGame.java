package Game;
import java.util.Random;

public class PioGame {
    public static void main(String[] args) {
        
        Game game = new Game();

        Player player = new PlayerComp("Mietek");
        game.addPlayer(player);

        game.play();
    }
}