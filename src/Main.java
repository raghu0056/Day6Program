import java.util.Scanner;
 public class Main {

     public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
         System.out.println("Enter a number :");
         int n = s.nextInt();

         int count = 0;
         if (n <= 1) {
             System.out.println("The number is not prime");
             return;
         }

         for (int i = 1; i <= n / 2; i++) {
             if (n % i == 0) {
                 count++;
             }
         }
         if (count > 1) {
             System.out.println("The number is not prime");
         } else {
             System.out.println("The number is prime");
         }
     }
 }