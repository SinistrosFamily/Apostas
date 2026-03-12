import java.util.Random;
import java.util.Scanner;
public class DiceRoll {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) throws InterruptedException {
        int nDice, total = 0;

        System.out.print("How many dices you wanna roll?: ");
        nDice = scanner.nextInt();
        if(nDice>0){
            for(int i = 0;i<nDice;i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.printf("You rolled: %d\n", roll);
                total += roll;              
                Thread.sleep(500);
            }
            System.out.println("Total: "+total);
        }
        else{
            System.out.println("# of dices must be greater than 0");
        }
    }
    static void printDie(int roll){

        String d1 = """
                 -------
                |       |
                |   @   |
                |       |
                 -------
                """;
        String d2 = """
                 -------
                | @     |
                |       |
                |     @ |
                 -------
                """;
        String d3 = """
                 -------
                | @     |
                |   @   |
                |     @ |
                 -------
                """;
        String d4 = """
                 -------
                | @   @ |
                |       |
                | @   @ |
                 -------
                """;
        String d5 = """
                 -------
                | @   @ |
                |   @   |
                | @   @ |
                 -------
                """;
        String d6 = """
                 -------
                | @   @ |
                | @   @ |
                | @   @ |
                 -------
                """;
        switch (roll) {
            case 1-> System.out.print(d1);
            case 2-> System.out.print(d2);
            case 3-> System.out.print(d3);
            case 4-> System.out.print(d4);
            case 5-> System.out.print(d5);
            case 6-> System.out.print(d6);
            default -> System.out.print("Invalid Roll!");
        }
    }
}