import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random dice = new Random();
        int number;
        int guess;

        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowana: " + number);

            guess = dice.nextInt(6) + 1;
            System.out.println("Odgadywana: " + guess);

            if(number != guess) {
                System.out.println("Źle! Spróbuj ponownie");
            }
        }
        while(number != guess);

        System.out.println("Brawo!");
    }
}
