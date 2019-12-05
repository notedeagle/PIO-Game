package Game;

import java.util.Scanner;

public class PioGame {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        Game game = new Game();

        System.out.println("Podaj liczbe graczy:");
        int numOfPlayers = in.nextInt();

        do {
            System.out.println("Wybierz rodzaj gracza:\n1. Czlowiek\n2. Komputer");
            int num = in.nextInt();
            if (num == 1) {
                game.addPlayer(new PlayerHuman());
            } else if (num == 2) {
                game.addPlayer(new PlayerComp("Komputer"));
            } else {
                System.out.println("Zla opcja! Wybierz ponownie.");
                numOfPlayers--;
            }
            numOfPlayers--;
        } while(numOfPlayers != 0);

        game.play();


    }
}