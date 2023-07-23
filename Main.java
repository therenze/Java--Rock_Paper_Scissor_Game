import java.util.Scanner;
import java.util.Random;
public class Main {
 public static void main(String[] args) {
    System.out.print("\n\n=======Rock-Paper-Scissor Game======\n");

    System.out.print("\n\nCHOOCE\n[rock] for Rock\n[paper] for Paper\n[scissor] for Scissor\n\n");


        String[] bot = {"rock","paper","scissor"};
        String botMove = bot[new Random().nextInt(bot.length)];

        Scanner player = new Scanner(System.in);
        String move;

        while(true){

            System.out.print("Player: ");
            move = player.nextLine();
            if (move.equals("rock") || move.equals("paper") || move.equals("scissor") ){
                break;
            }
            System.out.println(move + "is not a valid move.\n");

        }
        System.out.println("Computer: " + botMove);


        if(move.equals(botMove)){
            System.out.println("Game was a tie!.");             
        }

        else if (move.equals("rock")) {
            if(botMove.equals("paper")){
                System.out.println("You Lose!");
            }else if (botMove.equals("scissor")){
                System.out.println("You Win!");
            }
        }

        else if (move.equals("paper")) {
            if(botMove.equals("rock")){
                System.out.println("You Win!");
            }else if (botMove.equals("scissor")){
                System.out.println("You lose!");
            }
        }

        else if (move.equals("scissor")) {
            if(botMove.equals("paper")){
                System.out.println("You Win!");
            }else if (botMove.equals("rock")){
                System.out.println("You lose!");
            }
        }
 }   
}
