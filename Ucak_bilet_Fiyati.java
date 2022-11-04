import  java.util.Scanner;

public class Main{
//Uçak bileti fiyatını hesaplayan program.

/*
Mesafe başına ücret 0,10/km TL
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int mesafe, yas, yolculukTipi;
      double tutar;

      System.out.print("Ucacağınız mesafeyi(km) giriniz:  ");
        mesafe = inp.nextInt();
      System.out.print("Yasinizi giriniz: ");
        yas = inp.nextInt();
      System.out.print("Yolculuk tipinizi giriniz(Tek Yon = 1 / Gidis-Donus = 2): ");
        yolculukTipi = inp.nextInt();

      tutar = mesafe * 0.10;

      if(yas < 12){
        tutar = tutar - (tutar*0.50);
      }
      else if (yas >= 12 && yas <= 24) {
        tutar = tutar - (tutar*0.10);
      }
      else if(yas > 65){
        tutar = tutar - (tutar*0.30);
      }

      if(yolculukTipi == 2){
        tutar = (tutar - (tutar*0.20))*2;
      }

      if(mesafe < 0 || yas < 0 || (yolculukTipi != 1  && yolculukTipi != 2)){
        System.out.println("Hatali veri girdiniz.");
      }
      else{
        System.out.println("Toplam tutar: "+ tutar + "TL");
      }
    }
}
