package siralama;
import java.util.Scanner;

public class Sayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("1. sayıyı girin: ");
        int a = inp.nextInt();
        System.out.print("2. sayıyı girin: ");
        int b = inp.nextInt();
        System.out.print("3. sayıyı girin: ");
        int c = inp.nextInt();

        int x, y, z; // küçük orta büyük

        if (a <= b && a <= c) {
            x = a;
            if (b <= c) {
                y = b;
                z = c;
            } else {
                y = c;
                z = b;
            }
        } else if (b <= a && b <= c) {
            x = b;
            if (a <= c) {
                y = a;
                z = c;
            } else {
                y = c;
                z = a;
            }
        } else {
            x = c;
            if (a <= b) {
                y = a;
                z = b;
            } else {
                y = b;
                z = a;
            }
        }

        System.out.println("Küçükten büyüğe sıralama: " + x + ", " + y + ", " + z);
    }
}