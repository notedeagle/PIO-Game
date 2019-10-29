package game;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        
        Random dice = new Random();
        //Player player = new Player();
        PlayerHuman player  = new PlayerHuman("Marek");
        
        int number;
        int guess;
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowano: " + number);
            
            guess = player.guess();
            System.out.println(player.getName() + " odgaduje: " + guess);
            
            if(guess != number) {
                System.out.println("Źle!\n");
            }
            
        }
        while(number != guess);
        
        System.out.println("Brawo!");
    }
}