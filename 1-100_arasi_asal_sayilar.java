//1-100 arasındaki asal sayıları bulan program.

public class Main{

  public static void main(String[] args) {

    int asal = 0, i, j;

    System.out.print("2");

    for (i=3; i<100; i+=2) {
      for (j=1; j<=i/2; j++) {

        if(i%j==0 && j != 1){
          asal = 1;
        }

      }

      if (asal == 0) {
        System.out.print(" " + i);
      }

      asal = 0;

    }

  }
}
