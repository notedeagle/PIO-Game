package Game;

import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics {
    
    private Map<Player, Integer> stats = new HashMap();
    
    public void andTheWinnersIs(Player player) {
        int score = stats.getOrDefault(player, 0);
        score++;
        stats.put(player, score);
    }
    
    @Override
    public void print() {
        System.out.println("#############");
    
        stats.forEach( (player, score) ->
            System.out.println(player.getName() + ": " + score)); //przypomina remove-if
    }
    
    @Override
    public void clear() {
        stats.clear();
    }
}

   