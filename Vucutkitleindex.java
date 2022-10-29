import  java.util.Scanner;

public class Main{
//formüle(Kilo (kg) / Boy(m) * Boy(m)) göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayan program.
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      double boy, sonuc;
      int kilo;

      System.out.print("Boyunuzu giriniz: ");
      boy = inp.nextDouble();

      System.out.print("Kilonuzu giriniz: ");
      kilo = inp.nextInt();

      sonuc = kilo/(boy*boy);
      System.out.print("Vucut kitle indexiniz: "+ sonuc);

    }
}
