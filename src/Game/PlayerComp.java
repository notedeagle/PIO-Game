package game;
import java.util.Random;

public class PlayerComp extends Player {
    
    public PlayerComp() {}
    
    public PlayerComp(String name) {
        super(name);
    }
    
    Random dice = new Random();
    
    @Override
    public int guess() {        
        return dice.nextInt(6) + 1;
    }
}
