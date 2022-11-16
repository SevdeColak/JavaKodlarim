import java.util.Scanner;

public class Main{

  static void palindrom(int sayi){

    int basamak, kat=1, ters=0, i;

    for (i=sayi/10; i!= 0; i=i/10) {
      kat = kat * 10;
    }

    for (i=sayi; i!= 0; i=i/10) {
      basamak = i%10;
      ters = ters + (basamak*kat);
      kat = kat/10;
    }

    if (sayi == ters) {
      System.out.print(sayi + " palindromik bir sayidir.");
    }
    else{
      System.out.print(sayi + " palindromik bir sayi degildir.");
    }
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int sayi;

    System.out.print("Sayiyi giriniz: ");
    sayi = input.nextInt();

    palindrom(sayi);
  }
}
