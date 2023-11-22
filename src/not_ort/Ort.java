package not_ort;
import java.util.Scanner;

public class Ort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int matematik, muzik, turkce, kimya, fizik;
        int dersSayisi = 0;
        int toplamNot = 0;

        System.out.println("5 ders için sırasıyla not giriniz: \n matematik, müzik, turkce, kimya, fizik");
        matematik = inp.nextInt();
        muzik = inp.nextInt();
        turkce = inp.nextInt();
        kimya = inp.nextInt();
        fizik = inp.nextInt();

        if (matematik >= 0 && matematik <= 100 &&
            muzik >= 0 && muzik <= 100 &&
            turkce >= 0 && turkce <= 100 &&
            kimya >= 0 && kimya <= 100 &&
            fizik >= 0 && fizik <= 100) {
            
            toplamNot = matematik + muzik + turkce + kimya + fizik;
            dersSayisi = 5;
            
            double ortalama = (double) toplamNot / dersSayisi;
            System.out.println("Not Ortalaması: " + ortalama);
        } else {
            System.out.println("Geçerli not girilmedi.");
        }
    }
}