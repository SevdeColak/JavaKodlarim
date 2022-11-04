import  java.util.Scanner;

public class Main{
//Girilen üç  sayıyı büyükten küçüğe sıralayan program.
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int sayi1, sayi2, sayi3, durak;

      System.out.print("1. Sayi: ");
        sayi1 = inp.nextInt();
      System.out.print("2. Sayi: ");
        sayi2 = inp.nextInt();
      System.out.print("3. Sayi: ");
        sayi3 = inp.nextInt();

      if(sayi1 < sayi2 && sayi1 < sayi3){
        if(sayi2<sayi3){System.out.println(sayi1 + " < " + sayi2 + " < " + sayi3);}
        else {System.out.println(sayi1 + " < " + sayi3 + " < " + sayi2);}
      }

      else if(sayi2 < sayi1 && sayi2 < sayi3){
        if(sayi1<sayi3){System.out.println(sayi2 + " < " + sayi1 + " < " + sayi3);}
        else {System.out.println(sayi2 + " < " + sayi3 + " < " + sayi1);}
      }


      else if(sayi3 < sayi2 && sayi3 < sayi1){
        if(sayi1<sayi2){System.out.println(sayi3 + " < " + sayi1 + " < " + sayi2);}
        else {System.out.println(sayi3 + " < " + sayi2 + " < " + sayi1);}
      }

      else{System.out.println(sayi3 + " = " + sayi2 + " = " + sayi1);}
    }
}
