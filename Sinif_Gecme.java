import  java.util.Scanner;

public class Main{
//Matematik, Fizik, Kimya, Türkçe, Müzik Ortalama Hesaplama
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int mat, fizik, kimya, turkce, muzik, bolen = 5;
      double ortalama;
      String kontrol;

      System.out.print("Matematik notunuzu girin: ");
        mat = inp.nextInt();

      System.out.print("Fizik notunuzu girin: ");
        fizik = inp.nextInt();

      System.out.print("Kimya notunuzu girin: ");
        kimya = inp.nextInt();

      System.out.print("Turkce notunuzu girin: ");
        turkce = inp.nextInt();

      System.out.print("Muzik notunuzu girin: ");
        muzik = inp.nextInt();

      if(mat<0 || mat>100){
        mat = 0;
        bolen--;
      }
      if(fizik<0 || fizik>100){
        fizik = 0;
        bolen--;
      }
      if(kimya<0 || kimya>100){
        kimya = 0;
        bolen--;
      }
      if(turkce<0 || turkce>100){
        turkce = 0;
        bolen--;
      }
      if(muzik<0 || muzik>100){
        muzik = 0;
        bolen--;
      }

      ortalama = (mat + fizik + kimya + turkce + muzik)/bolen;

      System.out.println("Ortalamaniz: " + ortalama);

      kontrol = ortalama > 55 ? "Sinifi Gectiniz :D" : "  Sinifta Kaldiniz! Gecmis olsun :)";

      System.out.print(kontrol);




    }
}
