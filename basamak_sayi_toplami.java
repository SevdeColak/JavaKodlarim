/*Bir sayının basamak sayılarının toplamını hesaplayan program*/

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int sayi, i, basamak, toplam =0; //tabana kuvvet :D

    System.out.print("Sayiyi giriniz: ");
    sayi = inp.nextInt();

    while(sayi!=0){
      basamak = sayi%10;
      toplam = toplam+basamak;
      sayi = sayi/10;
    }

    System.out.print("Sonuc: " + toplam);

  }
}
