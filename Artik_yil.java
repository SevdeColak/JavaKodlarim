import  java.util.Scanner;

public class Main{
//Girilen yılın artık yıl olup olmadığını bulan program.
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int yil;

      System.out.print("Yil giriniz:  ");
        yil = inp.nextInt();


      if(yil%100 == 0){
        if (yil%400 == 0) {
          System.out.println(yil + " artik yildir.");
        }
        else {
          System.out.print(yil + " artik yil degildir.");
        }
      }
      else if(yil%4 == 0 && a==0){
        System.out.println(yil + " artik yildir.");
      }
      else {
        System.out.print(yil + " artik yil degildir.");
      }

    }
}
