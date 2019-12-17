import Player.Player;
import Statistics.Statistics;
import Statistics.NullStatistics;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Iterator;

public class Game {
    
    private Player player;
    private List<Player> players = new ArrayList();
    private Random dice = new Random(); //losowanie
    public final Statistics stats;

    public Game() {
        this(null);
    }

    public Game (Statistics stats) {
        if (stats != null) {
            this.stats = stats;
        } else {
            this.stats = new NullStatistics();
        }
    }

    public void addPlayer(Player player) {
        if (!playerNameOnList(player.getName())) {
            players.add(player);
        } else {
            player.setName(player.getName() + dice.nextInt(10));
            addPlayer(player);
        }
    }

    private boolean playerNameOnList(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printPlayers() {
        System.out.println("Lista dodanych graczy:");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    void removePlayer(String name) {
        Iterator<Player> it = players.iterator();
        do {
            Player p = it.next();
            if (p.getName().equals(name)) {
                it.remove();
                System.out.println("Gracz " + name + " usuniety.");
            }
        } while (it.hasNext());
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
                    stats.andTheWinnerIs(player);
                }           
            }
        }
        while(repeat);
    }
}


