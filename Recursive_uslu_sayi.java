import java.util.Scanner;

public class Main{

    static int uslu(int x, int y) {

        if (y == 0){
          return 1;
        }

        else{
          return x * uslu(x, y-1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int taban, us;

        System.out.print("Taban degeri giriniz :");
        taban = input.nextInt();
        System.out.print("Us degeri giriniz :");
        us = input.nextInt();

        System.out.print(uslu(taban, us));

    }
}
