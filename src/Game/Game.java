package Game;
import java.util.Random;

public class Game {

    private Player player;
    private Random dice = new Random(); //losowanie

    public void addPlayer(Player player) {
        this.player = player;
    }

    public void play() {
        int number; //wylosowana liczba
        int guess; //liczba wybrana przez gracz

        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowano: " + number);

            guess = player.guess();
            System.out.println(player.getName() + " odgaduje: " + guess);

            if(guess != number) {
                System.out.println("Źle!");
                System.out.println("--------------------");
            }
        }
        while(number != guess);

        System.out.println("Brawo!");
    }

    //try {
    //    player.setName("Mietek"); //null
    //} catch (IllegalArgumentException ex) {
    //    System.err.println("Błąd! " + ex.getMessage());
    //} catch (Exception janusz) {
    //    System.err.println("Błąd!");
    // }

}


