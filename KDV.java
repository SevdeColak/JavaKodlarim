import  java.util.Scanner;

public class Main{
//KDV tutarı ve KDV'li fiyatı hesaplayan program.
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      double ucret, KDVtutar, KDVfiyat, oran;

      System.out.print("Ucreti giriniz: ");
      ucret = inp.nextDouble();
      oran = ucret < 1000 && ucret > 0 ? 0.18 : 0.08;

      KDVtutar = ucret * oran;
      KDVfiyat = ucret + KDVtutar;

      System.out.println("KDV'siz Fiyat: " + ucret);
      System.out.println("KDV Orani: " + oran);
      System.out.println("KDV'li Fiyat: " + KDVfiyat);
      System.out.printf("KDV Tutari: %.1f", KDVtutar);
    }
}
