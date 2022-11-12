/*Yıldızlardan elmas yapmak.*/
/*
   *
  ***
 *****
*******
 *****
  ***
   *
*/
import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int sayi, i, j, x=0;

    System.out.print("Sayi giriniz: ");
    sayi = inp.nextInt();

//Elmasın üst tarafı
    for(i=1; i<=sayi; i++){

      for(j=0; j<sayi-i; j++){
        System.out.print(" ");
      }

      for (j=0; j<=x; j++) {
        System.out.print("*");
      }
      System.out.printf("\n");
      x+=2;
    }
//Elmasın alt tarafı
    x = x - 2;
    for(i=sayi-1; i>0; i--){

      for(j=0; j<sayi-i; j++){
        System.out.print(" ");
      }
      x-=2;
      for (j=0; j<=x; j++){
        System.out.print("*");
      }
      System.out.printf("\n");

    }


  }
}
