import java.util.Scanner;

public class Main{

    static void oruntu(int sayi, int x, int j) {

        System.out.print(sayi + " ");

        if (x > j) {
          oruntu(sayi - 5, x-1, j);
        }
        else if(x != 0){
          oruntu(sayi + 5, x - 1, j);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi, x, i, j;

        System.out.print("Sayiyi giriniz :");
        sayi = input.nextInt();
        x = sayi;

        for ( i = 0; x > 0; i++) {
            x -= 5;
        }

        j = i;
        oruntu(sayi, i*2, j);

    }
}
