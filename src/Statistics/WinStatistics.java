package Statistics;

import Player.Player;

import java.util.Map;
import java.util.HashMap;

public class WinStatistics implements Statistics {

    private Map<Player, Integer> stats = new HashMap();

    @Override
    public void andTheWinnerIs(Player player) {
        int score = stats.getOrDefault(player, 0);
        score++;
        stats.put(player, score);
    }

    @Override
    public void print() {
        System.out.println("##############################");
        stats.forEach((player, score) -> {
            System.out.println(player.getName() + " " + score);
        });
    }

    @Override
    public void clear() {
        stats.clear();
    }
}
