import java.util.Scanner;
public class Main{
  public static void main(String[] args) {

    int sayi1, sayi2, islem;
    Scanner input = new Scanner(System.in);

    System.out.print("1. Sayiyi giriniz: ");
    sayi1 = input.nextInt();
    System.out.print("2. Sayiyi giriniz: ");
    sayi2 = input.nextInt();

    System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
    System.out.print("Seciminiz: ");
    islem = input.nextInt();

    switch (islem) {
      case 1:
        System.out.println("Toplam: " + (sayi1 + sayi2));
        break;

      case 2:
        System.out.printf("Cikarma: %d\n", sayi1 - sayi2);
        break;

      case 3:
        System.out.println("Carpim: " + sayi1 * sayi2);
        break;

      case 4:
        if(sayi2 != 0){
          System.out.println("Bolum: " + sayi1 / sayi2);
        }
        else{
          System.out.println("Bir sayi 0'a bolunmez.");
        }
        break;

      default:
        System.out.println("Tekrar deneyiniz.");
        break;
    }

  }
}
