import  java.util.Scanner;

public class Main{
//Hava durumuna göre etkinlik öneren program.
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int sicaklik;

      System.out.print("Sicaklik degerini giriniz: ");
        sicaklik = inp.nextInt();

          if(sicaklik < 5){System.out.println("Bugun kayak yapmaya ne dersin.");}
          else if(sicaklik < 15){System.out.println("Vizyonda cok guzel filmler varmis. Hadi sinemaya:D");}
          else if(sicaklik < 25){System.out.println("Kap mangali pikniğe gidiyoruz.");}
          else{System.out.println("Yuzmeye gitmek icin daha neyi bekliyorsun >:/");}
    }
}
