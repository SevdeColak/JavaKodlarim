import java.util.Scanner;
public class Main{
  public static void main(String[] args) {

    String userName, password, sifirlama, newPassword;
    Scanner input = new Scanner(System.in);

    System.out.print("Kullanici adini giriniz: ");
    userName = input.nextLine();
    System.out.print("Sifrenizi giriniz: ");
    password = input.nextLine();

    if(userName.equals("patika") && password.equals("java123")){
      System.out.println("Giris Yaptiniz!");
    }

    else{
      System.out.println("Bilgileriniz yanlis!");
    }

    if(password.equals("java123")){
      System.out.println("Kullanici adini yanlis girdiniz!");
    }
    else{
      System.out.print("Sifreniz yanlis sifirlamak ister misiniz ? (evet/hayır) ");
      sifirlama = input.nextLine();

      if(sifirlama.equals("evet")){
        System.out.print("Yeni sifrenizi giriniz: ");
        newPassword = input.nextLine();
        while (0==0) {
          if(newPassword.equals("java123")){
            System.out.print("Sifre olusturulamadi, lutfen baska sifre giriniz: ");
            newPassword = input.nextLine();
          }
          else{
            System.out.println("Sifre olusturuldu");
            break;
          }
        }
      }
      else{
        System.out.println("Tekrar Deneyiniz.");
      }
    }



  }

}
