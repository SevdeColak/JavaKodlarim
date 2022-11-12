//Fibonacci serisi
import java.util.Scanner;
public class Main{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int n, i, y=1, toplam=0, x=0, j, a=0;

    System.out.print("Kac elemanli fibonacci serisi olsun: ");
    n = input.nextInt();

    System.out.print(n + " elemanli fibonnaci serisi: 0 1 ");
     for (i=1; i<=n-2; i++) {
       for (j=0; j<i; j++) {
         toplam = x + y;
         x = y;
         y = toplam;
       }
       System.out.print(toplam + " ");
       toplam = 0;
       x = 0;
       y = 1;
     }

  }
}
