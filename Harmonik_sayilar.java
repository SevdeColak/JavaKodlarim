/*Girilen sayının harmonik serisini bulan program*/

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int sayi;
    double i=1, toplam=0;

    System.out.print("Sayiyi giriniz: ");
    sayi = inp.nextInt();

    while(i <= sayi){

      toplam = toplam + (1/i);
      i++;

    }

    System.out.print("Sonuc: " + toplam);

  }
}
