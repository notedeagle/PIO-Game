package Game;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.setName("Marian"); //null -> błąd
        //player.setName(null);

        int number;
        int guess;

        do {
            number = player.roll();
            System.out.println("Wylosowana liczba: " + number);

            guess = player.roll();
            System.out.println(player.getName() + " odgaduję liczbę: " + guess);

            if(number != guess) {
                System.out.println("Źle! Spróbuj ponownie");
            }
        }
        while(number != guess);

        System.out.println("Brawo!");
    }
}
