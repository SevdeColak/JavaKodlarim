/* tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program*/

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int sayi, toplam = 0;

    System.out.print("Sayi gir:");
    sayi = inp.nextInt();

    while (sayi%2 == 0){

      if(sayi%2 == 0 && sayi%4 == 0){
          toplam = toplam + sayi;
      }

      System.out.print("Sayi gir:");
      sayi = inp.nextInt();
    }

    System.out.print("toplam = " + toplam);

  }

}
