package ucak;
import java.util.Scanner;

public class Mesafe {
	public static void main(String[]args) {
		
	short secim; int yas; double km;
	double fiyat, indirim=0;
	
	

	Scanner inp=new Scanner(System.in);
	System.out.println("yaş: ");
	yas=inp.nextInt();
	if (yas<1)System.out.println("maşallah, lütfen yaşını düzgün gir knk");
	else {
	System.out.println("km: ");
	km=inp.nextDouble();
	System.out.println("tek yön için 1 gidiş geliş 2'ye bas : ");
	secim=inp.nextShort();
	if (!(secim==1||secim==2))
	{
		System.out.println("yanlış seçim ");
	}
	else {
		
		fiyat=km*0.10;
	//indirimler-------------------
		
		if(yas<12)
			indirim+=(fiyat*50/100);
		if (yas>=12 && yas<24)
			indirim+=(fiyat*10/100);
		if(yas>=65)
			indirim+=(fiyat*30/100);
		if(secim==2)
			indirim+=(fiyat*20/100);
		
	double sonfiyat=fiyat-indirim;
	System.out.print("indirimsiz fiyat: "+fiyat  +"\nödemeniz gereken fiyat: "+sonfiyat);
			
		
	}	
	}
	}

}
