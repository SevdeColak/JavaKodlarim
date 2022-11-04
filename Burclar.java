import  java.util.Scanner;

public class Main{
//Burcunuzu bulan program.
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int ay, gun;

      System.out.print("Dogdugunuz gun: ");
        gun = inp.nextInt();
      System.out.print("Dogdugunuz ay: ");
        ay = inp.nextInt();



      if(ay == 1 && (gun > 0 && gun <= 31)){
        if(gun <= 21){System.out.println("Oglak Burcusunuz.");}
        else {System.out.println("Kova Burcusunuz.");}
      }

      else if(ay == 2 && (gun > 0 && gun <= 28)){
        if(gun <= 19){System.out.println("Kova Burcusunuz.");}
        else {System.out.println("Balik Burcusunuz.");}
      }

      else if(ay == 3 && (gun > 0 && gun <= 31)){
        if(gun <= 20){System.out.println("Balik Burcusunuz.");}
        else {System.out.println("Koc Burcusunuz.");}
      }

      else if(ay == 4 && (gun > 0 && gun <= 30)){
        if(gun <= 20){System.out.println("Koc Burcusunuz.");}
        else {System.out.println("Boga Burcusunuz.");}
      }

      else if(ay == 5 && (gun > 0 && gun <= 31)){
        if(gun <= 21){System.out.println("Boga Burcusunuz.");}
        else {System.out.println("Ikizler Burcusunuz.");}
      }

      else if(ay == 6 && (gun > 0 && gun <= 30)){
        if(gun <= 22){System.out.println("Ikizler Burcusunuz.");}
        else {System.out.println("Yengec Burcusunuz.");}
      }

      else if(ay == 7 && (gun > 0 && gun <= 31)){
        if(gun <= 22){System.out.println("Yengec Burcusunuz.");}
        else {System.out.println("Aslan Burcusunuz.");}
      }

      else if(ay == 8 && (gun > 0 && gun <= 31)){
        if(gun <= 22){System.out.println("Aslan Burcusunuz.");}
        else {System.out.println("Basak Burcusunuz.");}
      }

      else if(ay == 9 && (gun > 0 && gun <= 30)){
        if(gun <= 22){System.out.println("Basak Burcusunuz.");}
        else {System.out.println("Terazi Burcusunuz.");}
      }

      else if(ay == 10 && (gun > 0 && gun <= 31)){
        if(gun <= 22){System.out.println("Terazi Burcusunuz.");}
        else {System.out.println("Akrep Burcusunuz.");}
      }

      else if(ay == 11 && (gun > 0 && gun <= 30)){
        if(gun <= 21){System.out.println("Akrep Burcusunuz.");}
        else {System.out.println("Yay Burcusunuz.");}
      }

      else if(ay == 12 && (gun > 0 && gun <= 31)){
        if(gun <= 21){System.out.println("Yay Burcusunuz.");}
        else {System.out.println("Oglak Burcusunuz.");}
      }

      else{System.out.println("Dogdugunuz ay veya gun gecersiz. Kontrol edip tekrar deneyiniz.");}

    }
}
