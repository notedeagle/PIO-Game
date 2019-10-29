package game;
import java.util.Random;

public class PlayerComp extends Player {
    
    Random dice = new Random();
    
    @Override
    public int guess() {        
        return dice.nextInt(6) + 1;
    }
}
