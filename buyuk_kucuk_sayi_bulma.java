//Girilen sayılardan min ve max olanı bulma.
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int sayi, min=0, max=0, i, n;

    System.out.print("Kac adet sayi gireceksiniz: ");
    n = input.nextInt();

    for(i=0; i<n; i++){
      System.out.print("Sayiyi giriniz: ");
      sayi = input.nextInt();

      if(i == 0){min = sayi; max = sayi;}
      else{
        if(sayi > max){max = sayi;}
        if(sayi < min){min = sayi;}
      }

    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  }
}
