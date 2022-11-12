//EBOB-EKOK bulma
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int sayi1, sayi2, ebob=1, ekok, i=1;

    System.out.print("1. Sayiyi giriniz: ");
    sayi1=input.nextInt();
    System.out.print("2. Sayiyi giriniz: ");
    sayi2=input.nextInt();

    while (i != sayi1+1 && i != sayi2+1) {
      if(sayi1%i==0 && sayi2%i==0){ebob = i;}
      i++;
    }
    
    ekok = (sayi1*sayi2)/ebob;

    System.out.println("EBOB'u: " + ebob);
    System.out.print("EKOK'u: " + ekok);
  }
}
