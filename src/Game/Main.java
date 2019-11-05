package game;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random dice = new Random(); //losowanie
       
        Player player = new PlayerComp(); // new PlayerComp()/new PlayerHuman() 
           //polimorfizm
           
        try {
            player.setName("Mietek"); //null
        } catch (IllegalArgumentException janusz) {
            System.err.println("Błąd! " + janusz.getMessage());
        } catch (Exception janusz) {
            System.err.println("Błąd!");
        }
           
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
}