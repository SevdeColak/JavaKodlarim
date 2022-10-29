import  java.util.Scanner;

public class Main{
//kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program.
/*Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      double armut, elma, domates, muz, patlican, toplam;

      System.out.print("Armut kac kilo: ");
      armut = inp.nextDouble();

      System.out.print("Elma kac kilo: ");
      elma = inp.nextDouble();

      System.out.print("Domates kac kilo: ");
      domates = inp.nextDouble();

      System.out.print("Muz kac kilo: ");
      muz = inp.nextDouble();

      System.out.print("Patlican kac kilo: ");
      patlican = inp.nextDouble();

      toplam = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
      System.out.printf("Toplam tutar: %.2f TL", toplam);

    }
}
