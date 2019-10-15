package Game;

import java.util.Random;

public class Player {

    private Random dice = new Random();

    private String name;

    void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.err.println("Błąd!");
        }
    }

    String getName() {
        return name;
    }

public int roll() {
    return dice.nextInt(6) + 1;
}
}
