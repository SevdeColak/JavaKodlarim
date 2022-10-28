import  java.util.Scanner;

public class Main{
//Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik Ortalama Hesaplama
  public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);

      int mat, fizik, kimya, turkce, tarih, muzik;
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

      System.out.print("Tarih notunuzu girin: ");
        tarih = inp.nextInt();

      System.out.print("Muzik notunuzu girin: ");
        muzik = inp.nextInt();

      ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6;

      System.out.print("Ortalamaniz: " + ortalama);

      kontrol = ortalama > 60 ? "Sinifi Gecti" : "  Sinifta Kaldi";

      System.out.print(kontrol);




    }
}
