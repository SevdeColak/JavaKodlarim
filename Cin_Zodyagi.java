import  java.util.Scanner;

public class Main{
//Çin Zodyağı değerini hesaplayan program
//kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int yil, kalan;

      System.out.print("Dogdugunuz yili giriniz:  ");
        yil = inp.nextInt();

      kalan = yil%12;

      switch (kalan) {
        case 0:
          System.out.println("Cin zodyaginiz 'Maymun'");
          break;
        case 1:
          System.out.println("Cin zodyaginiz 'Horoz'");
          break;
        case 2:
          System.out.println("Cin zodyaginiz 'Kopek'");
          break;
        case 3:
          System.out.println("Cin zodyaginiz 'Domuz'");
          break;
        case 4:
          System.out.println("Cin zodyaginiz 'Fare'");
          break;
        case 5:
          System.out.println("Cin zodyaginiz 'Okuz'");
          break;
        case 6:
          System.out.println("Cin zodyaginiz 'Kaplan'");
          break;
        case 7:
          System.out.println("Cin zodyaginiz 'Tavsan'");
          break;
        case 8:
          System.out.println("Cin zodyaginiz 'Ejderha'");
          break;
        case 9:
          System.out.println("Cin zodyaginiz 'Yilan'");
          break;
        case 10:
          System.out.println("Cin zodyaginiz 'At'");
          break;
        case 11:
          System.out.println("Cin zodyaginiz 'Koyun'");
          break;

      }
    }
}
