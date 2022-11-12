//ATM Projesi
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String userName, password;
    int secim=0, bakiye = 1500, deneme=3, para;

    while (deneme>0) {
      System.out.print("Kullanici adiniz: ");
      userName = input.nextLine();
      System.out.print("Sifreniz: ");
      password = input.nextLine();

      if (userName.equals("patika") && password.equals("dev123")) {
        System.out.println("Merhaba Kodluyoruz Bankasına Hosgeldiniz.");
        while (secim != 4) {
          System.out.println("1-Para yatirma\n"+"2-Para Cekme\n"+"3-Bakiye ogrenme\n"+"4-Cikis yap");
          System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
          secim = input.nextInt();
          switch (secim) {
            case 1:
              System.out.print("Para miktarini giriniz: ");
              para = input.nextInt();
              bakiye+=para;
              break;
            case 2:
              System.out.print("Para miktarini giriniz: ");
              para = input.nextInt();
              if(para>bakiye){System.out.println("Bakiye yetersiz.");}
              else{bakiye-=para;}
              break;
            case 3:
              System.out.println("Bakiyeniz: "+ bakiye);
              break;
            case 4:
              System.out.println("Tekrar gorusmek uzere.");
              break;
          }
        }
        if (secim==4) {break;}
      }
      else{
        deneme--;
        if(deneme == 0){System.out.println("Hesabınız bloke olmustur. Bankayla iletisime gecin.");}
        else{System.out.println("Hatali giris yaptiniz. Tekrar Deneyiniz."); System.out.println("Kalan hakkiniz: "+ deneme);}
      }
    }


  }
}
