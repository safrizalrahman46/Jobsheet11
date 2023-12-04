import java.util.Scanner;

public class Star22 {
    // 1. Write a program to find the sum of all numbers from 0 to n using recursion.

    public static void main(String[] args) {
        // int n = 5;
        Scanner ItingsMeledakbboomah22 = new Scanner(System.in); 

        // System.out.printf("Input Nilai N =");
        int N = ItingsMeledakbboomah22.nextInt();

        // printStarPattern(N);
    
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // for (int i = 1; i <= N; i++) {
        //     for (int j = 1; j <= N; j++) {
        //     System.out.print("*");
        // }
        //     // System.out.println();
        //     i++;    
        // }
    
    }     
        
}
