//Girilen sayının mükkemel sayı olup olmadığını bulan program.
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int sayi, i, toplam=0;

    System.out.print("Sayinizi giriniz: ");
    sayi = input.nextInt();

    for(i=1; i<=sayi/2; i++){
        if(sayi%i == 0){
          toplam = toplam + i;
        }
      }
      if(toplam == sayi){
        System.out.print(sayi + " mukemmel sayidir.");
      }
      else{
        System.out.print(sayi + " mukemmel sayi degildir.");
      }
  }
}
