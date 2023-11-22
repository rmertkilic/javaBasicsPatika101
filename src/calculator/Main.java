package calculator;
import java.util.Scanner;

public class Main {
	public static void main (String[]args) {
		short secim;
		float a, b;
		float sonuc=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("Yapılacak işlemi seçiniz: \n 1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
		secim=inp.nextShort();
		System.out.println("İlk sayı: ");
		a=inp.nextFloat();
		System.out.println("ikinci sayı: ");
		b=inp.nextFloat();
		
		//hesaplama kısmı:
		
	 switch(secim) {
	 case 1:
		 sonuc=a+b;
		 break;
	 case 2:
		 sonuc=a-b;
		 break;
	 case 3:
		 sonuc=a*b;
		 break;
	 case 4:
		 sonuc=a/b;
		 break;
	default:
		System.out.println("Yanlış değer girdiniz lütfen 1 ile 4 arası bir değer giriniz");
		break;
		
		 
	 }
		System.out.println("sonuç: "+sonuc);
		
		
	}

}
