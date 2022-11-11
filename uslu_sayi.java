/*girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program*/

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int i, sonuc, sayi;

    System.out.print("Sayi gir:");
    sayi = inp.nextInt();

    System.out.println("Kuvvet4 - " + "Kuvvet5");
    for(i=1;i!=sayi;i++){
      System.out.printf("%.0f - %.0f\n", Math.pow(i, 4), Math.pow(i, 5));
    }
    System.out.printf("%.0f - %.0f\n", Math.pow(sayi, 4), Math.pow(sayi, 5));
  }

}
