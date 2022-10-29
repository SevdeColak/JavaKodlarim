import  java.util.Scanner;

public class Main{
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program.
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int r;
      double a, sonuc, pi=3.14;

      System.out.print("Yaricap giriniz: ");
      r = inp.nextInt();

      System.out.print("Merkez acisinin olcusunu giriniz: ");
      a = inp.nextDouble();

      sonuc = (pi*(r*r)*a)/360;
      System.out.printf("%.1f",sonuc);

    }
}
