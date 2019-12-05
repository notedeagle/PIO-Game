package Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Game {
    
    private Player player;
    private List<Player> players = new ArrayList();
    private Random dice = new Random(); //losowanie
            
    public void addPlayer(Player player){
        this.player = player;
        players.add(player);
    }
    public void play(){
       
        int number; //wylosowana liczba
        int guess; //liczba wybrana przez gracz
        boolean repeat;
        
        do {
            System.out.println("--------------------");
            repeat = true;
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowano: " + number);

            for(Player player : players) {
                guess = player.guess();
                System.out.println(player.getName() + " odgaduje: " + guess);

                if(number != guess) {
                    System.out.println("Źle!");
                } else {
                    System.out.println("Brawo!");
                    repeat = false;
                }           
            }
        }
        while(repeat);
        
        
    }
        
}

// wyświetlanie wszystkich graczy + usuwanie graczy (po imieniu) + dokonczyc imie
