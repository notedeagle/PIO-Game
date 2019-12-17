import players.PlayerComp;
import players.PlayerHuman;
import statistics.WinStatistics;

import java.util.Scanner;

public class PioGame {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        Game game = new Game(new WinStatistics());

        System.out.println("Podaj liczbe graczy:");
        int numOfPlayers = in.nextInt();

        do {
            System.out.println("Wybierz rodzaj gracza:\n1. Czlowiek\n2. Komputer");
            int num = in.nextInt();
            if (num == 1) {
                System.out.println("Podaj imie:");
                in.nextLine();
                String name = in.nextLine();
                game.addPlayer(new PlayerHuman(name));
            } else if (num == 2) {
                game.addPlayer(new PlayerComp("Komputer"));
            } else {
                System.out.println("Zla opcja! Wybierz ponownie.");
                numOfPlayers--;
            }
            numOfPlayers--;
        } while(numOfPlayers != 0);

        game.printPlayers();

        int removePlayer;
        do {
            System.out.println("Czy chcesz usunac gracza?\n1. TAK\n2. NIE");

            removePlayer = in.nextInt();

            if (removePlayer == 1) {
                System.out.println("Wpisz imie gracza, ktorego chcesz usunac.");
                in.nextLine();
                String nameToRemove = in.nextLine();
                game.removePlayer(nameToRemove);
            }
        } while (removePlayer != 2);

        for (int i = 0; i < 100; i++) {
            game.play();
        }

        game.stats.print();
    }
}