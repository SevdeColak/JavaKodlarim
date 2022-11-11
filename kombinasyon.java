/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li
kombinasyonu C(n,r) şeklinde gösterilir. Java ile kombinasyon hesaplayan
program.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int i, n, r, sonuc_n=1, sonuc_r=1, sonuc=1, x = 0;

    System.out.print("Eleman sayisini girin (n): ");
    n = inp.nextInt();

    System.out.print("Kaç farkli grup sayisi (r): ");
    r = inp.nextInt();

    if(r > n){System.out.print("Hatali giris!!");}
    else{
      for(i=n; x < r; i--){
        sonuc_n = sonuc_n * i;
        x++;
      }

      for(i=r; i>0; i--){
        sonuc_r = sonuc_r * i;
      }

      System.out.print("Kombinasyon sonucu: " + sonuc_n / sonuc_r);
    }
  }
}
