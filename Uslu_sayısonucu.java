/*Üs alan program.*/

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int taban, kuvvet, i, sonuc=1; //tabana kuvvet :D

    System.out.print("Us alinacak sayiyi giriniz: ");
    taban = inp.nextInt();

    System.out.print("Kuvvetini giriniz: ");
    kuvvet = inp.nextInt();


      for(i=0; i < kuvvet; i++){
        sonuc = sonuc * taban;
      }

      System.out.print("Sonuc: " + sonuc);

  }
}
