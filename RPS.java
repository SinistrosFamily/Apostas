import java.util.Random;
import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String pMove,cMove,cAgain;
        boolean again = false;
        String[] choices = {"rock","paper","scissors"};

        do {
            System.out.print("Enter you move (rock, paper, scissors): ");
        pMove=scanner.nextLine().toLowerCase();
        if(!pMove.equals("rock")&&
           !pMove.equals("paper")&&
           !pMove.equals("scissors")){
            System.out.println("Invalid choice");
            continue;
        }
        cMove =choices[random.nextInt(3)];
        System.out.printf("Computer choice: %s\n",cMove);
        if(pMove.equals(cMove)){
            System.out.println("It's a tie!");
        }
        else if((pMove.equals("rock")&&cMove.equals("scissors"))||
                (pMove.equals("paper")&&cMove.equals("rock"))||
                (pMove.equals("scissors")&&cMove.equals("paper"))){
                System.out.println("You win!");  
                }
        else{
            System.out.println("You lose!");  
        }
        System.out.print("Play again (y/n): ");
        cAgain=scanner.nextLine().toLowerCase();
        if (cAgain.equals("y")){
            again = true;
        }
        else {
            again = false;
        }
        } while (again == true); 
        System.out.println("Thanks for playing!");
        scanner.close();
    }
    
}