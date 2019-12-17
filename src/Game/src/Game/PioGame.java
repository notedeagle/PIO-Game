package Game;

public class PioGame {
    
    public static void main(String[] args) {
        
        //Statistics stats = new Statistics();
        //Game game = new Game();
        //Game game = new Game(new NullStatistics());
        Game game = new Game(new WinStatistics());
        
        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Marian"));

        for (int i = 0; i < 100; i++) {
            game.play();
        }
  
        game.stats.print();
    }
}
