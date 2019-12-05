package Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PioGame {
    public static void main(String[] args) {
        
        Game game = new Game();
        
        game.addPlayer(new PlayerComp("Mietek"));
        game.addPlayer(new PlayerComp("Mietek"));
        game.play();
        
    }    
}