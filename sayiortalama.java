//girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int sayi, i, toplam = 0, x = 0;

    System.out.print("Sayi giriniz: ");
    sayi = inp.nextInt();

    for (i = 1; i <= sayi ; i++){
      if (i%3==0 && i%4==0) {
          toplam += i;
          x++;
      }
    }
    System.out.print("toplam: " + toplam/x + " " + toplam);

  }

}
