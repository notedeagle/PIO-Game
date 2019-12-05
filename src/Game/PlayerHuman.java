package Game;
import java.util.Scanner;

public class PlayerHuman extends Player {
    
    Scanner in = new Scanner(System.in);
    
    public PlayerHuman() {
    }

    public PlayerHuman(String name) {
        super(name);
    }


    @Override
    public int guess() {
        System.out.println("Podaj odgadywana liczbe[1-6]: ");
        return in.nextInt();
    }
    
    
}
