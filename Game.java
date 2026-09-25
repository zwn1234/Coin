import java.util.Scanner;
public class Game {
    private Player player;
    private Coin coin;
    public Game() {
        player = new Player(100);
        coin = new Coin(Math.random());
        System.out.println("Your inital balance is 100.");
    }
   public void play(){
        Scanner s = new Scanner(System.in);
        System.out.println("How much would you like to risk?");
        int risk = s.nextInt();
        System.out.println("heads or tails?");
        String guess = s.next().toLowerCase();
        player.flip(coin, guess, risk);
        if (player.getBalance() > 0)
            System.out.println("Congrats! Your balance is: " + player.getBalance());
        else
            System.out.println("Sorry! Your balance is: " + player.getBalance());
        play();
    }
}