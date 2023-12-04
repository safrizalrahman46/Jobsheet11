import java.util.Scanner;
import java.util.Random;
public class Quiz22 {
    public static void main(String[] args) {
        Random random = new Random();
            Scanner scanner22 = new Scanner(System.in);
            char menu = 'y';

            do {
                int number = random.nextInt(10) + 1;
                boolean success = false;

                
            do {
                System.out.print("Random Number (1-10): ");
                int answer = scanner22.nextInt();
                scanner22.nextLine();
                success = (answer == number);
                
                if (answer>number) {
                System.out.println("To Big !");
                    }else if(answer < number)
                System.out.println("To small !");
                
            } while (!success);
            System.out.print("Are yoy wanna repeat the game(Y/y)?");

            menu = scanner22.nextLine().charAt(0);

            } while (menu == 'y' || menu == 'Y');

            scanner22.close();
    }
}
