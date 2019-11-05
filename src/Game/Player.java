package Game;
import java.util.Random;

public abstract class Player {
    private Random dice = new Random();
    private String name = "Marian";
    
    public Player() {}
    
    public Player(String name) {
        setName(name);
    } 
    
    public void setName(String name) {
        
        if(name != null && name.matches("^[A-Za-z0-9~.]{3,}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imię!");
        }
        
    }
    
    public String getName() {
        return name;
    }
    
    public abstract int guess();
}
