import  java.util.Scanner;

public class Main{
//Ucgenin alani ve cevresini hesaplayan program(formüle göre)
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int kenar1, kenar2, kenar3, cevre, u;
      double alan;

      System.out.print("1. Kenari giriniz: ");
      kenar1 = inp.nextInt();

      System.out.print("2. Kenari giriniz: ");
      kenar2 = inp.nextInt();

      System.out.print("3. Kenari giriniz: ");
      kenar3 = inp.nextInt();

      u = (kenar1 + kenar2 + kenar3) / 2;

      cevre = 2 * u;
      alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

      System.out.println("Ucgenin cevresi: " + cevre);
      System.out.printf("Ucgenin alani: %.1f", alan);
    }
}
