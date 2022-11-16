import java.util.Scanner;

public class Main{

    static int asal(int sayi, int i) {

        if (i <= sayi/2){
          if (sayi%i == 0) {
            return 0;
          }
          else{
            return asal(sayi, i+1);
          }
        }
        else {
          return 1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi, kontrol;

        System.out.print("Sayiyi giriniz :");
        sayi = input.nextInt();

        kontrol = asal(sayi, 2);

        if(kontrol == 0){
          System.out.print(sayi + " asal sayi degildir");
        }
        else{
          System.out.print(sayi + " asal sayidir");
        }

    }
}
