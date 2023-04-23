import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Lütfen müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double average = (mat + fizik + turkce + kimya + muzik) / 5;

        if (average < 55 && average >= 0) {
            System.out.println("Maalesef sınıfı geçemediniz.");
            System.out.print("Not ortalamanız: " + average);
        }
        else if (average >= 55 && average <= 100) {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
            System.out.print("Not ortalamanız: " + average);
        }
        else {
            System.out.println("ERROR!");
        }
    }
}

// Dersler: Matematik, Fizik, Türkçe, Kimya, Müzik
//
// Geçme Notu : 55
//
// Ödev:
// Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.