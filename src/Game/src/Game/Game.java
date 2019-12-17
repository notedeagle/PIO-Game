package Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

    private List<Player> players = new ArrayList();
    private Random dice = new Random();
    public final Statistics stats;
    
    public Game() {
        this(null);
    }
    
    public Game(Statistics stats) {
        if (stats != null) {
            this.stats = stats;
        } else {
            this.stats = new NullStatistics();
        }
    }
    
    public void addPlayer(Player player) {
        
        String s = "";
        int i = 1;
        
        for(int k = 0; k < players.size(); k++) {
            for(Player p : players) {
                if(p.getName().equals(player.getName() + s)) {
                    s = String.valueOf(i++);
                }            
            }
        }
        
        player.setName(player.getName() + s);
        players.add(player);
    }
    
    public void removePlayer(String name) {
        
    /*    for(Iterator<Player> it = players.iterator(); it.hasNext();) {
            if(it.next().getName().equals(name)) {
                it.remove();
                break;
            }
        } */
        players.removeIf( (Player player) -> player.getName().equals(name) );   // wyrażenie lambda
    }
    
    
    public void printPlayers() {
        
        int k = 1;
        System.out.println("-------------------\nLista graczy:");
        
        for(Player p : players) {
            System.out.println(k++ + ". " + p.getName());
        }
        
        System.out.println("-------------------");
    }

    public void play() {
        
        int number; //wylosowana liczba
        int guess; // strzal gracza
        boolean repeat;

        do {
            System.out.println("-----------------");
            
            repeat = true;
            
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowano: " + number);
            
            for(Player player : players) {
                guess = player.guess(); //odgadywanie zlecamy obiektowi klasy Player
                System.out.println(player.getName() + " odgaduje: " + guess);

                if(number != guess) {
                    System.out.println("Źle!");
                } else {
                    System.out.println("Brawo!");
                    repeat = false;
                    stats.andTheWinnersIs(player);
                }
            }
        } while(repeat);
    }
    
}
